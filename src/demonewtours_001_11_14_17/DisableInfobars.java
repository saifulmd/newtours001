package demonewtours_001_11_14_17;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisableInfobars {
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
         driver.get("https://www.flipkart.com/acer-switch-one-atom-quad-core-2-gb-32-gb-emmc-storage-windows-10-home-sw110-1ct-2-1-laptop/p/itmeuffxwtnysagz?pid=COMEUFFXY7GKJQUU&srno=b_1_1&otracker=hp_banner_widget_3&lid=LSTCOMEUFFXY7GKJQUUXP8KC4&fm=organic&iid=df3d73ca-d7d5-49cd-bf6b-eb7b60dec9b2.COMEUFFXY7GKJQUU.SEARCH&ppt=Store%20Browse&ppn=Search%20Page&ssid=kori151dj40000001512000853360");
        	Actions actions = new Actions(driver);
        	actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/div[1]/img"))).perform();
        }
        
}
