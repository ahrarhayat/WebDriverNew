import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_edit {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl = "https://localhost:8443/login.html";
        FirefoxDriver driver = new FirefoxDriver();
        //Enter credentials and login
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.name("uname"));
        element.sendKeys(".......");
        element = driver.findElement(By.name("pword"));
        element.sendKeys(".......");
        element = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        baseUrl = "https://localhost:8443/console/transaction.html";
        driver.get(baseUrl);
        driver.navigate().refresh();
    }
}