package DDF_POM_TestNG_Base_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\url.properties");
		obj.load(file);
		String value = obj.getProperty(key);
		return value;
	}

	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"E:\\Yojana\\new\\Sept2022\\workspace\\AUTOMATION\\TestData\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("GitHUB");
		String data = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
	}

	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"E:\\Yojana\\new\\Sept2022\\workspace\\AUTOMATION\\screenshots\\screenshot_" + TCID + ".png");
		FileHandler.copy(src, dest);
	}
}
