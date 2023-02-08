package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ReadDataSwitch {

	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\Data\\TestData.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Test1");
		//workbook.getSheetAt(0);
		
		int RowCount = sheet.getLastRowNum();
		
		System.out.println("Total No of Rows are: "+RowCount);
		
		int CellCount = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total No of Cells are: "+CellCount);

		
		for(int r=0;r<=RowCount;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<CellCount;c++)
			{
				XSSFCell cell = row.getCell(c);
				
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); 
				break;
				}
				
				System.out.print("   |   ");
			}
			
			System.out.println();			
		}
			
	}

}
