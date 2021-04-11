package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_Boolean_Data 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	   // step 1)..
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");
		
		//Step  2)....
		boolean booleandata = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();

		System.out.println(booleandata);
		
		
		
	}

}
