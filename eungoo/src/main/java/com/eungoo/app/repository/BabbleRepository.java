package com.eungoo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.eungoo.app.domain.BabbleTrans;

@Repository
public interface BabbleRepository extends JpaRepository<BabbleTrans, Integer>,
		QueryDslPredicateExecutor<BabbleTrans> {

}
