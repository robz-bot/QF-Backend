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
@Document
public class Subscription {
	@Transient
    public static final String SEQUENCE_NAME = "subscription";
	@Id
	private Long id;
	private String communityName;
	private String description;
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
	 * @return the communityName
	 */
	public String getCommunityName() {
		return communityName;
	}

	/**
	 * @param communityName the communityName to set
	 */
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
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
		return "Subscription [id=" + id + ", communityName=" + communityName + ", description=" + description
				+ ", postId=" + postId + ", userId=" + userId + "]";
	}

	public Subscription(Long id, String communityName, String description, Long postId, Long userId) {
		super();
		this.id = id;
		this.communityName = communityName;
		this.description = description;
		this.postId = postId;
		this.userId = userId;
	}

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

}
