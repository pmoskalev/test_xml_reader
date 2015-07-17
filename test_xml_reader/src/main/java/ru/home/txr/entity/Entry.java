package ru.home.txr.entity;

import java.util.Date;

public class Entry {
	
	private String content;
	private Date creationDate;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
