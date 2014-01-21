package com.eungoo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eungoo.app.domain.BabbleTrans;

public interface BabbleRepository extends JpaRepository<BabbleTrans, Integer> {

}
