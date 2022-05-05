package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Proj_hotel {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrey\\eclipse-workspace\\maven\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Arunsanarun");
		driver.findElement(By.id("password")).sendKeys("arunadactin");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		WebElement ak = driver.findElement(By.id("location"));
		Select s = new Select(ak);
		s.selectByIndex(5);
		
		Thread.sleep(1500);
		WebElement ak1 = driver.findElement(By.name("hotels"));
		Select s1 = new Select(ak1);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement ak2 = driver.findElement(By.name("room_type"));
		Select s2 = new Select(ak2);
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement ak3 = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(ak3);
		s3.selectByIndex(2);
		
		WebElement ak4 = driver.findElement(By.id("datepick_in"));
		ak4.clear();
		ak4.sendKeys("20/03/2022");
		
		WebElement ak5 = driver.findElement(By.name("datepick_out"));
		ak5.clear();
		ak5.sendKeys("25/03/2022");
		
		WebElement ak6 = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(ak6);
		s4.selectByIndex(3);
		
		WebElement ak7 = driver.findElement(By.id("child_room"));
		Select s5 = new Select(ak7);
		s5.selectByIndex(1);
		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("arun");
		driver.findElement(By.id("last_name")).sendKeys("sanarun");
		driver.findElement(By.id("address")).sendKeys("237,willford street");
		driver.findElement(By.id("cc_num")).sendKeys("1234567897418529");
		
		Thread.sleep(1500);
		WebElement ak8 = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ak8);
		s6.selectByVisibleText("Master Card");
		
		WebElement ak9 = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(ak9);
		s7.selectByIndex(4);
		
		WebElement ak10 = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(ak10);
		s8.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("2500");
		driver.findElement(By.id("book_now")).click();
		
		driver.findElement(By.xpath("//a[@href='Logout.php']")).click();
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
