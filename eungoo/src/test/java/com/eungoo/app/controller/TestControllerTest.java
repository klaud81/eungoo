package com.eungoo.app.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

public class TestControllerTest {
	private TestController testController;
	private ExtendedModelMap model;

	@Before
	public void setUp() throws Exception {
		testController = new TestController();
		model = new ExtendedModelMap();
	}

	@Test
	public void testTest() throws Exception {
		assertThat(testController.test(model), is("home"));
		assertThat(model.get("message").toString(), is("Git 수정 테스트"));
	}

}
