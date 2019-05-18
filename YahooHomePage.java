package touhida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooHomePage {
	@Test
	public void homePage(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		driver.findElement(By.id("uh-signin")).click();
		
		
		
		
		
		
		driver.findElement(By.name("username")).sendKeys("zakib_cse@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("createacc")).click();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Zakib");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Khan");
		
		
	}

}
