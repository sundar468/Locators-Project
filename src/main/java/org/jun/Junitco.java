package org.jun;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Junitco extends Baseclass{
	
	@BeforeClass
	public static void launch() {
		launchbrowser();
		max();
	}
	
	@Before
	public void dateandtime() {
		Date m = new Date();
		System.out.println(m);

	}
	@After
	public void processing() {
		Date n = new Date();
		System.out.println(n);
	}
	@Test
	public void test1() {
	get("https://www.flipkart.com/");

	}
	@Test
	public void test2() {
		get("https://www.facebook.com/");
		String u = url();
		String t = title();
		FacebookPojo m = new FacebookPojo();
		passkey(m.getEmail(), "6379321053");
		Assert.assertTrue("check your title", t.contains("Facebook"));
		Assert.assertEquals("check your url", u, u.contains("facebook"));
		


	}
	@Test
	public void test3() {
	
		get("https://www.snapdeal.com/");
	}
	
	@AfterClass
	public static void close() {
		clo();
	}
	
	
}
