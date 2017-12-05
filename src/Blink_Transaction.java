import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

public class Blink_Transaction {
    public static void main(String [] args) throws Exception {

        String log="";


        //log += "\nnew log";
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl= "https://172.30.20.146/login.html";
        FirefoxDriver driver= new FirefoxDriver();
        //Enter credentials and login
        //Default search
        driver.get(baseUrl);
        WebElement element=driver.findElement(By.name("uname"));
        element.sendKeys("bari.rashedul@genweb2.com");
        element=driver.findElement(By.name("pword"));
        element.sendKeys(".....");
        element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        baseUrl="https://172.30.20.146/console/transaction.html";
        driver.get(baseUrl); //Test case 1 ends, with loading the transaction page to see if search button is clicked and it automatically scrolls down

        TimeUnit.SECONDS.sleep(10);

        driver.navigate().refresh(); //Test case 2 ends(Refreshing the page to see if it's set back to default

        TimeUnit.SECONDS.sleep(10);

        //Various searches
        int x =0;
        String date;
        while(x<5){
            if (x==1)
            {
                date ="2017-12-02";
            }
            else if (x==2)
            {
                date = "2017-12-03";
            }
            else if(x==3)
            {
                date = "2017-12-04";

            }
            else if(x==4)
            { date = "2017-12-05";

            }
            else {
                date = "2017-12-01";
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
            TimeUnit.SECONDS.sleep(10); //test case 3 ends, after testing various dates

            /*String log="All the test cases are completed";
            File file = new File("log.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(log);
            writer.flush();
            writer.close();*/

        }





    }

}
