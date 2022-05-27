package utility;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "G:\\poonam automation support\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	

	}

}
