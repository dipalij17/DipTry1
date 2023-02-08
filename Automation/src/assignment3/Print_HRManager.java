package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Print_HRManager {

	public static void main(String[] args) throws IOException {

		String path = "D:\\Data\\Employee.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Assign");
		
		String data = sheet.getRow(3).getCell(3).getStringCellValue();
		
		System.out.println("Cell value is: "+data);
		
	}

}
