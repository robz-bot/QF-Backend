/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

import com.internal.Query_Forum.QF.Entity.VoteType;

/**
 * @author ROBIN RAJESH
 *
 */
public class VoteRequest {
	private Long id;
	private VoteType voteType;
	private Long postId;
	private Long userId;
	private Long likedVoteCount;
	private Long disLikedVoteCount;
	
	private boolean success;
	private String message;
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
	 * @return the voteType
	 */
	public VoteType getVoteType() {
		return voteType;
	}
	/**
	 * @param voteType the voteType to set
	 */
	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
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
		return "VoteRequest [id=" + id + ", voteType=" + voteType + ", postId=" + postId + ", userId=" + userId
				+ ", success=" + success + ", message=" + message + "]";
	}
	public Long getLikedVoteCount() {
		return likedVoteCount;
	}
	public void setLikedVoteCount(Long likedVoteCount) {
		this.likedVoteCount = likedVoteCount;
	}
	public Long getDisLikedVoteCount() {
		return disLikedVoteCount;
	}
	public void setDisLikedVoteCount(Long disLikedVoteCount) {
		this.disLikedVoteCount = disLikedVoteCount;
	}
	
	

}
