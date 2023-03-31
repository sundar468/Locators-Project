package org.jun;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSites extends Baseclass {
	
	@BeforeClass
	public static void launch() {
		launchbrowser();
		max();

	}
	
	@Test
	public void test1() {
		get("https://mail.google.com/mail/");

	}
	@Test
	public void test2() {
		get("https://www.facebook.com/");

	}
	@Test
	public void test3() {
		get("https://inmakes.com/");

	}
	@Test
	public void test4() {
		get("https://www.youtube.com/");

	}
	
	@AfterClass
	public static void closecurrent() {
		driver.quit();
	}
	
}
