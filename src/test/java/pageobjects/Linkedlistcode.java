package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Helper;
import stepdefinition.Bclass;

public class Linkedlistcode extends Bclass{
	
	By LLbtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By Introbttn = By.xpath("//a[text()='Introduction']");
	By CreateLLbttn = By.xpath("//a[text()='Creating Linked LIst']");
	By TypeofLLbttn = By.xpath("//a[text()='Types of Linked List']");
	By ImplementLLbttn = By.xpath("//a[text()='Implement Linked List in Python']");
	By TraversalLLbttn = By.xpath("//a[text()='Traversal']");
	By InsertionLbttn = By.xpath("//a[text()='Insertion']");
	By DeletionLbttn= By.xpath("//a[text()='Deletion']");
	By PQLLbttn= By.xpath("//a[text()='Practice Questions']");
	By Signoutbttn =By.xpath("//a[text()='Sign out']");
	
	private WebDriver chromedriver;
	public Linkedlistcode(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
	public void ValidLogin1() {
		WebElement uname = chromedriver.findElement(By.name("username"));
		uname.sendKeys("NinjaCoders");
		WebElement pword = chromedriver.findElement(By.name("password"));
		pword.sendKeys("SDET135batch");
		chromedriver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	
	public void selectLL() {
		chromedriver.findElement(LLbtn).click();
		
		List<WebElement> elements = chromedriver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
		for (WebElement element : elements) {
			if ("Linked List".equals(element.getText())) {
				element.click();
				break;
			}else {
				continue;
			}
		}
	}
	
	
	public void OnLLPage() {
		String actualTitleLL =Helper.getTitle();
		//System.out.println(actualTitleLL);
		String ExpectedTitleLL = "Linked List";
		Assert.assertEquals(actualTitleLL, ExpectedTitleLL, "Condition true");
	}
	
	public void IntroBttn() {
		chromedriver.findElement(Introbttn).click();
	}
	
	public void OnIntroPage() {
		String actualTitleIntro =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleIntro = "Introduction";
		Assert.assertEquals(actualTitleIntro, ExpectedTitleIntro, "Condition true");
	}
	
	public void CreatelinklistBtn() {
		chromedriver.findElement(CreateLLbttn).click();
	}

	public void OnCreateLLPage() {
		String actualTitleCLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleCLL = "Creating Linked LIst";
		Assert.assertEquals(actualTitleCLL, ExpectedTitleCLL, "Condition true");
	}
	
	public void TypeofLLBtn() {
		chromedriver.findElement(TypeofLLbttn).click();
	}

	public void OnTypeofLLPage() {
		String actualTitleTOLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleTOLL = "Types of Linked List";
		Assert.assertEquals(actualTitleTOLL, ExpectedTitleTOLL, "Condition true");
	}
	
	public void ImplementLLBtn() {
		chromedriver.findElement(ImplementLLbttn).click();
	}

	public void OnImplementLLPage() {
		String actualTitleIMLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleIMLL = "Implement Linked List in Python";
		Assert.assertEquals(actualTitleIMLL, ExpectedTitleIMLL, "Condition true");
	}
	
	public void TraversalLLBtn() {
		chromedriver.findElement(TraversalLLbttn).click();
	}

	public void OnTraversalLLPage() {
		String actualTitleTLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleTLL = "Traversal";
		Assert.assertEquals(actualTitleTLL, ExpectedTitleTLL, "Condition true");
	}
	
	public void InsertionLLBtn() {
		chromedriver.findElement(InsertionLbttn).click();
	}

	public void OnInsertionLLPage() {
		String actualTitleINLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleINLL = "Insertion";
		Assert.assertEquals(actualTitleINLL, ExpectedTitleINLL, "Condition true");
	}
	
	public void DeletionLLBtn() {
		chromedriver.findElement(DeletionLbttn).click();
	}

	public void OnDeletionLLPage() {
		String actualTitleDLL =Helper.getTitle();
		//System.out.println(actualTitleIntro);
		String ExpectedTitleDLL = "Deletion";
		Assert.assertEquals(actualTitleDLL, ExpectedTitleDLL, "Condition true");
	}
	
	 public void PQLLBtn() {
			chromedriver.findElement(PQLLbttn).click();
		}
	
	 public void OnPQLLpage() {
			
	    	String actualTitlePQLL = Helper.getTitle();
	    	//System.out.println("title:" +actualTitlePQLL);
	    	String expectedTitlePQLL = "Practice Questions";
	    	Assert.assertEquals(actualTitlePQLL, expectedTitlePQLL, "Condition true");
	    	}

	public void SignoutBtn() {
		Helper.NavBack();
		chromedriver.findElement(Signoutbttn).click();
	}
}
