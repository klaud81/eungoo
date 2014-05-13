package com.eungoo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.domain.User;

@Repository
public interface MainRepository extends JpaRepository<User, Integer>,
		QueryDslPredicateExecutor<User> {

}
