package com.eungoo.app.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "seq")
	private int seq;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private int price;

	@Column(name = "reg_date")
	private Date regDate;

	public Date getRegDate() {
		return regDate == null ? null : (Date)regDate.clone();
	}

	public void setRegDate(Date regDate) {
		this.regDate = (regDate == null) ? null : (Date)regDate.clone();
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
