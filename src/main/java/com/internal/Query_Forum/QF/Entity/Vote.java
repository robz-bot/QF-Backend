/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ROBIN RAJESH
 *
 */
@Document(collection = "Vote")
public class Vote {
	@Transient
    public static final String SEQUENCE_NAME = "vote";
	@Id
	private Long id;
	private VoteType voteType;
	private Long postId;
	private Long userId;

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

	@Override
	public String toString() {
		return "Vote [id=" + id + ", voteType=" + voteType + ", postId=" + postId + ", userId=" + userId + "]";
	}

	public Vote(Long id, VoteType voteType, Long postId, Long userId) {
		super();
		this.id = id;
		this.voteType = voteType;
		this.postId = postId;
		this.userId = userId;
	}

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

}
