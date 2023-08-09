package SauceDemo_Projec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omayo
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		//create object WebDriver With ChromeDriver
		
		WebDriver driver = new ChromeDriver();
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://omayo.blogspot.com/");
	    Thread.sleep(2000);
	    
	    //Scroll
	    //Step1: create object of javascriptExecuter
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    //way1: Scrolling using pixel
	    js.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	      
	    js.executeScript("window.scrollBy(0,-3000)");
	    Thread.sleep(2000); 
	    
	  //STEP 1:Create object of actions class 
        Actions a= new Actions(driver);
   
	    a.moveToElement(driver.findElement(By.id("blogsmenu"))).click().perform();
		Thread.sleep(1000);
       
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"multiselect1\"]/option[2]"))).click().perform();
	    Thread.sleep(1000);
	    
	    js.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
		//Radio options 
		driver.findElement(By.xpath("//*[@id=\"radio1\"]")).click();
		Thread.sleep(2000);	
		
	//Alert Demo
		driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
		Thread.sleep(2000); 
	 
	//Click on Ok Button
        driver.switchTo().alert().accept();
     
    //Get Prompt
		driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000); 
		
	//Get Confirmation
		 driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
	     Thread.sleep(2000);
	 
	//Click on Ok Button
	     driver.switchTo().alert().accept();

	}}