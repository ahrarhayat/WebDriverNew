import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_NameChange {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl = "https://172.30.20.146/login.html";
        FirefoxDriver driver = new FirefoxDriver();
        //Enter credentials and login
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.name("uname"));
        element.sendKeys("bari.rashedul@genweb2.com");
        element = driver.findElement(By.name("pword"));
        element.sendKeys(".....");
        element = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"admin-menu\"]/nav/ul/li[1]/a"));
        element.click();
        element= driver .findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("65882");
        element = driver.findElement(By.xpath("//*[@id=\"evse-search\"]/div[2]/input"));
        element.click();
        TimeUnit.SECONDS.sleep(10);
        element = driver.findElement(By.className("icon-edit")); //edit icon
        element.click();

        element = driver.findElement(By.xpath("//*[@id=\"edit-serial\"]")); //change evse_id
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"value\"]")); //change field value
        element.sendKeys("6588234");
        element = driver.findElement(By.cssSelector("input.success"));  //change value button
        element.click();


        TimeUnit.SECONDS.sleep(10);


        element = driver.findElement(By.xpath("//*[@id=\"edit-guid\"]"));  //change GUID
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"value\"]")); //change field value
        element.sendKeys("QKTHTHGGHQOP");
        element = driver.findElement(By.cssSelector("input.success"));  //change value button
        element.click();



        element = driver.findElement(By.xpath("//*[@id=\"admin-menu\"]/nav/ul/li[1]/a")); //back to charger search
        element.click();
        element= driver .findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("6588234");
        element = driver.findElement(By.xpath("//*[@id=\"evse-search\"]/div[2]/input"));
        element.click();

        TimeUnit.SECONDS.sleep(10);

        element= driver .findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.clear();
        element.sendKeys("QKTHTHGGHQOP");
        element = driver.findElement(By.xpath("//*[@id=\"evse-search\"]/div[2]/input"));
        element.click();





    }

}
