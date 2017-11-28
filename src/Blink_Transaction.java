import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Blink_Transaction {
    public static void main(String [] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl= "https://localhost:8443/login.html";
        FirefoxDriver driver= new FirefoxDriver();
        //Enter credentials and login
        driver.get(baseUrl);
        WebElement element=driver.findElement(By.name("uname"));
        element.sendKeys("bari.rashedul@genweb2.com");
        element=driver.findElement(By.name("pword"));
        element.sendKeys("DhakaAdm1n");
        element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        driver.get("https://localhost:8443/console/transaction.html");



    }

}
