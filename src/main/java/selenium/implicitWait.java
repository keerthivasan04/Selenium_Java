package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitWait {

	public static void main(String[] args) {
		System.out.println("implicit wait");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email").sendKeys("koushik350@gmail.com");
		driver.findElementByName("password").sendKeys("Pass123$");
		driver.findElementByXPath("//button[text() = 'LOGIN']").click();
		driver.quit();
	}

}
