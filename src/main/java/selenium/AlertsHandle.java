package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandle {
	
	public static void main(String[] args) {
		System.out.println("Alerts");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in/alert");
		
		//Simple alert	- no change even when we use dismiss method
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//confirm alert
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		
		alert1.dismiss();		
		
		//prompt alert
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("vasanTest");
		alert.accept();
		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		driver.quit();
	}

}
