import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\premd\\\\eclipse-workspace\\\\Feb2018\\\\jars\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//os
		WebDriver driver=new ChromeDriver();
		//Different browsers
		driver.get("http://www.facebook.com");
//		qa.facebook.com
//		stage.facebookTest.com


		String fname = "//input[@name='firstname']";
		String lname = "//input[@name='lastname']";
		
		// reusable function
		
		driver.findElement(By.xpath(fname)).sendKeys("Hassan");
		driver.findElement(By.xpath(lname)).sendKeys("Bhuiyan");
		// less duplicate or less code
		
	}

}
