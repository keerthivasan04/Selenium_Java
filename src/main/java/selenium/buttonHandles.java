package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class buttonHandles {

	public static void main(String[] args) {
		System.out.println("Button Handles");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in/buttons");
		WebElement element1 = driver.findElementById("position");
		Point point = element1.getLocation(); 		// returns point
		int x = point.getX();
		int y = point.getY();
		System.out.println("X=>" + x + " Y=>" + y);
		WebElement btncolor = driver.findElement(By.id("color"));
		String color = btncolor.getCssValue("background-color");
		System.out.println(color);
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println(rect.getDimension());
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getPoint());
		boolean isBtnEnabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isBtnEnabled);
		
		driver.quit();
	}

}
