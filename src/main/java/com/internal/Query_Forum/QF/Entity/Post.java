/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import java.time.Instant;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ROBIN RAJESH
 *
 */

@Document(collection = "Post")
public class Post {
	@Transient
    public static final String SEQUENCE_NAME = "post";
	@Id
	@NotNull(message = "Id must not be null")
	private Long id;
	@NotNull(message = "Description must not be null")
	private String description;
	@NotNull(message = "Vote Count must not be null")
	private Integer voteCount;
	@NotNull(message = "User Id must not be null")
	private Long userId;
	private String userLikedIds;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the voteCount
	 */
	public Integer getVoteCount() {
		return voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
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
		return "Post [id=" + id + ", description=" + description + ", voteCount=" + voteCount + ", userId=" + userId
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	public Post(@NotNull(message = "Id must not be null") Long id,
			@NotNull(message = "Description must not be null") String description,
			@NotNull(message = "Vote Count must not be null") Integer voteCount,
			@NotNull(message = "User Id must not be null") Long userId, Instant createdOn, Instant updatedOn) {
		super();
		this.id = id;
		this.description = description;
		this.voteCount = voteCount;
		this.userId = userId;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserLikedIds() {
		return userLikedIds;
	}

	public void setUserLikedIds(String userLikedIds) {
		this.userLikedIds = userLikedIds;
	}

}
