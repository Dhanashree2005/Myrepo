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
import org.openqa.selenium.chrome.ChromeOptions;

public class Multivalexcl {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver_88.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.orangehrm.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement freetrial= d.findElement(By.xpath("//*[@id='header-navbar']/ul[2]/li[2]/a"));
		freetrial.click();
		WebElement url= d.findElement(By.xpath("//*[@id='Form_submitForm_subdomain']"));
		
		File file= new File("D:\\DhanSelenium\\Mavenproject\\src\\test\\resources\\testdata\\orangehrm.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0; i<=rowcount; i++){
			int cellcount= sheet.getRow(i).getLastCellNum();
			System.out.println("Row"+i+"data is ");
			for(int j=0; j<cellcount; j++){
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+",");
				url.sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				
			}
			
		}
	

	}

}
