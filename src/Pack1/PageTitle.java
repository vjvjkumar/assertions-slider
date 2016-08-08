package Pack1;


	import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;

	public class PageTitle {
		
	public static void main (String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			/*WebDriver driver = new FirefoxDriver();*/
			driver.get("http://www.bbc.co.uk/");
			//driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[2]/a")).click();
			
			//Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='sport']/div[1]/header/div")).isDisplayed());
			
			Assert.assertTrue(driver.getTitle().equalsIgnoreCase("sport"));
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("V:\\SeleniumJars\\vj.jpg"));
			
			System.out.println("Test Passed: Sport");
			driver.close();
		
	}
	
}
