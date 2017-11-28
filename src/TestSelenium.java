import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args){
        //dependency injection
        //"webdriver.gecko.driver" is the string key, and "geckodriver.exe" is the name of the driver file
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        FirefoxDriver driver= new FirefoxDriver();
        driver.get("https://www.linkedin.com/company/162479/");
        WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div[5]/div[4]/div/div[2]/section/div/div[1]/div[2]/p/span/span[1]/a/strong"));

        element = driver.findElement(By.name("btnK"));
     //   element.click();

    //    element=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/h3/a"));
    //    element.click();
     //   element =driver.findElement(By.xpath("//*[@id=\"ember3282\"]/strong"));
     //   element.click();
     //  String name_sth= element.getAttribute("");
    //   System.out.println(name_sth);

     //   element= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[2]/button"));
     //   element.click();


        //WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
      //  element.sendKeys("abc@gmail.com");

       // WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
       // button.click();
    }
}