package com.eungoo.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.User;
import com.eungoo.app.repository.MainRepository;

@Service
@Transactional
public class MainService {
	@Autowired
	private MainRepository mainRepository;

	public User create(User user) {
		user.setRegDate(new Date());
		return mainRepository.save(user);
	}
}
 