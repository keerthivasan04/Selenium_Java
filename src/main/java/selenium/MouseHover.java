package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.out.println("mouse hover");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[@role='button']['X']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text() = 'Electronics']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		driver.findElement(By.linkText("All")).click();
		String text = driver.findElement(By.className("R0cyWM")).getText();
		System.out.println(text);
		
		driver.quit();
	}

}
