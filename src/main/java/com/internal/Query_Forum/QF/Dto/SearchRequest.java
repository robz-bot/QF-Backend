/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

/**
 * @author Robin
 *
 */
public class SearchRequest {

	private boolean all;
	private boolean recentPost;
	private boolean highPost;
	private Long allCount;
	private int recentPostCount;
	private int highPostCount;
	private String message;
	private boolean success;
	public boolean isAll() {
		return all;
	}
	public void setAll(boolean all) {
		this.all = all;
	}
	public boolean isRecentPost() {
		return recentPost;
	}
	public void setRecentPost(boolean recentPost) {
		this.recentPost = recentPost;
	}
	public boolean isHighPost() {
		return highPost;
	}
	public void setHighPost(boolean highPost) {
		this.highPost = highPost;
	}
	public Long getAllCount() {
		return allCount;
	}
	public void setAllCount(Long allCount) {
		this.allCount = allCount;
	}
	public int getRecentPostCount() {
		return recentPostCount;
	}
	public void setRecentPostCount(int recentPostCount) {
		this.recentPostCount = recentPostCount;
	}
	public int getHighPostCount() {
		return highPostCount;
	}
	public void setHighPostCount(int highPostCount) {
		this.highPostCount = highPostCount;
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
