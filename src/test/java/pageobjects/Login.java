package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.BaseClass;
import stepdefinition.Bclass;

import org.testng.Assert;


public class Login extends Bclass{


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


	/*public Login(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}*/
	private WebDriver chromedriver;
	public Login(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}

	public void Signinstep() {

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
		System.out.println( "Username:" + Vusenametext );
	}


	public void getErrMsgUN() {

		WebElement Errmsg = chromedriver.findElement(Unameerr);
		String text1=(Errmsg).getText();
		System.out.println( text1 );

		String expectedElementText1 = "Invalid Username and Password";

		Assert.assertEquals(text1, expectedElementText1,"Expected and Actual are not same");
	}

	//	public void getErrMsgInvaludUN() {
	//		
	//		WebElement InvalidUnErrmsg = chromedriver.findElement(InvalidUNerr);
	//		String InvalidUnErrmsgtext=(InvalidUnErrmsg).getText();
	//		System.out.println( InvalidUnErrmsgtext );
	//		
	//		String expectedElementText2 = "Please check your user id";
	//		
	//		Assert.assertEquals(InvalidUnErrmsgtext, expectedElementText2,"Expected and Actual are not same");
	//	}
	//	
	//	
	//	public void getErrMsgInvaliedpass() {
	//		
	//		WebElement InvalidpassErrmsg = chromedriver.findElement(InvalidPasserr);
	//		String InvalidpassErrmsgtext=(InvalidpassErrmsg).getText();
	//		System.out.println( InvalidpassErrmsgtext );
	//		
	//		String expectedElementText3 = "Please check your password";
	//		
	//		Assert.assertEquals(InvalidpassErrmsgtext, expectedElementText3,"Expected and Actual are not same");
	//	}
	//	
	public void plsfillerrmsg() {
		WebElement activeElement = chromedriver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}


	public void Signout() {

		chromedriver.findElement(SignoutBtn).click();
		
	}
}

