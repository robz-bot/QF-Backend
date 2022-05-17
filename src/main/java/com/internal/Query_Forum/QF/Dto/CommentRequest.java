/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

import java.time.Instant;

/**
 * @author ROBIN RAJESH
 *
 */
public class CommentRequest {
	private Long id;
	private String text;
	private Long postId;
	private String post;
	private Long userId;
	private String userName;
	private boolean liked;
	private Instant createdOn;
	private Instant updatedOn;
	private boolean success;
	private String message;
	
	private String createdTimeAgo;
	private String updatedTimeAgo;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the postId
	 */
	public Long getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the liked
	 */
	public boolean isLiked() {
		return liked;
	}
	/**
	 * @param liked the liked to set
	 */
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	/**
	 * @return the createdOn
	 */
	public Instant getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the updatedOn
	 */
	public Instant getUpdatedOn() {
		return updatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "CommentRequest [id=" + id + ", text=" + text + ", postId=" + postId + ", post=" + post + ", userId="
				+ userId + ", userName=" + userName + ", liked=" + liked + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", success=" + success + ", message=" + message + "]";
	}
	public String getCreatedTimeAgo() {
		return createdTimeAgo;
	}
	public void setCreatedTimeAgo(String createdTimeAgo) {
		this.createdTimeAgo = createdTimeAgo;
	}
	public String getUpdatedTimeAgo() {
		return updatedTimeAgo;
	}
	public void setUpdatedTimeAgo(String updatedTimeAgo) {
		this.updatedTimeAgo = updatedTimeAgo;
	}
	
	
}
