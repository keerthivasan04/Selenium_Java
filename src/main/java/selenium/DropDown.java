package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.out.println("Drop Down");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		//select by visible text
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select fruitsDropdown = new Select(fruits);
		fruitsDropdown.selectByVisibleText("Apple");
		fruitsDropdown.selectByVisibleText("Banana");
		
		//
//		WebElement country = driver.findElementById("country");
//		Select countryDropDown = new Select(country);
//		countryDropDown.selectByValue("India");
//		WebElement selectedCountry = countryDropDown.getFirstSelectedOption();
//		System.out.println(selectedCountry.getText());
		
		driver.quit();
	}

}
