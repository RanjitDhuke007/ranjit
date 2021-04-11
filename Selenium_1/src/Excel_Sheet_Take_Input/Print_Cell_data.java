package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_Cell_data
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel3.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		// Suppose we want Print 1 cell of Excel file...
		int data = sh.getLastRowNum();
		int getRow;
		for(int i=0; i<=data-1;i++)
		{
			String cell1data = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cell1data);
		}
		System.out.println();
		
		// Print 2 Nd cell Of Excel Sheet....
		for(int i=0;i<=data-1;i++)
		{
			double cell2data=sh.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(cell2data);
		}
		
		

	}

}
