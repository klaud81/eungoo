package com.eungoo.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.FreeBoard;
import com.eungoo.app.repository.FreeBoardRepository;

@Service
@Transactional
public class FreeBoardService {
	@Autowired
	private FreeBoardRepository freeBoardRepository;

	public FreeBoard save(FreeBoard freeBoard) {
		freeBoard.setInsertDate(new Date());
		freeBoard.setInsertUser("eungoo");
		return freeBoardRepository.save(freeBoard);
	}

	public FreeBoard modify(FreeBoard freeBoard) {
		freeBoard.setUpdateDate(new Date());
		freeBoard.setUpdateUser("eungoo");
		return freeBoardRepository.save(freeBoard);
	}

	public List<FreeBoard> findAll() {
		return freeBoardRepository.findAll();
	}
}
