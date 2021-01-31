package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AddCategory;

public class AddCategoryTest extends AddCategory{
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		driver = Util.LaunchBrowser.init();
		
		 
	}
	
	@Test
	public void CategoryAdd1() throws Exception {
		
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("Toys");
		driver.findElement(By.xpath("//input[@name='submit' and @value='Add category']")).click();
		
		Thread.sleep(2000);
		
		
	}	
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
		
		
	}
	
	
}
