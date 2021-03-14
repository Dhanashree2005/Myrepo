package testNGprog;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver d;
	WebElement hamburger;
	WebElement sign;
	WebElement email;
	WebElement password;
	WebElement contnue;
	WebElement login;
	WebElement seeall;
	WebElement book, fiction, Alchemist, Addtocart, proceed;
	
	@BeforeTest
	public void website(){
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	
	@Test(priority= 3)
	public void signin(){
		sign= d.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		sign.click();
		email= d.findElement(By.xpath("//*[@id='ap_email']"));
		email.sendKeys("dhanashreechitnis@yahoo.com");
		contnue= d.findElement(By.xpath("//*[@id='continue']"));
		contnue.click();
		password= d.findElement(By.xpath("//*[@id='ap_password']"));
		password.sendKeys("Shrad@123");
		login= d.findElement(By.xpath("//*[@id='signInSubmit']"));
		login.click();
	}
	
	@Test(priority= 1)
	public void Hamburger(){
		hamburger= d.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
		hamburger.click();
		seeall= d.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[19]/a[1]"));
		seeall.click();
		book= d.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/ul/li[7]/a"));
		book.click();
		fiction= d.findElement(By.xpath("//*[@id='hmenu-content']/ul[17]/li[4]/a"));
		fiction.click();
		Alchemist= d.findElement(By.xpath("//*[@id='acs-product-block-0']/a"));
		Alchemist.click();
		Addtocart= d.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		Addtocart.click();
	}
	@Test(priority= 6)
	public void Purchase(){
		proceed= d.findElement(By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input"));
		proceed.click();
		
	}
	
	
 
  
}
