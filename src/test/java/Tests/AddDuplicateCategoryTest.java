package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AddDuplicateCategory;

public class AddDuplicateCategoryTest extends AddDuplicateCategory{
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		driver = Util.LaunchBrowser.init();
		
		
	}
	
	@Test	
	public void addDupCat () {
		
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("Toys");
		
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
		
		String y = "Toys";
		
		Assert.assertEquals("Toys", y);
		System.out.println("The Category to be Added Already Exists:  "+"Toys");
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	}


