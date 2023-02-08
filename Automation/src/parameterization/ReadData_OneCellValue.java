package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_OneCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		String path = "D:\\Data\\Test UN Pass.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		String Data = WorkbookFactory.create(file).getSheet("ab").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("Cell value is: "+Data);
	}

}
