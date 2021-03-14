package com.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class bankacc {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver_88.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.hdfcbank.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions act= new Actions(d);
		WebElement apply= d.findElement(By.linkText("APPLY ONLINE"));
		apply.click();
		WebElement name= d.findElement(By.xpath("//*[@id='txtName']"));
		WebElement mob= d.findElement(By.xpath("//*[@id='txtMobile']"));
		WebElement email= d.findElement(By.xpath("//*[@id='txtEmailID']"));
		WebElement city= d.findElement(By.xpath("//*[@id='ddlCity']"));
		WebElement sal= d.findElement(By.xpath("//*[@id='txtNetSalary']"));
		
		File file= new File("D:\\DhanSelenium\\Mavenproject\\src\\test\\resources\\testdata\\hdfc.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		 int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		 for(int i=0; i<=rowcount; i++){
			 int cellcount= sheet.getRow(i).getLastCellNum();
			 for(int j=0; j<cellcount; j++){
				 name.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				 mob.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				 email.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				 city.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				 sal.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				 
			 }
		 }
		
		
		
		
		
		

	}

}
