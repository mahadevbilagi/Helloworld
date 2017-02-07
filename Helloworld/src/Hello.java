import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello!");

		System.setProperty("webdriver.gecko.driver","C:\\Users\\mahadev\\git\\Helloworld\\Helloworld\\Lib\\geckodriver.exe");     // Gecko driver path setup

	//	WebDriver driver = new FirefoxDriver();
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https:\\www.google.com");
		
	}

}
