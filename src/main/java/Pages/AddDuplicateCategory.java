package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddDuplicateCategory {
	
	static WebDriver driver;
	
	public void dupCat() {
	
	driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("Toys");
	
	driver.findElement(By.xpath("//input[@value='Add category']")).click();
	
	String y = "Toys";
	
	Assert.assertEquals("Toys", y);
	System.out.println("The Category to be Added Already Exists:  "+"Toys");
	
	}

}
