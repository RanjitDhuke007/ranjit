package Excel_Sheet_Take_Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_All_data_Using_cellType 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		  // 1. Step 1
				FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Excel4.xlsx");
				
		// 2. Call celltype Func to verify Cell type of data
			  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			
		// To print All data Using For Loop
			  for(int i=0;i<=sh.getLastRowNum();i++)  // For Row..
			  {
				  for(int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) // for Cell
				  {
					  Cell cellinfo = sh.getRow(i).getCell(j);
					  CellType celldata = cellinfo.getCellType();
					  
					  if(celldata==CellType.STRING)
					  {
						  System.out.print(cellinfo.getStringCellValue()+ " ");
					  }
					  else if(celldata==CellType.NUMERIC)
					  {
						  System.out.print(cellinfo.getNumericCellValue()+ " ");
					  }
					  else if(celldata==CellType.BOOLEAN)
					  {
						  System.out.print(cellinfo.getBooleanCellValue()+ " ");
					  }
				  }System.out.println();
			  }
		
		
		
		
		
		
		
		
		
		
		
	}

}
