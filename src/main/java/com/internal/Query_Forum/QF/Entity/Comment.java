/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ROBIN RAJESH
 *
 */
@Document
public class Comment {
	@Transient
    public static final String SEQUENCE_NAME = "comment";

	@Id
	private Long id;
	private String text;
	private Long postId;
	private Long userId;
	private boolean liked;
	private Instant createdOn;
	private Instant updatedOn;

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

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", postId=" + postId + ", userId=" + userId + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}

	public Comment(Long id, String text, Long postId, Long userId, Instant createdOn, Instant updatedOn) {
		super();
		this.id = id;
		this.text = text;
		this.postId = postId;
		this.userId = userId;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
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

}
