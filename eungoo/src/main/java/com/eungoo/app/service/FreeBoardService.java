package com.eungoo.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.FreeBoard;
import com.eungoo.app.repository.FreeBoardRepository;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

@Service
@Transactional
public class FreeBoardService implements JpaService<FreeBoard, Long> {
	@Autowired
	private FreeBoardRepository repository;

	public FreeBoard save(FreeBoard freeBoard) {
		freeBoard.setInsertDate(new Date());
		freeBoard.setInsertUser("eungoo");
		return repository.save(freeBoard);
	}

	public FreeBoard modify(FreeBoard freeBoard) {
		freeBoard.setUpdateDate(new Date());
		freeBoard.setUpdateUser("eungoo");
		return repository.save(freeBoard);
	}

	@Override
	public List<FreeBoard> findAll() {
		return repository.findAll();
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FreeBoard findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FreeBoard findOne(Predicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<FreeBoard> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<FreeBoard> findAll(Predicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<FreeBoard> findAll(Predicate predicate, OrderSpecifier<?>[] orderSpecifiers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<FreeBoard> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<FreeBoard> findAll(Predicate predicate, Pageable pageable) {
		return repository.findAll(predicate, pageable);
	}

	@Override
	public <S extends FreeBoard> List<S> save(Iterable<S> iterable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(FreeBoard t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends FreeBoard> iterable) {
		// TODO Auto-generated method stub

	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long count(Predicate predicate) {
		// TODO Auto-generated method stub
		return 0;
	}
}
