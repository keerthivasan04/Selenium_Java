package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws Exception{
		System.out.println("Waits");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in");
		WebElement submit = driver.findElement(By.id("btnSubmit"));
		submit.click();

		// screenshot
		driver.getScreenshotAs(OutputType.FILE);	//or
		((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//implicit wait -- waits for each and every action performed in the UI
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		//explicit wait -- waits until the expected condition is getting success/true
		WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(submit));

		//Fluent wait -- waits in an interval of time and again performs the same action (polling period)
		Wait wait = new FluentWait(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(Exception.class);
		}

}
