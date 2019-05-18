package touhida;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class First {
	@Test
	public void firstTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		
	}

}
