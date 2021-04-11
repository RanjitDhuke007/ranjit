package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getlastRow_lastColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		 // step 1)..
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");
		
		//Step  2)....
		// Statement Last Row index
		// int lastRow = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
    //    System.out.println("Total No Of Row is: " +(lastRow+1));

	
	  // To How many column in Excel sheet...
        // get last cell No
        int lastcell = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
        System.out.println("Total No Of Cell is: " +(lastcell));
	
	}

}
