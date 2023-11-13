package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;

import org.testng.Assert;


//import stepdefinition.loginPage;

public class Login{
	
	WebDriver chromedriver;
	
	By loginBtn = By.xpath("//a[text()='Sign in']");
	By Uname = By.name("username");
	By Passwrd = By.name("password");
	By Loginclick = By.xpath("//input[@type='submit' and @value='Login']");
	By Unameerr = By.xpath("//div[@class='alert alert-primary']");
	By Loginmsg = By.xpath("//div[@class='alert alert-primary']");
	By Validusername = By.xpath("//div/ul/a[2]");
	By InvalidUNerr = By.xpath("//div[@class='alert alert-primary']");
	By InvalidPasserr = By.xpath("//div[@class='alert alert-primary']");
	By SignoutBtn = By.xpath("//a[text()='Sign out']");
	
	public Login(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
	public void Signinstep() {
		//System.out.println("i am in sign methid");
		
		chromedriver.findElement(loginBtn).click();
	}
	
	public void enterusername(String username) {
		chromedriver.findElement(Uname).sendKeys(username);
	}

	public void enterpassword(String password) {
		chromedriver.findElement(Passwrd).sendKeys(password);
	}
	
	public void clicklogin() {
		chromedriver.findElement(Loginclick).click();
	}
	
	public void getsucessmsg(){
		WebElement Succmsg = chromedriver.findElement(Loginmsg);
		String text=(Succmsg).getText();
		System.out.println( text );
		
		String expectedElementText = "You are logged in";

		 //Assert to verify the actual and expected values

		Assert.assertEquals(text, expectedElementText,"Expected and Actual are not same");
		
		//Get the name of the valid user
		WebElement Vusername = chromedriver.findElement(Validusername);
		String Vusenametext=(Vusername).getText();
		System.out.println( Vusenametext );
	  }
	
	
	public void getErrMsgUN() {
		/*WebDriverWait wait = new WebDriverWait(chromedriver, Duration.ofSeconds(5));
		System.out.println("In error msg");
	      //alertIsPresent() condition applied
	     if(w.until(ExpectedConditions.alertIsPresent())==null)
	      System.out.println("Alert not exists");
	      else
	      System.out.println("Alert exists");
		
        Boolean AlertExists;
        try
        {
            wait.until(ExpectedConditions.alertIsPresent());
            AlertExists = true;
        }
        catch(Exception ex)
        {
            
            AlertExists = false;
        }
        if(AlertExists)
        {
          //do stuff
        }
        else
        {
          //do other stuff
        }
		
		String alertMessage= chromedriver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert MessageAlert 
	   // return alertMessage();  */
		WebElement Errmsg = chromedriver.findElement(Unameerr);
		String text1=(Errmsg).getText();
		System.out.println( text1 );
		
		String expectedElementText1 = "Invalid Username and Password";
		//String expectedElementText2 = "Please check your user id";
		//String expectedElementText3 = "Please check your password";
		 //Assert to verify the actual and expected values
		
		Assert.assertEquals(text1, expectedElementText1,"Expected and Actual are not same");
	  }
	
	public void getErrMsgInvaludUN() {
		
		WebElement InvalidUnErrmsg = chromedriver.findElement(InvalidUNerr);
		String InvalidUnErrmsgtext=(InvalidUnErrmsg).getText();
		System.out.println( InvalidUnErrmsgtext );
		
		String expectedElementText2 = "Please check your user id";
		
		Assert.assertEquals(InvalidUnErrmsgtext, expectedElementText2,"Expected and Actual are not same");
	}
	
	
	public void getErrMsgInvaliedpass() {
		
		WebElement InvalidpassErrmsg = chromedriver.findElement(InvalidPasserr);
		String InvalidpassErrmsgtext=(InvalidpassErrmsg).getText();
		System.out.println( InvalidpassErrmsgtext );
		
		String expectedElementText3 = "Please check your password";
		
		Assert.assertEquals(InvalidpassErrmsgtext, expectedElementText3,"Expected and Actual are not same");
	}
	
	
	public void Signout() {
		
		chromedriver.findElement(SignoutBtn).click();
	}
}

