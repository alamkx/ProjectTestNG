package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AddCategory {
	
	static WebDriver driver;
	
	public void CategoryAdd() {
		
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("Toys");
	
		String y = "Toys";
		
		Assert.assertEquals(y, "Toys");
		System.out.println(y);
		
	}

}
