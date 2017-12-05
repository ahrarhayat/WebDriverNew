import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_edit {
    public static void main(String[] args) throws Exception {


   Blink_Alpha alpha = new Blink_Alpha();
   alpha.TransactionTest();
   alpha.PartialTest();
   alpha.Blink_NameChange();





    }
}





/*  TimeUnit.MINUTES.sleep(20); //Check after 20 minutes

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl = "https://localhost:8443/admin/charger-search.html#658802";
        FirefoxDriver driver = new FirefoxDriver();
        //Enter credentials and login
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.name("uname"));
        element.sendKeys("bari.rashedul@genweb2.com");
        element = driver.findElement(By.name("pword"));
        element.sendKeys("DhakaAdm1n");
        element = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"admin-menu\"]/nav/ul/li[1]/a"));
        element.click();
        element= driver .findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("658802");
        element = driver.findElement(By.xpath("//*[@id=\"evse-search\"]/div[2]/input"));
        element.click();*/