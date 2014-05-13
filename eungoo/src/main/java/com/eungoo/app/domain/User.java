package com.eungoo.app.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "name")
	private String name;
	
	@Column(name = "reg_date")
	private Date regDate;

	public Date getRegDate() {
		return regDate == null ? null : (Date)regDate.clone();
	}

	public void setRegDate(Date regDate) {
		this.regDate = (regDate == null) ? null : (Date)regDate.clone();
	}
}
