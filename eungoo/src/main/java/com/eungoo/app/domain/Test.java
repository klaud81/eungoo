package com.eungoo.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_TABLE")
public class Test {
	@Id
	@GeneratedValue
	@Column(name = "SEQ")
	private int seq;

	@Column(name = "NAME")
	private String name;

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

}
