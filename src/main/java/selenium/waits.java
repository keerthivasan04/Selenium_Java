package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws Exception{
		System.out.println("Waits");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebElement ele = driver.findElement(By.id("abd"));
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(ele));
		//fluent wait
		
//		Wait wait = new FluentWait(driver).withTimeout(5, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
	}

}
