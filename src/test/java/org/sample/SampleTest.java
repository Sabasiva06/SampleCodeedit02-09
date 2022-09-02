package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Before Suite class");
	}

	@AfterSuite
	private void afterSuite() {
		System.out.println("After suite class");

	}

	@BeforeTest
	private void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	private void afterTest() {
		System.out.println("After test");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("After class");

	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("After method");

	}

	@Test
	private void tc01() {
		System.out.println("method 1");

	}

	@Test
	private void tc02() {
		System.out.println("method 2");

	}

}
