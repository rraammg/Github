package Github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {
	
	public static void google()
	{
	 WebDriverManager.chromedriver().setup();
     WebDriver WD=new ChromeDriver();
     WD.get("http://www.google.com");
	}

}
