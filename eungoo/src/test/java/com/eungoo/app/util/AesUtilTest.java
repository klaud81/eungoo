package com.eungoo.app.util;

import org.junit.Before;
import org.junit.Test;

public class AesUtilTest {
	public AesUtil aesUtil;

	@Before
	public void setUp() throws Exception {
		aesUtil = new AesUtil();
	}

	@Test
	public void encodingTest() throws Exception {
		aesUtil.setSalt("60dc26ddc7604defb7e83da1eb37dc3f");
		String enc = aesUtil.Encrypt("foo");
		System.out.println(enc);
		String dec = aesUtil.Decrypt(enc);
		System.out.println(dec);
	}

}
