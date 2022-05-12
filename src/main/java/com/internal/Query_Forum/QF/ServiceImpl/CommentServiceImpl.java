/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.SequenceGenerator;
import com.internal.Query_Forum.QF.Dto.CommentRequest;
import com.internal.Query_Forum.QF.Entity.Comment;
import com.internal.Query_Forum.QF.Entity.Post;
import com.internal.Query_Forum.QF.Entity.User;
import com.internal.Query_Forum.QF.Repository.CommentRepository;
import com.internal.Query_Forum.QF.Repository.PostRepository;
import com.internal.Query_Forum.QF.Repository.UserRepository;
import com.internal.Query_Forum.QF.Service.CommentService;

/**
 * @author ROBIN RAJESH
 *
 */
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentRepository commentRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	SequenceGenerator sequenceGenerator;

	@Autowired
	PostRepository postRepository;

	@Override
	public CommentRequest newComment(CommentRequest commentRequest) {
		CommentRequest resultDto = new CommentRequest();
		Comment comment = new Comment();
		comment.setCreatedOn(Instant.now());
		comment.setText(commentRequest.getText());
		comment.setUpdatedOn(Instant.now());
		comment.setId(sequenceGenerator.generateSequence("post"));
		comment.setPostId(commentRequest.getPostId());
		comment.setUserId(commentRequest.getUserId());
		comment.setLiked(false);

		commentRepository.save(comment);
		resultDto.setMessage("Commented Successfully");
		resultDto.setSuccess(true);

		return resultDto;
	}

	@Override
	public List<CommentRequest> getAllComments() {

		List<Comment> list = commentRepository.findAll();
		List<CommentRequest> resultDto = new ArrayList<CommentRequest>();

		for (Comment comment : list) {
			resultDto.add(comment(comment));
		}
		return resultDto;
	}

	private CommentRequest comment(Comment comment) {
		CommentRequest res = new CommentRequest();
		User getUser = userRepository.findById(comment.getUserId()).orElse(null);
		if (getUser != null) {
			res.setUserName(getUser.getUserName());
		}
		Post getPost = postRepository.findById(comment.getPostId()).orElse(null);
		if (getPost != null) {
			res.setPost(getPost.getDescription());
		}

		res.setCreatedOn(comment.getCreatedOn());
		res.setText(comment.getText());
		res.setId(comment.getId());
		res.setPostId(comment.getPostId());
		res.setUpdatedOn(comment.getUpdatedOn());
		res.setUserId(comment.getUserId());
		res.setLiked(comment.isLiked());
		return res;
	}

	@Override
	public CommentRequest getComment(Long id) {
		CommentRequest resultDto = new CommentRequest();
		Comment getCommentById = commentRepository.findById(id).orElse(null);
		if (getCommentById == null) {
			resultDto.setMessage("Comment Not Found");
			resultDto.setSuccess(false);
		} else {
			resultDto.setCreatedOn(getCommentById.getCreatedOn());
			resultDto.setUpdatedOn(getCommentById.getUpdatedOn());
			resultDto.setText(getCommentById.getText());
			resultDto.setId(getCommentById.getId());
			resultDto.setUserId(getCommentById.getUserId());
			resultDto.setLiked(getCommentById.isLiked());
			resultDto.setMessage("Comment Fetched Successfully");
			resultDto.setSuccess(true);
		}
		return resultDto;
	}

	@Override
	public CommentRequest deleteComment(Long id) {
		CommentRequest resultDto = new CommentRequest();
		Comment getCommentById = commentRepository.findById(id).orElse(null);
		if (getCommentById == null) {
			resultDto.setMessage("Comment Not Found");
			resultDto.setSuccess(false);
		} else {

			commentRepository.deleteById(id);
			resultDto.setMessage("Comment Deleted Successfully");
			resultDto.setSuccess(true);
		}
		return resultDto;
	}

	@Override
	public List<CommentRequest> getCommentsByPostId(Long postId) {
		List<CommentRequest> resultDto = new ArrayList<CommentRequest>();
		List<Comment> getCommentsByPostId = commentRepository.findAllByPostId(postId);
		for (Comment comment : getCommentsByPostId) {
			resultDto.add(comment(comment));
		}
		return resultDto;
	}

}
