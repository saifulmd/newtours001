package demonewtours_001_11_14_17;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class WebTable {
 
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        driver = new ChromeDriver(options);
	}	
	     
	
        @Test
        public void test() {
         driver.get("https://cleartrip.com/trains/22692/");
        // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(0,1550);");
         List<WebElement> rowCount =driver.findElements(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr"));
         System.out.println(rowCount.size());
         List<WebElement> colCount =driver.findElements(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr[1]/td"));
         System.out.println(colCount.size());
         int row = rowCount.size();
         int col = colCount.size();
        for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
        String text = driver.findElement(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
	    // System.out.print(text);
        String name = "Jhansi Junction (JHS)";
          
	     if (text.equals(name)) {
	    	 System.out.println(name +"is Found in row: " + i +" col: "+ j);
			break;
		}
	     
		}
          System.out.println();
          
			
		}
        driver.findElement(By.xpath("//*[@id=\"Tdate\"]")).click();

}
}