package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebookrun {
	public WebDriver d;
	@Given("^Launch site$")
	public void launch_site() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver_88.exe");
	   d= new ChromeDriver();
	   d.get("https://www.facebook.com");
	}

	@When("^Enter username$")
	public void enter_username() throws Throwable {
	  WebElement uname= d.findElement(By.xpath("//*[@id='email']"));
	  uname.sendKeys("dhanashreechitnis@yahoo.com");
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
		 WebElement paswd= d.findElement(By.xpath("//*[@id='pass']"));
		 paswd.sendKeys("dhanno@123");
	}

	@When("^Click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
	   WebElement buttn= d.findElement(By.tagName("button"));
	   buttn.click();
	}

	@Then("^Site should be login successfully$")
	public void site_should_be_login_successfully() throws Throwable {
	   System.out.println("Logged in suuccessfully");
	}



}
