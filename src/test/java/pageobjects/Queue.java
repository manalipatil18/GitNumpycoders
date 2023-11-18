package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.ExcelReader;
import Utilities.Helper;
import stepdefinition.Bclass;

public class Queue extends Bclass{

	
	private static final String Excelpath = "C:/Users/kirti/eclipse-workspace/NumpyNinja_Project/src/test/resources/Exceldata/Pythoncode.xlsx";
	By GTBttn = By.xpath("//a[@href= 'queue' and @class='align-self-end btn btn-lg btn-block btn-primary']");
	By Implemantationbtn = By.xpath("//a[text()='Implementation of Queue in Python']");
	By TextArea = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By VOutput = By.xpath("//*[@id='output']");
	By ImpleUsingcolbtn = By.xpath("//a[text()='Implementation using collections.deque']");
	By ImpleUsingarrbtn = By.xpath("//a[text()='Implementation using array']");
	By QueueOpbtn = By.xpath("//a[text()='Queue Operations']"); 
	By PrQbtn = By.xpath("//a[text()='Practice Questions']");
	
	private WebDriver chromedriver;
	private String Code;
	public Queue(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}
	
	public void getstartedbttn() {
		chromedriver.findElement(GTBttn).click();
	}
	
	 public void OnQueuemainpage() {
	String actualTitleQ = Helper.getTitle();
	//System.out.println("title:" +actualTitleQ);
	String expectedTitleQ = "Queue";
	Assert.assertEquals(actualTitleQ, expectedTitleQ, "Condition true");
	
	 }
	
	 public void ImpleBttn() {
			chromedriver.findElement(Implemantationbtn).click();
		}
	
	 public void OnImplepage() {
			String actualTitleIMP = Helper.getTitle();
			//System.out.println("title:" +actualTitleIMP);
			String expectedTitleIMP = "Implementation of Queue in Python";
			Assert.assertEquals(actualTitleIMP, expectedTitleIMP, "Condition true");
			
			 }
	 
	 public void Readpythoncode(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		 ExcelReader reader = new ExcelReader();
		 
		 List<Map<String, String>> testdata = reader.getData(Excelpath,Sheetname);
		 Code = testdata.get(RowNumber).get("Code");
		 chromedriver.findElement(TextArea).sendKeys(Code);
	 	    Thread.sleep(1000);
	 }
	 
	 public void ValidOp() {
		 WebElement e1 = chromedriver.findElement(VOutput);
	    	System.out.println(e1.getText());
	    }
	 
	 public void Readinvalidcode(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		 ExcelReader reader = new ExcelReader();
		 
		 List<Map<String, String>> testdata1 = reader.getData(Excelpath,Sheetname);
		 Code = testdata1.get(RowNumber).get("Code");
		 chromedriver.findElement(TextArea).sendKeys(Code);
	 	    Thread.sleep(1000);
	 }
	 
	 public void ImpleUsingcollectionsBttn() {
			chromedriver.findElement(ImpleUsingcolbtn).click();
		}
	
	 public void OnImpleUsingCollpage() {
			String actualTitleIUC = Helper.getTitle();
			//System.out.println("title:" +actualTitleIUC);
			String expectedTitleIUC = "Implementation using collections.deque";
			Assert.assertEquals(actualTitleIUC, expectedTitleIUC, "Condition true");
			
			 }
	 
	 public void ImpleUsingArrBttn() {
			chromedriver.findElement(ImpleUsingarrbtn).click();
		}
	
	 public void OnImpleUsingArrpage() {
			String actualTitleIUAr = Helper.getTitle();
			//System.out.println("title:" +actualTitleIUAr);
			String expectedTitleIUAr = "Implementation using array";
			Assert.assertEquals(actualTitleIUAr, expectedTitleIUAr, "Condition true");
			
			 }	
	 
	 public void QueueOpBttn() {
			chromedriver.findElement(QueueOpbtn).click();
		}
	
	 public void OnQueueOppage() {
			String actualTitleQOP = Helper.getTitle();
			//System.out.println("title:" +actualTitleQOP);
			String expectedTitleQOP = "Queue Operations";
			Assert.assertEquals(actualTitleQOP, expectedTitleQOP, "Condition true");
			
			 }	
	 public void PracticeQBtn() {
			chromedriver.findElement(PrQbtn).click();
		}
	    
	    public void OnPRQpage() {
			
	    	String actualTitlePQQ = Helper.getTitle();
	    	//System.out.println("title:" +actualTitlePQQ);
	    	String expectedTitlePQQ = "Practice Questions";
	    	Assert.assertEquals(actualTitlePQQ, expectedTitlePQQ, "Condition true");
	    	}
	 
}
