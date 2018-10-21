import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe")
		
		System.out.println(System.getProperty("user.dir"));
		
		WebDriver driver=new ChromeDriver();
		
		
	}

}
