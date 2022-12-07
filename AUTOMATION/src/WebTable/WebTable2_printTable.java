package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2_printTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("file:///E:/Yojana/new/Sept2022/HTML/webtable.html");
		Thread.sleep(2000);

		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();

		for (int i = 1; i <= rowSize; i++) {// row
			int colSize = 0;
			if (i == 1) {
				colSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/th")).size();
			} else {
				colSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td")).size();
			}

			for (int j = 1; j <= colSize; j++) {// column
				String text = "";
				if (i == 1) {
					text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/th[" + j + "]"))
							.getText();
				} else {
					text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();
				}
				System.out.print(text + " ");
			}

			System.out.println();

		}
		driver.quit();

	}
}
