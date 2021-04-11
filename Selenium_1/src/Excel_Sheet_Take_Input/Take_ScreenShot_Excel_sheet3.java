package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Take_ScreenShot_Excel_sheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// Step  1)...
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");

		// Step  2)....
		Sheet data1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		// Print All Excel by Using Excel Sheet....
		ArrayList list=new ArrayList();
		for(int i=0;i<=5;i++)
		{
			list.add(data1.getRow(i).getCell(0));
					//.getStringCellValue());
		}
		
		// If value Is Not Present then It Takes 'null'  Value....
		ArrayList list1=new ArrayList();
		for(int i=0;i<=5;i++)
		{
			list1.add(data1.getRow(i).getCell(1));
					//.getNumericCellValue());
		}

		// Print All data...
		System.out.println(list);
		System.out.println(list1);
		
		// fetch Data of Excel Sheet by using For Loop....
		for(int i=0;i<=5;i++)
		{
			System.out.print(list.get(i)+"   "+list1.get(i));
			System.out.println();
		}

		
	
		

	}

}
