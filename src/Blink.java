import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Blink {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        String baseUrl= "https://172.30.20.146/login.html";
        FirefoxDriver driver= new FirefoxDriver();
        driver.get(baseUrl);
        String originalName= "65883";
        WebElement element=driver.findElement(By.name("uname"));
        element.sendKeys("bari.rashedul@genweb2.com");
        element=driver.findElement(By.name("pword"));
        element.sendKeys("DhakaAdm1n");
        element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"admin-menu\"]/nav/ul/li[1]/a"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("658834");
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click();

       baseUrl = "https://172.30.20.146/admin/evse-console/manage.html?evse_id=33239#location";
       driver.get(baseUrl);
        element=driver.findElement(By.xpath("//*[@id=\"edit-serial\"]"));
        element.click(); //click the serial number edit button
        element=driver.findElement(By.name("Serial-Number"));
        String newName= "65883";
        element.sendKeys(newName);
        element=driver.findElement(By.ByLinkText.xpath("/html/body/div[9]/form/div[3]/input[2]"));
        element.click();
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/ul/li[1]/a"));
        element.click();
        element=driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        element.sendKeys("newName"); //paste new name in charger search
        element=driver.findElement(By.xpath("/html/body/div[2]/div[4]/section/form/div[2]/input"));
        element.click(); //click the search button





    }
}
