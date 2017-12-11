package demonewtours_001_11_14_17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class DragAndDrop {
	WebDriver driver;

	@BeforeMethod 
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@org.testng.annotations.Test
	 public void mainTest() {
	 driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	 WebElement drag = driver.findElement(By.id("draggable"));
	 WebElement drop = driver.findElement(By.id("droppable"));
	 Actions action = new Actions(driver);
	 action.dragAndDrop(drag,drop).perform();
	 
		
	}


}
