package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1_getRowSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("file:///E:/Yojana/new/Sept2022/HTML/webtable.html");
		Thread.sleep(2000);
		
		//int rowSize = driver.findElements(By.xpath("//tr")).size();
		//System.out.println(rowSize);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		int rowSize = allRows.size();
		System.out.println(rowSize);//5
		
		int cellSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th")).size();
		System.out.println(cellSize);//3
		
		driver.quit();
	}
}
