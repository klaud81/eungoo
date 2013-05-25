package com.eungoo.app.service;

import java.util.List;

import com.eungoo.app.domain.BabbleTrans;

public interface BabbleService {
	void add(BabbleTrans babbleTrans);

	void update(BabbleTrans babbleTrans);

	BabbleTrans get(int seq);

	List<BabbleTrans> list();

	void delete(int seq);
}
