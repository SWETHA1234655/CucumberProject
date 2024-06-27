package Utilities;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cellname;
	public static XSSFCell cellmail;
	public static XSSFCell cellphone;
	public static String username,mail,phone;
	
	
	public static void getCellData()throws IOException
	{
		String path = System.getProperty("user.dir") + "\\Excel\\ReadFile.xlsx";
	FileInputStream file=new FileInputStream(path);
	wb=new XSSFWorkbook(file);
	sheet=wb.getSheet("Sheet1");
	int rowsize=sheet.getLastRowNum();
	int cellsize=sheet.getRow(1).getLastCellNum();
	
	row=sheet.getRow(1);
	cellname=row.getCell(0);
	username=cellname.getStringCellValue();
	cellmail=row.getCell(1);
	mail=cellmail.getStringCellValue();
	cellphone=row.getCell(2);
	phone=cellphone.toString();
	
	}
	
	
	
	
	
	
	
	

}
