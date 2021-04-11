package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_Data_Using_CellType 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
		   // 1. Step 1
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");
		
		// 2. Call celltype Func to verify Cell type of data
		  Cell data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2);
		CellType cellinfo = data.getCellType();
		
		
		if(cellinfo==CellType.STRING)
		{
			System.out.println(data.getStringCellValue());
		}
		else if(cellinfo==CellType.NUMERIC)
		{
			System.out.println(data.getNumericCellValue());
		}
		else if(cellinfo==CellType.BOOLEAN)
		{
			System.out.println(data.getBooleanCellValue());
		}
	}

}
