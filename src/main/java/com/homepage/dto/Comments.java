package com.homepage.dto;

import java.sql.Date;


public class Comments {
	private int commentNo;
	private int commentRating;
	private String userId;
	private String commentContent;
	private String musicalTitle;
	private Date regDate;
	
	public Comments() {
		super();
	}

	public Comments(int commentNo, int commentRating, String userId, String commentContent, String musicalTitle,
			Date regDate) {
		super();
		this.commentNo = commentNo;
		this.commentRating = commentRating;
		this.userId = userId;
		this.commentContent = commentContent;
		this.musicalTitle = musicalTitle;
		this.regDate = regDate;
	}
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public int getCommentRating() {
		return commentRating;
	}
	public void setCommentRating(int commentRating) {
		this.commentRating = commentRating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getMusicalTitle() {
		return musicalTitle;
	}
	public void setMusicalTitle(String musicalTitle) {
		this.musicalTitle = musicalTitle;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Comments [commentNo=" + commentNo + ", commentRating=" + commentRating + ", userId=" + userId
				+ ", commentContent=" + commentContent + ", musicalTitle=" + musicalTitle + ", regDate=" + regDate
				+ "]";
	}
	
	
}