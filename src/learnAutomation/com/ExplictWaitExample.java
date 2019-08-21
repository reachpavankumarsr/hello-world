package learnAutomation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Demo for Explict wait
public class ExplictWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/pavan/Selenium/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/home/pavan/Selenium/chromedriver");

        //create driver object for firefox browser
        WebDriver driver =new FirefoxDriver();
        //navigae to explictly wait demo page
        driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
        //Click on "Click me to start timer"
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        // Create object of WebDriverWait class and it will wait max of 20 seconds.
        // By default it will accepts in Seconds
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        String ptag=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).getText();
        boolean status=element.isDisplayed();
        if(ptag=="Webdriver"){
            System.out.println("Webdriver is displayed");

        }

        if(status){
            System.out.println("Test pass");
        }
        else
        {
            System.out.println("test fails");
        }

    }
}
