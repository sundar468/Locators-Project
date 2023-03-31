package org.jun;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SiteGmail extends Baseclass{
	@BeforeClass
	public static void launch() {
		launchbrowser();
		
	}
	@Test
	public void test1() {
		get("https://mail.google.com/mail/");
		String u = url();
		String t = title();
		Assert.assertTrue("Check your title", t.contains("Gmail"));
		Assert.assertEquals("Check your url", t, t.contains("gmail"));
	}
}
