package com.eungoo.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.repository.BabbleRepository;
import com.eungoo.app.service.BabbleService;

@Service
@Transactional
public class BabbleServiceImpl implements BabbleService {

	@Autowired
	BabbleRepository babbleRepository;

	@Override
	public void add(BabbleTrans babbleTrans) {
		babbleRepository.add(babbleTrans);
	}

	@Override
	public void update(BabbleTrans babbleTrans) {
		babbleRepository.update(babbleTrans);
	}

	@Override
	public BabbleTrans get(int seq) {
		return babbleRepository.get(seq);
	}

	@Override
	public List<BabbleTrans> list() {
		return babbleRepository.list();
	}

	@Override
	public void delete(int seq) {
		babbleRepository.delete(seq);
	}

	@Override
	public BabbleTrans getTrans() {
		List<BabbleTrans> returnList = babbleRepository.list();
		Collections.shuffle(returnList);
		return (returnList.size() == 0) ? new BabbleTrans() : returnList.get(0);
	}
}
