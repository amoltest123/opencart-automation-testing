package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main(String[] args) throws IOException {
		getData("C:\\Users\\MANISHA\\eclipse-workspace\\Opencart_Automation\\testData\\LoginData.xlsx", "Sheet1");
	}
	// Method to read excel file
	public static Object[][] getData(String filePath, String sheetName) throws IOException {

		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] data;
		data=new Object [rowCount+1][colCount];
		for(int i = 1; i<=rowCount; i++) {

			Row row = sheet.getRow(i);

			for(int j = 0; j<colCount; j++) {

				Cell cell = row.getCell(j);

				if(cell!=null) {

					if(cell.getCellType() == CellType.STRING) {

						data [i][j] = cell.getStringCellValue();
					}

					else if(cell.getCellType() == CellType.NUMERIC) {

						data [i][j] = cell.getNumericCellValue();
					}
					else if(cell.getCellType() == CellType.BLANK) {

						data [i][j] = "";
					}
					else {

						data [i][j] = "";								
					}
				}
			}

		}
		System.out.println(data.length+"   "+ data[0].length);
		workbook.close();
		return data;
	}

}
