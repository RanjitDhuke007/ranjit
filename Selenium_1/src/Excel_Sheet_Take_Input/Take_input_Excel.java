package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Take_input_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	   // step  1).....
		FileInputStream file=new  FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel2.xlsx");
		
		// Step  2)...
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
       System.out.println(data);
       
       
	}

}
