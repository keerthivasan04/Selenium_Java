package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		System.out.println("Screenshot");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letCode.in/buttons");
		
		//page
		File file = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/page.png"); // png size is less than jpeg and image quality is high
		FileHandler.copy(file, dest);
		
		//element
		WebElement element = driver.findElement(By.id("color"));
		File file1 = element.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/buttonelement.png"); // png size is less than jpeg and image quality is high
		FileHandler.copy(file1, dest1);
		
		//section
//		WebElement info = driver.findElement(By.className("hero-body"));
//		File file2 = element.getScreenshotAs(OutputType.FILE);
//		File dest2 = new File("./snaps/info.png"); // png size is less than jpeg and image quality is high
//		FileHandler.copy(file2, dest2); 
		
		driver.quit();

	}

}
