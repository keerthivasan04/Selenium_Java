package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		System.out.println("drag and drop By");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElementById("draggable");
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(source, 80, 100).perform();
		
		driver.quit();
	}

}
