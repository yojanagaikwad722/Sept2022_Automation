package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) {
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");
		//key - browser name
		//value - chromedriver.exe file path
		WebDriver driver = new ChromeDriver();//upcasting
		
		//4. maximize()
		driver.manage().window().maximize();
		
		//5. minimize()
		driver.manage().window().minimize();
		
		//1. get()
		driver.get("https://www.amazon.in/");
		
		//6. getTitle()
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		if(actTitle.equals(expTitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//7. getCurrentUrl
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);//https://www.amazon.in/

		
		//2. close()
		//driver.close();
		
		//3. quit()
		driver.quit();
	}
}
