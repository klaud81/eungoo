package com.eungoo.app.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

public interface JpaService<T extends Object, ID extends Serializable> {

	public boolean exists(ID id);

	public T findOne(ID id);

	public T findOne(Predicate predicate);

	public Iterable<T> findAll();

	public Iterable<T> findAll(Sort sort);

	public Iterable<T> findAll(Predicate predicate);

	public Iterable<T> findAll(Predicate predicate, OrderSpecifier<?>[] orderSpecifiers);

	public Page<T> findAll(Pageable pageable);

	public Page<T> findAll(Predicate predicate, Pageable pageable);

	public T save(T t);

	public <S extends T> List<S> save(Iterable<S> iterable);

	public void delete(ID id);

	public void delete(T t);

	public void delete(Iterable<? extends T> iterable);

	public long count();

	public long count(Predicate predicate);
}
