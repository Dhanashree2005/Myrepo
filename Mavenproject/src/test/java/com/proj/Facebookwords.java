package com.proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookwords {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver_88.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String s= "Copyright";
		String ss= d.getPageSource();
		boolean b= ss.contains(s);
		if(b==true){
			System.out.println(s);
		}else{
			System.out.println("page source doesn't contains the Copyrigth word ");
		}
		String c= "Birthdate";
		boolean p=ss.equalsIgnoreCase(c);
		if(p==false){
			System.out.println("Page doesn't contain birthdate word ");
		}else{
			System.out.println(c);
		}
		
	}

}
