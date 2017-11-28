import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_Partial {

    public static  void  main (String args[]) throws Exception
    {
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
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));

        element.sendKeys("65881");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        TimeUnit.SECONDS.sleep(4);
        element.clear();

        TimeUnit.SECONDS.sleep(10);

        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("6588");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        TimeUnit.SECONDS.sleep(4);
        element.clear();


        TimeUnit.SECONDS.sleep(10);

        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("658");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        TimeUnit.SECONDS.sleep(4);
        element.clear();


        TimeUnit.SECONDS.sleep(10);

        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("65");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        TimeUnit.SECONDS.sleep(4);
        element.clear();

        TimeUnit.SECONDS.sleep(10);

        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("6");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();


        //For each iteration, the search results should increase







    }
}
