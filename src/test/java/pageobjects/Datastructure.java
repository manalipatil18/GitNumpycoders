package pageobjects;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utilities.Helper;
import io.cucumber.datatable.DataTable;
import stepdefinition.Bclass;


public class Datastructure extends Bclass{

	//	By Getstbttn = By.xpath("//a[text()='Get Started']");
	By TCbtn = By.xpath("//a[text()='Time Complexity']");
	By PQbtn = By.xpath("//a[text()='Practice Questions']");
	By Textarea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	//	By Textarea = By.xpath("//*[@id='answer_form']//*[contains(@class,'CodeMirror')]/*/textarea");
	By signoutbttn =By.xpath("//a[text()='Sign out']");

	private WebDriver chromedriver;
	public Datastructure(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}


	//	public void ValidLogin() {
	//		WebElement uname = chromedriver.findElement(By.name("username"));
	//		uname.sendKeys("NinjaCoders");
	//		WebElement pword = chromedriver.findElement(By.name("password"));
	//		pword.sendKeys("SDET135batch");
	//		chromedriver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	//	}

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


	//    public void enterinvalidcode() throws InterruptedException {
	//    	
	//    	chromedriver.findElement(Textarea).sendKeys("System.out.println(\"Hi Java\");");
	// 		 Thread.sleep(2000);
	//
	//    }  	 
	// 		 
	public void enterinvalidcode(DataTable table) throws InterruptedException {


		List<String> codedata = table.asList();
		String Coded = codedata.get(0);

		//chromedriver.findElement(Textarea).sendKeys("System.out.println(\"Hi Java\");");
		chromedriver.findElement(Textarea).sendKeys(Coded);
		Thread.sleep(500);

	}  	 


	public void InValidOutputmessage() throws InterruptedException {

		Alert alert = chromedriver.switchTo().alert();
		String alertMessage= chromedriver.switchTo().alert().getText(); 
		System.out.println(alertMessage); 
		Thread.sleep(500);
		alert.accept();

	}

	public void enterpythoncode(DataTable table1) throws InterruptedException {

		List<String> codedata1 = table1.asList();
		String Code1 = codedata1.get(0);
		//chromedriver.findElement(Textarea).sendKeys("System.out.println(\"Hi Java\");");
		chromedriver.findElement(Textarea).sendKeys(Code1);
		Thread.sleep(500);
		//    	List<String> user = table1.asList();
		//        
		//        	     	String pycode = user.get(0);
		//        	     	String pycode1 = user.get(1);
		//        	     	chromedriver.findElement(Textarea).sendKeys(pycode);
		//        	     	chromedriver.findElement(Textarea).sendKeys(pycode1);

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


	//    public void SignoutBttn() {
	//		Helper.NavBack();
	//		Helper.SignOutBtn();
	//	}














}
