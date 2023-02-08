package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String Path = "D:\\Data\\Test UN Pass.xlsx";

		FileInputStream file = new FileInputStream(Path);
		
		Double data = WorkbookFactory.create(file).
	    getSheetAt(1).
//		getSheet("Sheet1").
		getRow(0).
		getCell(1).
		getNumericCellValue();
		
		System.out.println(data);
	}

}
