package Pack1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAssertion {
	
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		boolean exists=driver.findElement(By.id("vijaykumar")).isEnabled();
		Assert.assertTrue(exists);
		
		driver.findElement(By.id("Email")).sendKeys("vijaykumar");
	}

}
