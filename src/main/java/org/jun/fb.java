package org.jun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Javascript\\Driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		
		k.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		JavascriptExecutor n =(JavascriptExecutor)k;
		
		WebElement e = k.findElement(By.xpath("//input[@type='text']"));
		n.executeScript("arguments[0].setAttribute('value','6379321053')", e);
		Object txt = n.executeScript("return arguments[0].getAttribute('value')", e);
		System.out.println(txt);
		
		WebElement pa = k.findElement(By.name("pass"));
		n.executeScript("arguments[0].setAttribute('value','sundar007')", pa);
		Object txt2 = n.executeScript("return arguments[0].getAttribute('value')", pa);
		System.out.println(txt2);
		
		WebElement btn = k.findElement(By.xpath("//button[@type='submit']"));
		n.executeScript("arguments[0].click()", btn);
		
		
		
		
	}

}
