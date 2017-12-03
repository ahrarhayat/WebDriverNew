import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_partial_V2 {
    public static  void main(String [] args) throws Exception
    {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl= "https://172.30.20.146/login.html";
        WebDriver driver= new FirefoxDriver();
        //Enter credentials and login
        driver.get(baseUrl);
        WebElement element=driver.findElement(By.name("uname"));
        element.sendKeys(".......");
        element=driver.findElement(By.name("pword"));
        element.sendKeys(".......");
        element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        int x = 0;
        int value=65881;
        String Value= Integer.toString(value);
        while (x<5)
        {
            element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
            element.sendKeys(Value);
            element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
            element.click();
            element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
            TimeUnit.SECONDS.sleep(4);
            element.clear();



            x=x+1;
            value=value/10;
            Value=Integer.toString(value);

            TimeUnit.SECONDS.sleep(10);


        }
        if(x==5)
        {
            Value = "all";
            element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
            element.sendKeys(Value);
            element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
            element.click();
            System.out.println("Test is completed, it can be concluded from this test case that the partial search is only effective up to 3 digits");
        }

    }
}
