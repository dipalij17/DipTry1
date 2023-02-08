package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Print_LastRowCellNo {

	public static void main(String[] args) throws IOException {

		String path = "D:\\Data\\Employee.xlsx";
				
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("Total number of rows are: "+rowCount);
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of cells are: "+cellCount);

	}

}
