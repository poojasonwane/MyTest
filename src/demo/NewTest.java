package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{
	 WebDriver driver;
	 
	 @BeforeClass
	  public void testSetup()
	  {
		  
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();

	  }
	 
	 @BeforeMethod
	 public void openBrowser()
	  {
		  driver.get("https://lms.fortunecloudindia.com/");
		  
	  }
	
	  @Test
	  public void signUp()
	  {
		  WebElement usr = driver.findElement(By.name("username"));
		  usr.sendKeys("poojasonwane00@gmail.com");
			
		  WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys("7W0XPDS");
			
		  driver.findElement(By.name("login")).click();
		  
		  Assert.assertEquals("LMS | Fortune Cloud Technologies", driver.getTitle(), "Test Case Pass");

	  }
	  
	  
	  
	  @AfterMethod
	  public void postSignUp()
	  {
		  System.out.println(driver.getCurrentUrl());

	  }
	  @AfterClass
	  public void afterClass()
	  {
	  driver.quit();
	  }
	   
}
