package com.eungoo.app.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.eungoo.app.domain.FreeBoard;
import com.eungoo.app.util.AbstractRepositoryTest;

public class FreeBoardServiceTest extends AbstractRepositoryTest {
	@Autowired
	FreeBoardService freeBoardService;

	FreeBoard freeBoard;

	@Before
	public void setUp() throws Exception {
		freeBoard = new FreeBoard();
		freeBoard.setTitle("제목");
		freeBoard.setContent("내용");
		freeBoard.setInsertDate(new Date());
		freeBoard.setInsertUser("eungoo");
		freeBoard.setUpdateDate(new Date());
		freeBoard.setUpdateUser("eungoo");
	}

	@Test
	public void testSave() throws Exception {
		int size = freeBoardService.findAll().size();
		freeBoardService.save(freeBoard);
		freeBoardService.findAll();
		assertThat(freeBoardService.findAll().size(), is(size + 1));
	}

	@Test
	public void testSave2() throws Exception {
		int size = freeBoardService.findAll().size();
		freeBoardService.save(freeBoard);
		freeBoardService.findAll();
		assertThat(freeBoardService.findAll().size(), is(size + 1));
	}
}
