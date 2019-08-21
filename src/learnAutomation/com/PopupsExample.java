package learnAutomation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class PopupsExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/pavan/Selenium/chromedriver");

        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://seleniumpractise.blogspot.com/2017/");
        String parentId=driver.getWindowHandle();

        Set<String> setList=driver.getWindowHandles();

    }
}
