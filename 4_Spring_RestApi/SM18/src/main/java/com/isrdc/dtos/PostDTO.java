package com.isrdc.dtos;

public class PostDTO {
	private Integer postId;
	private Integer id;
	private String title;
	private String body;
	
	
	
	public Integer getUserId() {
		return postId;
	}
	public void setUserId(Integer postId) {
		this.postId = postId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "PostDTO [postId=" + postId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
}
