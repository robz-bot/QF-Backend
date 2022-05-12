/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.Common;
import com.internal.Query_Forum.QF.SequenceGenerator;
import com.internal.Query_Forum.QF.Dto.VoteRequest;
import com.internal.Query_Forum.QF.Entity.Post;
import com.internal.Query_Forum.QF.Entity.Vote;
import com.internal.Query_Forum.QF.Repository.PostRepository;
import com.internal.Query_Forum.QF.Repository.VoteRepository;
import com.internal.Query_Forum.QF.Service.VoterService;

/**
 * @author ROBIN RAJESH
 *
 */
@Service
public class VoteServiceImpl implements VoterService {

	@Autowired
	VoteRepository voteRepository;
	@Autowired
	SequenceGenerator sequenceGenerator;
	@Autowired
	PostRepository postRepository;

	@Override
	public VoteRequest postLikedByUser(VoteRequest voteRequest) {
		VoteRequest resultDto = new VoteRequest();
		Vote vote = voteRepository.findByPostIdAndUserId(voteRequest.getPostId(), voteRequest.getUserId());
		Vote newVote = new Vote();

		Post getLikedUser = postRepository.findById(voteRequest.getPostId()).orElse(null);
		if (vote != null) {
			vote.setPostId(voteRequest.getPostId());
			vote.setUserId(voteRequest.getUserId());
			vote.setVoteType(voteRequest.getVoteType());
			voteRepository.save(vote);

			if (getLikedUser.getUserLikedIds() != null) {
				getLikedUser.setUserLikedIds(getLikedUser.getUserId() + "," + voteRequest.getUserId().toString());
			} else {
				getLikedUser.setUserLikedIds(voteRequest.getUserId().toString());
			}

			postRepository.save(getLikedUser);

			resultDto.setMessage("Post Liked By User - " + voteRequest.getVoteType());
			resultDto.setSuccess(true);
			return resultDto;
		}

		newVote.setId(sequenceGenerator.generateSequence("vote"));
		newVote.setPostId(voteRequest.getPostId());
		newVote.setUserId(voteRequest.getUserId());
		newVote.setVoteType(voteRequest.getVoteType());

		voteRepository.save(newVote);

		resultDto.setMessage("Post Liked By User - " + voteRequest.getVoteType());
		resultDto.setSuccess(true);

		return resultDto;
	}

}
