package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws Exception{
		System.out.println("frames");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in/frame");

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElementByName("fname").sendKeys("VasanTest");
		driver.findElement(By.name("lname")).sendKeys("Test");
		
//		driver.switchTo().frame(1);
//		driver.findElementByName("email").sendKeys("Vasan01@test.com");
//		
//		driver.switchTo().parentFrame();			//parentFrame - to switch to parent frames or Default Content  - to switch to default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.quit();
	}

}
