package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class DataInputProvide{
	public static String[][] readExcel(String fileName) throws InvalidFormatException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new File("./data/" + fileName + ".xlsx"));
		XSSFSheet worksheet = workbook.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		int rowCount = worksheet.getLastRowNum();
		int cellCount = worksheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = worksheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.toString();
			}
		}
		workbook.close();
		return data;
	}

}