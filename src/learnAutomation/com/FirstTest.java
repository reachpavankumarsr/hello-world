package learnAutomation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/pavan/Selenium/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/home/pavan/Selenium/chromedriver");

        WebDriver driver =new FirefoxDriver();
        driver.get("http://www.google.com/");
        driver.getTitle();

        driver.close();
    }
}
