package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_PrintAllDataUsingCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\Sept2022\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());// 2 - counts row from 0th index
		System.out.println(sh.getLastRowNum() + 1);// 3 - actual row size

		short cellSize = sh.getRow(0).getLastCellNum();// counts no. of elements of row
		System.out.println(cellSize);// 5

		for (int i = 0; i <= sh.getLastRowNum(); i++) {// row
			for (int j = 0; j <= sh.getRow(i).getLastCellNum() - 1; j++) {// column
				Cell cellInfo = sh.getRow(i).getCell(j);
				CellType CT = cellInfo.getCellType();

				if (CT == CellType.STRING) {
					System.out.print(cellInfo.getStringCellValue() + " ");
				} else if (CT == CellType.NUMERIC) {
					System.out.print(cellInfo.getNumericCellValue() + " ");
				} else if (CT == CellType.BOOLEAN) {
					System.out.print(cellInfo.getBooleanCellValue() + " ");
				}
			}

			System.out.println();
		}
	}
}
