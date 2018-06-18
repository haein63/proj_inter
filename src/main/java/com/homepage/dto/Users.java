package com.homepage.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Users {
	private String id;
	   private String password;
	   private String nickname;
	   private String email;
	   private String pic;
	   @DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd(E)")
	   private Date joinDate = new Date();
	   
	   public Users() {
	      
	   }

	   public Users(String id, String password, String nickname, String email, String pic, Date joinDate) {
	      super();
	      this.id = id;
	      this.password = password;
	      this.nickname = nickname;
	      this.email = email;
	      this.pic = pic;
	      this.joinDate = joinDate;
	   }

	   public String getId() {
	      return id;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public String getPassword() {
	      return password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getNickname() {
	      return nickname;
	   }

	   public void setNickname(String nickname) {
	      this.nickname = nickname;
	   }

	   public String getEmail() {
	      return email;
	   }

	   public void setEmail(String email) {
	      this.email = email;
	   }

	   public String getPic() {
	      return pic;
	   }

	   public void setPic(String pic) {
	      this.pic = pic;
	   }

	   public Date getJoinDate() {
	      return joinDate;
	   }

	   public void setJoinDate(Date joinDate) {
	      this.joinDate = joinDate;
	   }
}