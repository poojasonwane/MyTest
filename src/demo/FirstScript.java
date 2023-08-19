package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{
	//TestScenario - Verify Login Functionality
	
	//Tc_1 open Browser
	//Tc-1 Navigate to url
	//Tc_1 Enter username
	//Tc_1 Enter Password
	//Tc_1 click on login button

	public static void main(String[] args) 
	{
		//connect to browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
	//Navigate to url
		d1.get("https://www.facebook.com/");
		
		//maximize window
		d1.manage().window().maximize();
	}

}
