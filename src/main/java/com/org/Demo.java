

package com.org;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\SHALINI\\eclipse-workspace\\Data_Driven\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wd = new XSSFWorkbook(fis);
		Sheet sheetAt = wd.getSheetAt(0);
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				
				else if (cellType.equals(cellType.NUMERIC)) {
					double numeric = cell.getNumericCellValue();
					System.out.println(numeric);
				}

			}
		}
	}
}