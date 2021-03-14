package com.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver_88.exe");
		WebDriver d= new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.rediff.com/");
		File f= new File("D:\\DhanSelenium\\Mavenproject\\src\\main\\resources\\rediffmaildata\\rediffmail.xlsx");
		WebElement createacc= d.findElement(By.xpath("//*[@id='signin_info']/a[2]"));
		createacc.click();
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		String name= sheet.getRow(1).getCell(0).getStringCellValue();
		WebElement fullname= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		fullname.sendKeys(name);
		String email= sheet.getRow(1).getCell(1).getStringCellValue();
		WebElement emailid= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		emailid.sendKeys(email);
		WebElement button= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		button.click();
		String passwd= sheet.getRow(1).getCell(2).getStringCellValue();
		WebElement password= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input"));
		password.sendKeys(passwd);
		String repass= sheet.getRow(1).getCell(2).getStringCellValue();
		WebElement Repassword= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input"));
		Repassword.sendKeys(repass);
		WebElement checkbox= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		checkbox.click();
		String mob= sheet.getRow(1).getCell(3).getStringCellValue();
		WebElement mobile= d.findElement(By.xpath("//*[@id='mobno']"));
		mobile.sendKeys(mob);
		String dt= sheet.getRow(1).getCell(4).getStringCellValue();
		WebElement day= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		day.sendKeys(dt);
		String mon= sheet.getRow(1).getCell(5).getStringCellValue();
		WebElement month= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		month.sendKeys(mon);
		String yr= sheet.getRow(1).getCell(6).getStringCellValue();
		WebElement year= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		year.sendKeys(yr);
		WebElement gender= d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]"));
		gender.click();
		String country= sheet.getRow(1).getCell(7).getStringCellValue();
		WebElement contyr= d.findElement(By.xpath("//*[@id='country']"));
		contyr.sendKeys(country);
		String city= sheet.getRow(1).getCell(8).getStringCellValue();
		WebElement cty= d.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		cty.sendKeys(city);
		
	}

}
