package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.utils.JSutil;

public class Tests extends JSutil{

	@Test
	public void test1() throws InterruptedException {
		WebElement searchBox =driver().findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		for(int i=0; i<=1; i++) {
			drawBorder(searchBox);
			searchBox.click();
			Thread.sleep(1000);
		}
	}
	
}
