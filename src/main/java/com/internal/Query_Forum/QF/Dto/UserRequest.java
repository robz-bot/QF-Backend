/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

import java.time.Instant;

/**
 * @author Robin
 *
 */
public class UserRequest {
	private Long id;
	private String userName;
	private String email;
	private Instant updatedOn;
	
	private String organization;
	private String designation;
	private String phoneNumber;
	private String Gender;
	private String location;
	private String skills;
	private String linkedIn;
	private String github;
	
	private String message;
	private boolean success;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Instant getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}
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
	@Override
	public String toString() {
		return "UserRequest [id=" + id + ", userName=" + userName + ", email=" + email + ", updatedOn=" + updatedOn
				+ ", organization=" + organization + ", designation=" + designation + ", phoneNumber=" + phoneNumber
				+ ", Gender=" + Gender + ", location=" + location + ", skills=" + skills + ", linkedIn=" + linkedIn
				+ ", github=" + github + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
