package com.eungoo.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.repository.TestRepository;
import com.eungoo.app.service.TestService;

@Service
@Transactional
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	@Override
	public void add(BabbleTrans babbleTrans) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(BabbleTrans babbleTrans) {
		// TODO Auto-generated method stub

	}

	@Override
	public BabbleTrans get(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BabbleTrans> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int seq) {
		// TODO Auto-generated method stub

	}

}
