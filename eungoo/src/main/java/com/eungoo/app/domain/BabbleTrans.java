package com.eungoo.app.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BABBLE_TRANS")
public class BabbleTrans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "seq")
	private int seq;

	@Column(name = "text")
	private String text;

	@Column(name = "reg_date")
	private Date regDate;

	public Date getRegDate() {
		return regDate == null ? null : (Date) regDate.clone();
	}

	public void setRegDate(Date regDate) {
		this.regDate = (regDate == null) ? null : (Date) regDate.clone();
	}

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
}
