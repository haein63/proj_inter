package com.homepage.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Musical {
	private String title;
	private String musicalPic;
	private String poster;
	private String hall;
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	private Date endDate;
	private String casting;
	
	
	@Override
	public String toString() {
		return "Musical [title=" + title + ", musicalPic=" + musicalPic + ", poster=" + poster + ", hall=" + hall
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", casting=" + casting + "]";
	}
	public Musical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Musical(String title, String musicalPic, String poster, String hall, Date startDate, Date endDate,
			String casting) {
		super();
		this.title = title;
		this.musicalPic = musicalPic;
		this.poster = poster;
		this.hall = hall;
		this.startDate = startDate;
		this.endDate = endDate;
		this.casting = casting;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMusicalPic() {
		return musicalPic;
	}
	public void setMusicalPic(String musicalPic) {
		this.musicalPic = musicalPic;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getHall() {
		return hall;
	}
	public void setHall(String hall) {
		this.hall = hall;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCasting() {
		return casting;
	}
	public void setCasting(String casting) {
		this.casting = casting;
	}
	
	

}
