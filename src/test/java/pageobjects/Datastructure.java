package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Helper;
import stepdefinition.Bclass;

//public class Datastructure {
	//WebDriver chromedriver;
public class Datastructure extends Bclass{
	
//	By Getstbttn = By.xpath("//a[text()='Get Started']");
	By TCbtn = By.xpath("//a[text()='Time Complexity']");
	By PQbtn = By.xpath("//a[text()='Practice Questions']");
	By Textarea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
//	By Textarea = By.xpath("//*[@id='answer_form']//*[contains(@class,'CodeMirror')]/*/textarea");
	//By Textarea1 = By.xpath("//*[@id='answer_form']//*[contains(@class,'CodeMirror')]/*/pre/span");
	
	private WebDriver chromedriver;
	public Datastructure(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
	
	public void ValidLogin() {
		WebElement uname = chromedriver.findElement(By.name("username"));
		uname.sendKeys("NinjaCoders");
		WebElement pword = chromedriver.findElement(By.name("password"));
		pword.sendKeys("SDET135batch");
		chromedriver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	
//	public void getstartedbutton() {
//		chromedriver.findElement(Getstbttn).click();
//	}
	
	public void OnDSpage() {
		
	String actualTitle = chromedriver.getTitle();
	//System.out.println("title:" +actualTitle);
	String expectedTitle = "Data Structures-Introduction";
	Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	}
	
	
	public void TimeComplexityBtn() {
		chromedriver.findElement(TCbtn).click();
	}
	
    public void OnTCpage() {
		
	String actualTitleTC = Helper.getTitle();
	//System.out.println("title:" +actualTitleTC);
	String expectedTitleTC = "Time Complexity";
	Assert.assertEquals(actualTitleTC, expectedTitleTC, "Condition true");
	}

    public void PracticeQuesBtn() {
		chromedriver.findElement(PQbtn).click();
	}
    
    public void OnPQpage() {
		
    	String actualTitlePQ = Helper.getTitle();
    	//System.out.println("title:" +actualTitlePQ);
    	String expectedTitlePQ = "Practice Questions";
    	Assert.assertEquals(actualTitlePQ, expectedTitlePQ, "Condition true");
    	}
    
    public void onTryeditorpage() {
    	String actualTitleTE = Helper.getTitle();
    	//System.out.println("title:" +actualTitleTE);
    	String expectedTitleTE = "Assessment";
    	Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
    }
    
    
    public void enterinvalidcode() throws InterruptedException {
    	
    	chromedriver.findElement(Textarea).sendKeys("System.out.println(\"Hi Java\");");
 		 Thread.sleep(2000);

    }  	 
 		 
 		 
    public void InValidOutputmessage() throws InterruptedException {
    	
    	Alert alert = chromedriver.switchTo().alert();

    	String alertMessage= chromedriver.switchTo().alert().getText(); 

    	System.out.println(alertMessage); 
    	Thread.sleep(1000);
    	alert.accept();
//    	Thread.sleep(2000);
//    	chromedriver.findElement(Textarea1).clear();
    }
 		
    public void enterpythoncode() throws InterruptedException {
    
    	chromedriver.findElement(Textarea).sendKeys("print 'hello';");
 		 Thread.sleep(2000);

    }  
    
//    public void RunBtn() throws InterruptedException {
//  
// 		chromedriver.findElement(By.xpath("//*[@id='answer_form']/button")).click();
// 		 Thread.sleep(3000);
//    }
    
    public void ValidOutput() {
    	WebElement e = chromedriver.findElement(By.xpath("//*[@id='output']"));
    	System.out.println(e.getText());
    }
 		 
 		 
	 
 		 
 	
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
}
 