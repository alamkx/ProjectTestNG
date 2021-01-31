package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navid\\eclipse-workspace\\Selenium\\Session1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}

}
