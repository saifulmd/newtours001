package demonewtours_001_11_14_17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class MouseHoverOne {
	public class Tooltip {
		WebDriver driver;

		@BeforeMethod 
		public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		@org.testng.annotations.Test
		 public void mainTest() {
		 driver.get("https://getbootstrap.com/docs/4.0/components/tooltips/");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(0,1550);");
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[1]"))).perform();
		 actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[2]"))).perform();
		 actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[3]"))).perform();
		 actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[4]"))).perform();
		 actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[5]"))).perform();


		 
		 
		 

}
}
}