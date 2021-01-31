package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DropDown;

public class DropDownTest extends DropDown{
	
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		driver = Util.LaunchBrowser.init();
		
		
	}
	
	@Test	
	public void dropDownTest () {

		WebElement element = driver.findElement(By.xpath("//select[@name='due_month']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Jan");
		
		WebElement firstTel = sel.getFirstSelectedOption();
		System.out.println("First element ="+firstTel.getText());
		
		List<WebElement> listoptions = sel.getOptions();
		for (WebElement WebElement : listoptions) {
			
			System.out.println("Options = "+WebElement.getText());
			
		}
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
		
}


