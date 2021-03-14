package testNGprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest06Dec {
	public WebDriver d;
	public WebElement username;
	public WebElement password;
	public WebElement button;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	@Test
	public void login(){
		username= d.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys("dhanashreechitnis@yahoo.com");
		password= d.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("dhannovirat");
		button= d.findElement(By.xpath("//*[@id='u_0_b']"));
		button.click();
	}
	@AfterMethod
	public void title(){
		String titlename= d.getTitle();
		System.out.println("Title is "+titlename);
	}
 
}
 
