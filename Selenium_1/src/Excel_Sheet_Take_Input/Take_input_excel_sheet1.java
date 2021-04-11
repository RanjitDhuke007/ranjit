package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Take_input_excel_sheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		// Step  1).....
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel2.xlsx");
		
		
		// Step  2).....
		Sheet exceldata = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		// Step 3)....
		System.out.println( exceldata.getRow(0).getCell(0).getNumericCellValue());
		System.out.println( exceldata.getRow(0).getCell(1).getNumericCellValue());
		System.out.println( exceldata.getRow(0).getCell(2).getNumericCellValue());
		System.out.println( exceldata.getRow(0).getCell(3).getNumericCellValue());
		System.out.println( exceldata.getRow(1).getCell(0).getNumericCellValue());
		System.out.println( exceldata.getRow(1).getCell(1).getNumericCellValue());
		
		
	}

}
