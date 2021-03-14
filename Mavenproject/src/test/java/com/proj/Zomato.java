package com.proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zomato {
	WebDriver d;
	WebElement message , hotel , noodles, add,contnue, login, detect,gmail, email, coockie, location ; 
  @BeforeTest
  public void sitelaunch() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	 opt.addArguments("__disable-Notification");
	  d= new ChromeDriver(opt);
	  d.get("https://www.zomato.com");
	  d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  message= d.findElement(By.xpath("//*[@id='root']/div[2]/div[6]/div/div[2]/button[2]/span"));
	  message.click();
	 location= d.findElement(By.xpath("//*[@id='navigation_ckk245i0g000117qbga65g535']/li[1]/div/div/div[1]/i[2]/svg"));
	 location.click();
  }
  @Test(priority=1)
  public void Login(){
	  login= d.findElement(By.xpath("//*[@id='navigation_ckk18c1y5000016s1h0tu5r2a']/li[2]/a"));
	  login.click();
	  gmail= d.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[4]/div"));
	  gmail.click();
	  email= d.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div"));
	  email.click();
	 
  }
 
}
