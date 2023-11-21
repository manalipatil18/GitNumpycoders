package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseClass {

	public WebDriver driver;


	public WebDriver WebDriverManager() throws IOException {
	FileInputStream fis=new FileInputStream (System.getProperty("user.dir")+"//src//test//resources//global.properties");
	Properties prop = new Properties();
	prop.load (fis);
	String url=prop.getProperty("Url");
	
	if (driver== null) {
		
	
	if (prop.getProperty("browser").equalsIgnoreCase ("chrome")) {
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
	//driver.manage().window().maximize():
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	
	    if (prop.getProperty("browser").equalsIgnoreCase("msedge")) { 
	    	String path=System.getProperty("user.dir");
	        System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/msedgedriver.exe");
	    }
	
	driver.get(url);
	}
	return driver;
	//FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
	//Properties prop = new Properties();
	
	
	}
	}

//	public static WebDriver chromedriver;
//	
//	public void setupApplication()
//	{
//		chromedriver = new ChromeDriver();
//		chromedriver.manage().window().maximize();
//		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		chromedriver.get("https://dsportalapp.herokuapp.com/home"); 
//	}
//
//	public void closeApplication()
//	{
//		chromedriver.quit();
//	}
	 
	/*	private static WebDriver webDriver;
		protected static CommonPage basePage;
		
		private static final String APP_URL = "https://dsportalapp.herokuapp.com/home";
	 
		@BeforeClass
		public static void launchApplication(){
			setChromeDriverProperty();
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			webDriver.get(APP_URL);
			basePage = new CommonPage();
			basePage.setWebDriver(webDriver);
		}
	 
		@AfterClass
		public static void closeBrowser(){
			webDriver.quit();
		}
	 
		private static void setChromeDriverProperty(){
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
		}*/
	 

