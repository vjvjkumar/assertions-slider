package Pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class SliderMove {
	
	static WebDriver driver;
	
	@Test
	public void slider_move() throws InterruptedException{
	//public static void main (String args[]) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.rokit.co.uk/vintage-womens");

	WebElement slider = driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/fieldset[1]/div/div/div"));
	Thread.sleep(3000);

	Actions moveSlider = new Actions(driver);
	Action action = moveSlider.dragAndDropBy(slider, 10, 0).build();
				
	action.perform();
	
}	
}
