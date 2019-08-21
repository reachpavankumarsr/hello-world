import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FluentWaitTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/home/pavan/Selenium/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Abcd");
        driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);

    }
}
