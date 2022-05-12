/**
 * 
 */
package com.internal.Query_Forum.QF.Service;

import java.util.List;

import com.internal.Query_Forum.QF.Dto.CommentRequest;

/**
 * @author ROBIN RAJESH
 *
 */
public interface CommentService{

	CommentRequest newComment(CommentRequest commentRequest);

	List<CommentRequest> getAllComments();

	CommentRequest getComment(Long id);

	CommentRequest deleteComment(Long id);

	List<CommentRequest> getCommentsByPostId(Long postId);

	
}
