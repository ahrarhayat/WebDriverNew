import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Blink_Transaction {
    public static void main(String [] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl= "https://172.30.20.146/login.html";
        FirefoxDriver driver= new FirefoxDriver();
        //Enter credentials and login
        //Default search
        driver.get(baseUrl);
        WebElement element=driver.findElement(By.name("uname"));
        element.sendKeys(".......");
        element=driver.findElement(By.name("pword"));
        element.sendKeys("......");
        element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        baseUrl="https://172.30.20.146/console/transaction.html";
        driver.get(baseUrl);

        TimeUnit.SECONDS.sleep(10);

        driver.navigate().refresh();

        TimeUnit.SECONDS.sleep(10);

        //Various searches
        int x =0;
        String date;
        while(x<5){
            if (x==1)
            {
                date ="2017-11-02";
            }
            else if (x==2)
            {
                date = "2017-11-03";
            }
            else if(x==3)
            {
                date = "2017-11-04";

            }
            else if(x==4)
            { date = "2017-11-05";

            }
            else {
                date = "2017-11-01";
            }


            element=driver.findElement(By.name("evse_time1"));
            element.clear();
            element.sendKeys(date);
            element=driver.findElement(By.name("evse_time2"));
            element.clear();
            element.sendKeys(date);
            element=driver.findElement(By.name("transmit_time1"));
            element.clear();
            element.sendKeys(date);
            element=driver.findElement(By.name("transmit_time2"));
            element.clear();
            element.sendKeys(date);
            element=driver.findElement(By.className("blink-button"));
            element.click();
            x=x+1;
            TimeUnit.SECONDS.sleep(10);

        }





    }

}
