package demonewtours_001_11_14_17;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PracticeWebTable {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	driver = new ChromeDriver(options);
		
		
	}
	@Test
	public void test() {
		//driver.get("https://cleartrip.com/trains/22692");
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).click();
		//driver.findElement(By.id("ui-id-98"));
		//drop.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@id=\'hp-widget__depart\']")).click();
		driver.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).click();
		driver.findElement(By.linkText("6")).click();

		

	}
}