import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    public static void main(String[] args)  {
        System.setProperty("webdriver.gecko.driver", "/home/pavan/Selenium/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/home/pavan/Selenium/chromedriver");

        WebDriver driver =new FirefoxDriver();
        System.out.println("Debug");
        driver.get("http://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.getTitle();
        System.out.println(driver.getTitle());
        WebElement image=driver.findElement(By.id("hplogo"));
        if(image.isDisplayed()){
            System.out.println("Yes==PASS");
        }
        else {
            System.out.println("no==FAIL");
        }
    }
}
