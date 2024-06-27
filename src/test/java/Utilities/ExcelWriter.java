package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	public static void main(String[] args) throws IOException
	{
		String filePath = System.getProperty("user.dir") + "\\Excel\\WriteFile.xlsx";
		FileOutputStream file=new FileOutputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Sheet1");
		XSSFRow row=sheet.createRow(0);
		        row.createCell(0).setCellValue("Health Insurance");
		        
		wb.write(file);
		wb.close();
		file.close();
		
		
	}
	public static void setCellData(String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		String xlfile = System.getProperty("user.dir") + "\\Excel\\WriteFile.xlsx";
		FileInputStream fi = new FileInputStream(xlfile);
	    XSSFWorkbook xb = new XSSFWorkbook(fi);
	    XSSFSheet ws = xb.getSheet(xlsheet);
	    // Check if the row exists, and create one if it doesn't
	    XSSFRow row = ws.getRow(rownum);
	    if (row == null) {
	         row = ws.createRow(rownum);
	    }
	    // Create a cell in the row and set its value
	    XSSFCell cell = row.createCell(colnum);
	    cell.setCellValue(data);
	    // Write the changes back to the file
	    FileOutputStream fo = new FileOutputStream(xlfile);
	    xb.write(fo);
	    // Close all the resources to prevent memory leaks
	    xb.close();
	    fi.close();
	    fo.close();
	}
	

}
