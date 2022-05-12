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

@Document(collection = "VerficationToken")
public class VerficationToken {
	@Transient
    public static final String SEQUENCE_NAME = "verify_token";
	@Id
	@NotNull(message = "Id must not be null")
	private Long id;
	private String token;
	private Long userId;
	private Instant expiryDate;

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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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
	 * @return the expiryDate
	 */
	public Instant getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Instant expiryDate) {
		this.expiryDate = expiryDate;
	}

	public VerficationToken(@NotNull(message = "Id must not be null") Long id, String token, Long userId,
			Instant expiryDate) {
		super();
		this.id = id;
		this.token = token;
		this.userId = userId;
		this.expiryDate = expiryDate;
	}

	public VerficationToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VerficationToken [id=" + id + ", token=" + token + ", userId=" + userId + ", expiryDate=" + expiryDate
				+ "]";
	}

}
