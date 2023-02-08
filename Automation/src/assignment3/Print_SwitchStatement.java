package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Print_SwitchStatement {

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
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING : System.out.print(cell.getStringCellValue()); break;
				
				case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
				
				case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
				
				default : System.out.print("Data is matched");
				
				}
				
				System.out.print(" | ");
			}
			
			System.out.println();
		}
				
	}

}
