package com.eungoo.app.repository;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.eungoo.app.domain.BabbleTrans;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Transactional
public class BabbleRepositoryTest {
	@Autowired
	BabbleRepository babbleRepository;

	private BabbleTrans babbleTrans;

	private List<BabbleTrans> returnList;

	@Before
	public void setUp() throws Exception {
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		babbleTrans = new BabbleTrans();

		returnList = babbleRepository.list();
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
		assertThat(babbleRepository.get(returnList.get(0).getSeq()).getText(), is("test"));
	}

	@Test
	public void testDelete() throws Exception {
		assertThat(returnList.size(), is(6));
		babbleRepository.delete(returnList.get(0).getSeq());
		assertThat(babbleRepository.list().size(), is(5));
	}

	@Test
	public void testUpdate() throws Exception {
		babbleRepository.clearSession();
		Date currentDate = new Date();
		babbleTrans.setSeq(returnList.get(0).getSeq());
		babbleTrans.setRegDate(currentDate);
		babbleTrans.setText("testUpdate");
		babbleRepository.update(babbleTrans);
		BabbleTrans returnTrans = babbleRepository.get(returnList.get(0).getSeq());
		assertThat(returnTrans.getText(), is("testUpdate"));
		assertThat(returnTrans.getRegDate(), is(currentDate));
	}

	@Test
	public void testAdd() throws Exception {
		babbleTrans.setRegDate(new Date());
		babbleTrans.setText("test");
		babbleRepository.add(babbleTrans);
		assertThat(babbleRepository.list().size(), is(7));
	}
}
