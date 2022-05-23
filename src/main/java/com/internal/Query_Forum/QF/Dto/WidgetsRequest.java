/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

/**
 * @author Robin
 *
 */
public class WidgetsRequest {

	private int postCount;
	private int commentCount;
	private int reportCount;
	private int reportTypeCount;
	private int activeUserCount;
	private int inactiveUserCount;
	private int likeCount;
	private int dislikeCount;
	
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
	public int getReportCount() {
		return reportCount;
	}
	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}
	public int getActiveUserCount() {
		return activeUserCount;
	}
	public void setActiveUserCount(int activeUserCount) {
		this.activeUserCount = activeUserCount;
	}
	public int getInactiveUserCount() {
		return inactiveUserCount;
	}
	public void setInactiveUserCount(int inactiveUserCount) {
		this.inactiveUserCount = inactiveUserCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getDislikeCount() {
		return dislikeCount;
	}
	public void setDislikeCount(int dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getReportTypeCount() {
		return reportTypeCount;
	}
	public void setReportTypeCount(int reportTypeCount) {
		this.reportTypeCount = reportTypeCount;
	}
	
	
	
}
