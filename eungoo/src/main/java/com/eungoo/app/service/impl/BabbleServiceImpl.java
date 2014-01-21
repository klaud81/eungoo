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
	private BabbleRepository babbleRepository;

	@Override
	public BabbleTrans getTrans() {
		List<BabbleTrans> returnList = babbleRepository.findAll();
		Collections.shuffle(returnList);
		return (returnList.size() == 0) ? new BabbleTrans() : returnList.get(0);
	}

	@Override
	public List<BabbleTrans> findAll() {
		return babbleRepository.findAll();
	}

	@Override
	public BabbleTrans create(BabbleTrans babbleTrans) {
		return babbleRepository.save(babbleTrans);
	}

	@Override
	public BabbleTrans update(BabbleTrans babbleTrans) {
		return babbleRepository.save(babbleTrans);
	}

	@Override
	public void delete(int seq) {
		babbleRepository.delete(seq);
	}

	@Override
	public BabbleTrans findOne(int seq) {
		return babbleRepository.findOne(seq);
	}
}
