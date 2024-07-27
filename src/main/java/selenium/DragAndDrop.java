package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.out.println("drag and drop");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElementById("draggable");
		WebElement dest = driver.findElementById("droppable");
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
		
		String text = driver.findElementById("droppable").getText();
		System.out.println(text);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.quit();
	}

}
