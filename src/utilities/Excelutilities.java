package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelutilities {
	
	
	public static String getCellValue(String xl,String sheet,int r,int c)
	{
		try
		{
			File f =new File(xl);
			FileInputStream fi= new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=(XSSFCell) wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
				
			}
			else
			{
				//double v= cell.getNumberCellValue();
				//int val=(int)v;
				//return String.valueof(val)
				return cell.getRawValue();//senkeys only support values
			}
			
		}
	
	catch(Exception e)
		{
		return "";
		}
	}
	public static int getRowCount (String xl,String sheet)
	{
	try 
	{
File f =new File(xl);
	FileInputStream fi= new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	return wb.getSheet(sheet).getLastRowNum();
	
	
		
	}
	
	catch(Exception e) {
		return 0;
	}
	
	
	}
	
	

}
