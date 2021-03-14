package testNGprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Phptravels {
	WebDriver d;
	WebElement registr;
	WebElement firstname;
	WebElement lastname;
	WebElement email, emailid;
	WebElement phone;
	WebElement addressone, loginbuttn, forgetbuttn, buttn;
	WebElement addresstwo, city, state, pincode, dropdn, mobnum, password, confirmpass, regbuttn, loginn;
	
	
 @BeforeTest
  public void titlecatch() {
	  System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://phptravels.org/clientarea.php");
	  d.manage().window().maximize();
	  String title=d.getTitle();
	  System.out.println("The title of the page is "+title); 
  }
 @Test(priority=1)
 public void register(){
	registr= d.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a"));
	registr.click();
	firstname= d.findElement(By.xpath("//*[@id='inputFirstName']"));
	firstname.sendKeys("dhanashree");
	lastname= d.findElement(By.xpath("//*[@id='inputLastName']"));
	lastname.sendKeys("atulkar");
	email= d.findElement(By.xpath("//*[@id='inputEmail']"));
	email.sendKeys("dhana123@gmail.com");
	phone= d.findElement(By.xpath("//*[@id='inputPhone']"));
	phone.sendKeys("7643283790");
	addressone= d.findElement(By.xpath("//*[@id='inputAddress1']"));
	addressone.sendKeys("hdfhgdhfghhdu");
	addresstwo= d.findElement(By.xpath("//*[@id='inputAddress2']"));
	addresstwo.sendKeys("hdsfhgfygeuyfg");
	city= d.findElement(By.xpath("//*[@id='inputCity']"));
	city.sendKeys("djgfbhg");
	state= d.findElement(By.xpath("//*[@id='stateinput']"));
	state.sendKeys("hhdsgyfgdbf");
	pincode= d.findElement(By.xpath("//*[@id='inputPostcode']"));
	pincode.sendKeys("477688");
	dropdn= d.findElement(By.xpath("//*[@id='customfield1']"));
	Select ddn= new Select(dropdn);
	ddn.selectByValue("Google");
	mobnum= d.findElement(By.xpath("//*[@id='customfield2']"));
	mobnum.sendKeys("8786765432");
	password= d.findElement(By.xpath("//*[@id='inputNewPassword1']"));
	password.sendKeys("Testing@123");
	confirmpass= d.findElement(By.xpath("//*[@id='inputNewPassword2']"));
	confirmpass.sendKeys("Testing@123");
	regbuttn= d.findElement(By.xpath("//*[@id='frmCheckout']/p/input"));
	regbuttn.click();
	}
 @Test(priority=2)
 public void login(){
	 loginn= d.findElement(By.xpath("//*[@id='header']/div/ul/li[2]/a"));
	 loginn.click();
	 loginbuttn= d.findElement(By.xpath("//*[@id='login']"));
	 loginbuttn.click();
 }
 @Test(priority=3)
 public void forgetpassword(){
	 forgetbuttn= d.findElement(By.xpath("//*[@id='main-body']/div/div/div[1]/div/div[4]/div[1]/form/div[5]/a"));
	 forgetbuttn.click();
	 emailid= d.findElement(By.xpath("//*[@id='inputEmail']"));
	 emailid.sendKeys("dhana123@gmail.com");
	 buttn= d.findElement(By.xpath("//*[@id='main-body']/div/div/div[1]/div/form/div[3]/button"));
	 buttn.click();
 }
 
}
