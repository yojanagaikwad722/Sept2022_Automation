package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\Sept2022\\ExcelSheets\\Excel1.xlsx");
		
		//1. getStringCellValue() - to read String,Character data
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);//Quantum Academy
		
		//2. getNumericCellValue() - to read numeric(decimal+non-decimal) data
		double data2 = sh.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data2);//100.0
		
		//explicit casting
		int d2 = (int)data2;
		System.out.println(d2);//100
		
		//3. getBooleanCellValue() - to read boolean data
		boolean data3 = sh.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data3);//false
		
		String data4 = sh.getRow(0).getCell(3).getStringCellValue();
		System.out.println(data4);
		
		String data5 = sh.getRow(0).getCell(4).getStringCellValue();
		System.out.println(data5);//200
		
		

	}
}
