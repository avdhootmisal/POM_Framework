package com.guruprasad.helper;

import java.util.ArrayList;

import org.testng.asserts.SoftAssert;

public class SoftAsserts {

	SoftAssert softAssert;
	
	public void performSoftAssert(boolean actualVal, boolean expVal) {
		softAssert = new SoftAssert();
		softAssert.assertEquals(actualVal, expVal);
		softAssert.assertAll();
	}
	
	public void performSoftAssert(String actualVal, String expVal) {
		softAssert = new SoftAssert();
		softAssert.assertEquals(actualVal, expVal);
		softAssert.assertAll();
	}
	
	public void performSoftAssert(int actualVal, int expVal) {
		softAssert = new SoftAssert();
		softAssert.assertEquals(actualVal, expVal);
		softAssert.assertAll();
	}
	
	public void performSoftAssert(ArrayList<Boolean> inputList1, ArrayList<Boolean> inputList2, boolean expVal) {
		softAssert = new SoftAssert();
		softAssert.assertEquals(inputList2.equals(inputList1), true);
		softAssert.assertAll();
	}
	
	public void performSoftAssertWithContains(String textToCheck, String holeString, boolean expected) {
		softAssert = new SoftAssert();
		if (holeString.contains(textToCheck))
			softAssert.assertEquals(true, expected);
		else
			softAssert.assertEquals(false, expected);
	}
}
