package com.eungoo.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BABBLE_TRANS")
public class BabbleTrans {
	@Id
	@GeneratedValue
	@Column(name = "seq")
	private int seq;

	@Column(name = "text")
	private String text;

	@Column(name = "reg_date")
	private String regDate;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
