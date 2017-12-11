package demonewtours_001_11_14_17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;



public class Test {
	WebDriver browsers;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
		browsers = new ChromeDriver();
	}
			
	@org.testng.annotations.Test
	public void register() throws InterruptedException {
	
		browsers.get("http://newtours.demoaut.com/");
		browsers.findElement(By.linkText("REGISTER")).click();
		browsers.findElement(By.name("firstName")).sendKeys("kamal");
		browsers.findElement(By.name("lastName")).sendKeys("hossain");
		browsers.findElement(By.name("phone")).sendKeys("7702775703");
		browsers.findElement(By.name("userName")).sendKeys("kamal123@hotmail.com");
		browsers.findElement(By.name("address1")).sendKeys("lawrenceville,ga30044");
		browsers.findElement(By.name("city")).sendKeys("Lawrenceville");
		browsers.findElement(By.name("state")).sendKeys("GA");
		browsers.findElement(By.name("postalCode")).sendKeys("30044");
		Select drop = new Select (browsers.findElement(By.name("country")));
		//drop.selectByVisibleText("UNITED STATES");
		//drop.selectByIndex(3);
		
		drop.selectByValue("4");
		browsers.findElement(By.name("email")).sendKeys("saifulmd123");
		browsers.findElement(By.name("password")).sendKeys("kamal123");
		browsers.findElement(By.name("confirmPassword")).sendKeys("kamal123");
		browsers.findElement(By.name("register")).click();
		browsers.findElement(By.linkText("SIGN-OFF")).click();
		browsers.findElement(By.name("userName")).sendKeys("saifulmd123");
		browsers.findElement(By.name("password")).sendKeys("kamal123");
		browsers.findElement(By.name("login")).click();
		browsers.findElement(By.xpath("//input[@name ='tripType' and @value = 'oneway']")).click();
	    drop = new Select (browsers.findElement(By.name("passCount")));
	    drop.selectByValue("3");
	    drop = new Select (browsers.findElement(By.name("fromPort")));
	    drop.selectByVisibleText("London");
	    drop = new Select (browsers.findElement(By.name("toPort")));
		drop.selectByVisibleText("Seattle");
	    drop = new Select (browsers.findElement(By.name("toMonth")));
		drop.selectByValue("5");
	 	browsers.findElement(By.xpath("//input[@name ='servClass' and @value = 'Business']")).click();
	 	drop = new Select (browsers.findElement(By.name("airline")));
	 	drop.selectByVisibleText("Blue Skies Airlines");
		browsers.findElement(By.name("findFlights")).click();
		browsers.findElement(By.xpath("//input[@name ='outFlight' and @value = 'Blue Skies Airlines$361$271$7:10']")).click();
		browsers.findElement(By.xpath("//input[@name ='inFlight' and @value = 'Blue Skies Airlines$631$273$14:30']")).click();
		browsers.findElement(By.name("reserveFlights")).click();
		browsers.findElement(By.name("passFirst0")).sendKeys("kamal");
	   	browsers.findElement(By.name("passLast0")).sendKeys("hossain");
	   	drop = new Select (browsers.findElement(By.name("pass.0.meal")));
	   	drop.selectByValue("DBML");
	   	browsers.findElement(By.name("passFirst1")).sendKeys("zamal");
		browsers.findElement(By.name("passLast1")).sendKeys("hossain");
	 	drop = new Select (browsers.findElement(By.name("pass.2.meal")));
		drop.selectByValue("BLML");
		browsers.findElement(By.name("passFirst2")).sendKeys("Mamun");
		browsers.findElement(By.name("passLast2")).sendKeys("hossain");
		drop = new Select (browsers.findElement(By.name("pass.1.meal")));
		drop.selectByValue("KSML");
		drop = new Select (browsers.findElement(By.name("creditCard")));
		drop.selectByValue("BA");
		browsers.findElement(By.name("creditnumber")).sendKeys("145789034");;
		drop = new Select (browsers.findElement(By.name("cc_exp_dt_mn")));
		drop.selectByIndex(2);
		drop = new Select (browsers.findElement(By.name("cc_exp_dt_yr")));
		drop.selectByValue("2010");
		browsers.findElement(By.name("cc_frst_name")).sendKeys("Mamunur");
		browsers.findElement(By.name("cc_mid_name")).sendKeys("Rahman");
		browsers.findElement(By.name("cc_last_name")).sendKeys("Mia");
		//browsers.findElement(By.xpath("//input[@name ='ticketLess' and @value = 'checkbox']")).click();
		browsers.findElement(By.name("billAddress1")).clear();
		browsers.findElement(By.name("billAddress1")).sendKeys("271 congresspkwy");
		browsers.findElement(By.name("billCity")).clear();
		browsers.findElement(By.name("billCity")).sendKeys("Lawrenceville");
		browsers.findElement(By.name("billState")).clear();
		browsers.findElement(By.name("billState")).sendKeys("GA");
		browsers.findElement(By.name("billZip")).clear();
		browsers.findElement(By.name("billZip")).sendKeys("30044");
		drop = new Select (browsers.findElement(By.name("billCountry")));
		drop.selectByVisibleText("UNITED STATES ");
		browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).click();
		browsers.findElement(By.name("delAddress1")).clear();
		browsers.findElement(By.name("delAddress1")).sendKeys("271 congresspkwy");
		browsers.findElement(By.name("delCity")).clear();
		browsers.findElement(By.name("delCity")).sendKeys("Lawrenceville");
		browsers.findElement(By.name("delState")).clear();
		browsers.findElement(By.name("delState")).sendKeys("GA");
		browsers.findElement(By.name("delZip")).clear();
		browsers.findElement(By.name("delZip")).sendKeys("30044");
		drop = new Select (browsers.findElement(By.name("delCountry")));
		drop.selectByVisibleText("UNITED STATES");
	    browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[25]/td/input")).click();
		browsers.findElement(By.name("buyFlights")).click();
		
		
	   
		 
		  
		 
		
		
		
		
		
	}

	

}
