package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Find_By {

    @FindBy (xpath = "//input[@name='username']")
    WebElement userName;
    @FindBy (xpath = "//input[@name='password']")
    WebElement password;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement lgn_btn;

    public void enterUsernamePassword() {
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
    }
    public void login() {
        enterUsernamePassword();
        lgn_btn.click();
    }

    public static void main(String[] args) {

        System.out.println("@Find By method");

        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Find_By fb = new Find_By();
        fb.login();
        driver.close();
    }
}
