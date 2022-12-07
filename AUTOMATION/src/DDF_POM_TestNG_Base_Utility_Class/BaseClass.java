package DDF_POM_TestNG_Base_Utility_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	static WebDriver driver;
	public static void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (10)\\chromedriver.exe");
	
		//Handling of Notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);// upcasting

		driver.manage().window().maximize();
		
		//1. implicitlyWait - applicable to browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to(UtilityClass.getPropertyFileData("url"));
	}
}
