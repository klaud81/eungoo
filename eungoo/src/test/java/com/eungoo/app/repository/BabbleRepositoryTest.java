package com.eungoo.app.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.util.AbstractRepositoryTest;

public class BabbleRepositoryTest extends AbstractRepositoryTest {
	@Autowired
	BabbleRepository babbleRepository;

	private BabbleTrans babbleTrans;

	private List<BabbleTrans> returnList;

	@Before
	public void setUp() throws Exception {
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test1");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test2");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test3");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test4");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test5");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setText("test6");
		babbleRepository.save(babbleTrans);
		babbleTrans = new BabbleTrans();

		returnList = babbleRepository.findAll();
	}

	@Test
	public void testList() throws Exception {
		assertThat(returnList.size(), is(6));

		for (BabbleTrans babbleTrans : returnList) {
			System.out.println(babbleTrans.getText());
		}
	}

	@Test
	public void testGet() throws Exception {
		assertThat(babbleRepository.findOne(1).getText(), is("test1"));
	}

	@Test
	public void testDelete() throws Exception {
		assertThat(returnList.size(), is(6));
		babbleRepository.delete(returnList.get(0).getSeq());
		assertThat(babbleRepository.findAll().size(), is(5));
	}

	@Test
	public void testAdd() throws Exception {
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.save(babbleTrans);
		assertThat(babbleRepository.findAll().size(), is(7));
	}

	@Test
	public void testRandom() throws Exception {
		Collections.shuffle(returnList);
	}
}
