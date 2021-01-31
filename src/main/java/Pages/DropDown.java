package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;






public class DropDown {
	
	static WebDriver driver;
	
	public void dropDown() {
		
		WebElement element = driver.findElement(By.xpath("//select[@name='due_day']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Jan");
		
		WebElement firstTel = sel.getFirstSelectedOption();
		System.out.println("First element ="+firstTel.getText());
		
		List<WebElement> listoptions = sel.getOptions();
		for (WebElement WebElement : listoptions) {
			
			System.out.println("Options = "+WebElement.getText());
			
		}
		

		
	}

}
