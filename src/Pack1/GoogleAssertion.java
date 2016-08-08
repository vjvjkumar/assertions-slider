package Pack1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleAssertion {

	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
			driver.get("http://google.com");
			driver.manage().window().maximize();
		
			String title=driver.getTitle();
			System.out.println(title);
		
			//Assert.assertEquals("Google_page", title);
			Assert.assertEquals("Google", title);
			driver.findElement(By.linkText("Gmail")).click();
		
	}
}
