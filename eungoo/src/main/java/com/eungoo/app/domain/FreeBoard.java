package com.eungoo.app.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FREE_BOARD")
public class FreeBoard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "seq")
	private int seq;

	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;

	@Column(name = "insertUser")
	private String insertUser;
	@Column(name = "updateUser")
	private String updateUser;

	@Column(name = "insertDate")
	private Date insertDate;
	@Column(name = "updateDate")
	private Date updateDate;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getInsertDate() {
		return insertDate == null ? null : (Date)insertDate.clone();
		//return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = (insertDate == null) ? null : (Date)insertDate.clone();
		//this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate == null ? null : (Date)updateDate.clone();
		//return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = (updateDate == null) ? null : (Date)updateDate.clone();
		//this.updateDate = updateDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
