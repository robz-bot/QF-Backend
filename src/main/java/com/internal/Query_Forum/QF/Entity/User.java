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

@Document(collection = "User")
public class User {
	@Transient
    public static final String SEQUENCE_NAME = "user";
	@Id
	@NotNull(message = "Id must not be null")
	private Long id;
	@NotNull(message = "User Name must not be null")
	private String userName;
	@NotNull(message = "Email must not be null")
	private String email;
	@NotNull(message = "Password must not be null")
	private String password;
	private Instant createdOn;
	private Instant updatedOn;
	private boolean isActive;
	
	private String organization;
	private String designation;
	private String phoneNumber;
	private String Gender;
	private String location;
	private String skills;
	private String linkedIn;
	private String github;
	

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", isActive=" + isActive + "]";
	}

	public User(@NotNull(message = "Id must not be null") Long id,
			@NotNull(message = "User Name must not be null") String userName,
			@NotNull(message = "Email must not be null") String email,
			@NotNull(message = "Password must not be null") String password, Instant createdOn, Instant updatedOn,
			boolean isActive) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
