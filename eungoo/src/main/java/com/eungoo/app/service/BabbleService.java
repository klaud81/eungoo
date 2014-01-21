package com.eungoo.app.service;

import java.util.List;

import com.eungoo.app.domain.BabbleTrans;

public interface BabbleService {
	public BabbleTrans getTrans();

	public List<BabbleTrans> findAll();

	public BabbleTrans findOne(int seq);

	public BabbleTrans create(BabbleTrans babbleTrans);

	public BabbleTrans update(BabbleTrans babbleTrans);

	public void delete(int seq);
}
