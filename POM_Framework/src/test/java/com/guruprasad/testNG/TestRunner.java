package com.guruprasad.testNG;

import org.testng.annotations.Test;
import com.guruprasad.baseTest.BaseTest;
import com.guruprasad.helper.SoftAsserts;
import com.guruprasad.pages.ActitimeLoginPage;

public class TestRunner extends BaseTest{
	
	@Test
	public void m1() {
		System.out.println("m1");
		new SoftAsserts().performSoftAssert(true, true);
	}
	
	@Test
	public void m2() {
		System.out.println("m2");
		new SoftAsserts().performSoftAssert(true, true);
	}
}
