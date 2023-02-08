package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintEmp_ifElse {

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
				
				CellType datatype1 = cell.getCellType();
				
				String datatype = datatype1.toString();
																		
				if(datatype.equals("STRING"))
				{
					System.out.print(cell.getStringCellValue()+"  |");
				}
				else if(datatype.equals("NUMERIC"))
				{
					System.out.print(cell.getNumericCellValue()+"  |");
				}
				else if(datatype.equals("BOOLEAN"))
				{
					System.out.print(cell.getBooleanCellValue()+"  |");
				}
				else
				{
					System.out.print("Data not matched  |");
				} 
				
			}
			
			System.out.println();

		}
				
	}

}
