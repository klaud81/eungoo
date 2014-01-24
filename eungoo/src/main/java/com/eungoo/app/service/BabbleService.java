package com.eungoo.app.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.domain.BabbleTransPredicates;
import com.eungoo.app.repository.BabbleRepository;

@Service
@Transactional
public class BabbleService {
	@Autowired
	private BabbleRepository babbleRepository;

	public BabbleTrans getTrans() {
		List<BabbleTrans> returnList = babbleRepository.findAll();
		Collections.shuffle(returnList);
		return (returnList.size() == 0) ? new BabbleTrans() : returnList.get(0);
	}

	public List<BabbleTrans> findAll() {
		return babbleRepository.findAll();
	}

	public List<BabbleTrans> searchTrans(String searchText) {
		return (List<BabbleTrans>) babbleRepository
				.findAll(BabbleTransPredicates.textLike(searchText));
	}

	public BabbleTrans create(BabbleTrans babbleTrans) {
		return babbleRepository.save(babbleTrans);
	}

	public BabbleTrans update(BabbleTrans babbleTrans) {
		return babbleRepository.save(babbleTrans);
	}

	public void delete(int seq) {
		babbleRepository.delete(seq);
	}

	public BabbleTrans findOne(int seq) {
		return babbleRepository.findOne(seq);
	}
}
