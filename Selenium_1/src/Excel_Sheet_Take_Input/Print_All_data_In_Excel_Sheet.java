package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_All_data_In_Excel_Sheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel3.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		// Suppose we want Print All cell And Row of Excel Sheet...
		int lastrow = sh.getLastRowNum();
		
		for(int i=0;i<=lastrow; i++)
		{
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
				 String row1 = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(row1+"  ");

			}
			System.out.println();
		}
		

		
		
		
		
		
		
		
	}

}
