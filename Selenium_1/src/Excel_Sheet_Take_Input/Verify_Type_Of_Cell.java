package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verify_Type_Of_Cell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	   // 1. Step 1
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");
	
	// 2. CAll celltype Func to verify Cell type of data
	 Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
	CellType celldata = data.getRow(4).getCell(1).getCellType();
	System.out.println(celldata);
	
	
	CellType celldata1 = data.getRow(5).getCell(0).getCellType();
	System.out.println(celldata1);
	
	CellType celldata2 = data.getRow(5).getCell(2).getCellType();
	System.out.println(celldata2);
	
	
	CellType celldata3 = data.getRow(4).getCell(2).getCellType();
	System.out.println(celldata3);
	
	
	}

}
