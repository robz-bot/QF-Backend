/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.Common;
import com.internal.Query_Forum.QF.SequenceGenerator;
import com.internal.Query_Forum.QF.Dto.PostRequest;
import com.internal.Query_Forum.QF.Dto.SearchRequest;
import com.internal.Query_Forum.QF.Entity.Post;
import com.internal.Query_Forum.QF.Entity.User;
import com.internal.Query_Forum.QF.Entity.Vote;
import com.internal.Query_Forum.QF.Entity.VoteType;
import com.internal.Query_Forum.QF.Repository.CommentRepository;
import com.internal.Query_Forum.QF.Repository.PostRepository;
import com.internal.Query_Forum.QF.Repository.ReportRepository;
import com.internal.Query_Forum.QF.Repository.UserRepository;
import com.internal.Query_Forum.QF.Repository.VoteRepository;
import com.internal.Query_Forum.QF.Service.PostService;

/**
 * @author ROBIN RAJESH
 *
 */
@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	VoteRepository voteRepository;

	@Autowired
	CommentRepository commentRepository;

	@Autowired
	ReportRepository reportRepository;

	@Autowired
	SequenceGenerator sequenceGenerator;

	@Override
	public PostRequest newPost(PostRequest postRequest) {
		// Creating new post
		// n-post 1-user
		PostRequest resultDto = new PostRequest();
		Post post = new Post();
		post.setCreatedOn(Instant.now());
		post.setDescription(postRequest.getDescription());
		post.setUpdatedOn(Instant.now());
		post.setId(sequenceGenerator.generateSequence("post"));
		post.setUserId(postRequest.getUserId());
		post.setVoteCount(0);

		postRepository.save(post);
		resultDto.setDisLikedVoteCount(0L);
		resultDto.setLikedVoteCount(0L);
		resultDto.setMessage("Posted Successfully");
		resultDto.setSuccess(true);

		return resultDto;
	}

	@Override
	public PostRequest updatePost(PostRequest postRequest) {
		// Updating existing post
		PostRequest resultDto = new PostRequest();
		Post post = postRepository.findById(postRequest.getId()).orElse(null);

		if (post != null) {
			post.setCreatedOn(postRequest.getCreatedOn());
			post.setDescription(postRequest.getDescription());
			post.setUpdatedOn(Instant.now());
			post.setUserId(postRequest.getUserId());
			post.setVoteCount(0);

			postRepository.save(post);
			resultDto.setMessage("Post Updated Successfully");
			resultDto.setSuccess(true);
		} else {
			resultDto.setMessage("Post Not Exits");
			resultDto.setSuccess(false);
		}
		return resultDto;
	}

	@Override
	public List<PostRequest> getAllPost() {
		// Get all posts
		List<Post> list = postRepository.findAll();
		List<PostRequest> resultDto = new ArrayList<PostRequest>();

		for (Post post : list) {
			resultDto.add(post(post));
		}
		return resultDto;
	}

	private PostRequest post(Post post, Long id) {
		// Get all posts by user id who likes the post
		PrettyTime prettyTime = new PrettyTime();
		PostRequest res = new PostRequest();
		User getUser = userRepository.findById(post.getUserId()).orElse(null);
		if (getUser != null) {
			res.setUserName(getUser.getUserName());
		}

		res.setCreatedOn(post.getCreatedOn());
		res.setDescription(post.getDescription());
		res.setId(post.getId());
		res.setUpdatedOn(post.getUpdatedOn());
		res.setUserId(post.getUserId());
		res.setVoteCount(post.getVoteCount());
		res.setCreatedTimeAgo(prettyTime.format(post.getCreatedOn()));
		res.setCreatedTimeAgo(prettyTime.format(post.getUpdatedOn()));

		int commentCount = commentRepository.findAllByPostId(post.getId()).size();

		if (commentCount > 0) {
			res.setCommentCount(commentCount);
		} else {
			res.setCommentCount(0);
		}

		int reportCount = reportRepository.findAllByPostId(post.getId()).size();

		if (reportCount > 0) {
			res.setReportCount(reportCount);
		} else {
			res.setReportCount(0);
		}

		Vote getVoteByUser = voteRepository.findByPostIdAndUserId(post.getId(), id);

		if (post.getUserLikedIds() != null) {
			if (getVoteByUser != null) {
				if (getVoteByUser.getVoteType().equals(VoteType.UPVOTE)) {
					res.setUserLiked(true);
					res.setUserDisLiked(false);
				} else {
					res.setUserLiked(false);
					res.setUserDisLiked(true);
				}
			}
		} else {
			res.setUserLiked(false);
			res.setUserDisLiked(false);
		}

		List<Vote> getAllVotes = voteRepository.findByPostId(post.getId());
		Long getLikedVotesCount = 0L;
		Long getDisLikedVotesCount = 0L;
		if (getAllVotes.size() > 0) {
			for (Vote vote : getAllVotes) {
				if (vote.getVoteType().toString().equals(Common.VOTETYPE_UP)) {
					getLikedVotesCount++;
				} else {
					getDisLikedVotesCount++;
				}
			}
		}

		res.setLikedVoteCount(getLikedVotesCount);
		res.setDisLikedVoteCount(getDisLikedVotesCount);

		return res;
	}

	private PostRequest post(Post post) {
		PrettyTime prettyTime = new PrettyTime();
		PostRequest res = new PostRequest();
		User getUser = userRepository.findById(post.getUserId()).orElse(null);
		if (getUser != null) {
			res.setUserName(getUser.getUserName());
		}

		res.setCreatedOn(post.getCreatedOn());
		res.setDescription(post.getDescription());
		res.setId(post.getId());
		res.setUpdatedOn(post.getUpdatedOn());
		res.setUserId(post.getUserId());
		res.setVoteCount(post.getVoteCount());
		res.setCreatedTimeAgo(prettyTime.format(post.getCreatedOn()));
		res.setCreatedTimeAgo(prettyTime.format(post.getUpdatedOn()));
		;
		return res;
	}

	@Override
	public PostRequest getPost(Long id) {
		PostRequest resultDto = new PostRequest();
		Post getPostById = postRepository.findById(id).orElse(null);
		if (getPostById == null) {
			resultDto.setMessage("Post Not Found");
			resultDto.setSuccess(false);
		} else {
			resultDto.setCreatedOn(getPostById.getCreatedOn());
			resultDto.setUpdatedOn(getPostById.getUpdatedOn());
			resultDto.setDescription(getPostById.getDescription());
			resultDto.setId(getPostById.getId());
			resultDto.setUserId(getPostById.getUserId());
			resultDto.setVoteCount(getPostById.getVoteCount());
			resultDto.setMessage("Post Fetched Successfully");
			resultDto.setSuccess(true);
		}
		return resultDto;
	}

	@Override
	public PostRequest deletePost(Long id) {
		PostRequest resultDto = new PostRequest();
		Post getPostById = postRepository.findById(id).orElse(null);
		if (getPostById == null) {
			resultDto.setMessage("Post Not Found");
			resultDto.setSuccess(false);
		} else {

			postRepository.deleteById(id);
			resultDto.setMessage("Post Deleted Successfully");
			resultDto.setSuccess(true);
		}
		return resultDto;
	}

	@Override
	public List<PostRequest> getUserPostList(Long id) {
		List<Post> postsByUserId = postRepository.findAllByUserId(id);
		List<PostRequest> resultDto = new ArrayList<PostRequest>();

		for (Post post : postsByUserId) {
			resultDto.add(post(post));
		}
		return resultDto;
	}

	@Override
	public List<PostRequest> allPostByUserId(Long id, String type) {
		List<Post> list = new ArrayList<Post>();
		if (type.equals("ASC")) {
			list = postRepository.findAllByOrderByCreatedOnAsc();
		} else if (type.equals("DESC")) {
			list = postRepository.findAllByOrderByCreatedOnDesc();
		}
		List<PostRequest> resultDto = new ArrayList<PostRequest>();

		if (list.size() > 0) {
			for (Post post : list) {
				resultDto.add(post(post, id));
			}
		}

		return resultDto;
	}

	@Override
	public List<PostRequest> getSearchPostDate(String date) {
		List<PostRequest> resultDto = new ArrayList<PostRequest>();
		List<Post> list = postRepository.findAll();
		if (list != null) {
			for (Post post : list) {
				if (post.getCreatedOn().toString().split("T")[0].equals(date)) {
					resultDto.add(post(post));
				}
			}
		}

		return resultDto;
	}

}
