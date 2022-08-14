package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.youtube.com/");
	}

}
