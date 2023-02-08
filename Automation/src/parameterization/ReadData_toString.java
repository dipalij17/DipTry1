package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_toString {

	public static void main(String[] args) throws IOException {

		String path = "D:\\Data\\TestData.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Test1");
		
		int rowCount = sheet.getLastRowNum();
	
		System.out.println("Total no of rows are:"+rowCount);
	
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total no of cells are:"+cellCount);
		
		for(int r=0;r<=rowCount;r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cellCount;c++)
			{
				XSSFCell cell = row.getCell(c);
				
				String value = cell.toString();
				
				System.out.print(value+"   |");
			}
			
			System.out.println();
		}
		
	}

}
