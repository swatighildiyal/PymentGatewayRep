package pGUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public static String Test_Data_Path="F:\\Users\\ghildiyal\\eclipse-workspace\\Guru99PaymentGateway\\src\\main\\java\\pGUtility\\TestData_PaymentGateway1 (1).xlsx";
	static Workbook workBook;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream(Test_Data_Path);
			
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			workBook=WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
		sheet=workBook.getSheet(sheetName);
		
	
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
