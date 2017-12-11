package demonewtours_001_11_14_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Resizable {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        driver = new ChromeDriver(options);
	}
	 @Test
     public void test() {
      driver.get("http://jqueryui.com/resizable/");
      Actions actions = new Actions(driver);
      WebElement dragg = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
     // actions.clickAndHold(dragg).moveByOffset(100,50).release(dragg).build().perform();
      actions.moveToElement(dragg).dragAndDropBy(dragg, 100, 100).build().perform();
     
}

}
