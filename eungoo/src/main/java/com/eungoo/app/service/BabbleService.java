package com.eungoo.app.service;

import java.util.List;

import com.eungoo.app.domain.BabbleTrans;

public interface BabbleService {
	BabbleTrans get(int seq);

	List<BabbleTrans> list();

	BabbleTrans getTrans();
}
