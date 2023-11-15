package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
 private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
     
    private Helper() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }
    //public static void openPage(String url) {
    public static void openPage() {
        driver.get("https://dsportalapp.herokuapp.com/login");
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void GetStartedbttn() {
    	driver.findElement(By.xpath("//a[text()='Get Started']")).click();
    }
    public static void Tryherebttn() {
    	//driver.findElement(By.xpath("//a[conatins(text(),'Try here')]")).click();
    	driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();
    }
    
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
  /*   public static String GetUserName() {
      return "Facebook Username";
     }
     
     public static String GetPassword() {
      return "Facebook password";
     }*/
}