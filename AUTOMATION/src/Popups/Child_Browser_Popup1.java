package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver_win32 (9)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(8000);
		
		//String idOfMainPage = driver.getWindowHandle();
		//System.out.println(idOfMainPage);//CDwindow-AAF6E584BBC7B4E3CF0B01F3C52E5748
		
		Set<String> idsOfMainChildPage=driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(idsOfMainChildPage);
		System.out.println(al.get(0));//main window id - CDwindow-68A478B5C5AAFC2259777358DB423BD1
		System.out.println(al.get(1));//child window id- EEC1ABF2C7B9A828DD1A7ADE26105B0E
		
		Thread.sleep(2000);
		driver.quit();
	}
}
