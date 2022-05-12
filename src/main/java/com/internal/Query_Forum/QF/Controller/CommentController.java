/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.CommentRequest;
import com.internal.Query_Forum.QF.Service.CommentService;

/**
 * @author ROBIN RAJESH
 *
 */
@RequestMapping("api/comment")
@RestController
@CrossOrigin("*")
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/home")
	public String hello() {
		return "Hello World";
	}

	@PostMapping("/newComment")
	public CommentRequest newComment(@RequestBody CommentRequest commentRequest) {
		CommentRequest res = commentService.newComment(commentRequest);
		return res;
	}

	@GetMapping("/")
	public List<CommentRequest> allComments() {
		return commentService.getAllComments();
	}
	
	@GetMapping("/getComment/{id}")
	public CommentRequest getComment(@PathVariable String id) {
		CommentRequest res = commentService.getComment(Long.parseLong(id));
		return res;
	}
	
	@GetMapping("/getCommentsByPostId/{postId}")
	public List<CommentRequest> getCommentsByPostId(@PathVariable String postId) {
		List<CommentRequest> res = commentService.getCommentsByPostId(Long.parseLong(postId));
		return res;
	}
	
	@DeleteMapping("/deleteComment/{id}")
	public CommentRequest deletePost(@PathVariable String id) {
		CommentRequest res = commentService.deleteComment(Long.parseLong(id));
		return res;
	}
}
