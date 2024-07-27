package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws Exception {
		System.out.println("Navigation");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in/buttons");
		System.out.println("button page URL " + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.id("home")).click();
		System.out.println("home page URL " + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("return to button page " + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println("return to home page " + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.navigate().to("https://letCode.in/signin");
		driver.quit();
	}

}
