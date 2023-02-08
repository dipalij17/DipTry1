package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintEmp_toString {

	public static void main(String[] args) throws IOException {

		String path = "D:\\Data\\Employee.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Assign");
		
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=rowCount;r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cellCount;c++)
			{
				
				String data = sheet.getRow(r).getCell(c).toString();
				
				System.out.print(data+" | ");
			}
			
			System.out.println();
		}
		
	}

}
