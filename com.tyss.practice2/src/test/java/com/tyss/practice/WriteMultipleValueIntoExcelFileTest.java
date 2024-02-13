package com.tyss.practice;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleValueIntoExcelFileTest {

	public static void main(String[] args) throws Exception {
		
		WriteMultipleValueIntoExcelFileTest write = new WriteMultipleValueIntoExcelFileTest();
		write.multipleDataIntoExcel("Sheet1", null);
	}

	public  void multipleDataIntoExcel(String sheetname , List listName) throws Exception {

		Workbook wb = null;
		FileOutputStream fos = null;

		try {
			
			wb = WorkbookFactory.create(true); // Create a new .xlsx file

			// Create a sheet
			Sheet sheet = wb.createSheet(sheetname);
			
			for (int i = 0 ; i <=  sheet.getLastRowNum() ; i++)
			{
				
				for (int j = 0 ; j < sheet.getRow(i).getFirstCellNum() ; j++) {
					
				
					sheet.createRow(i).createCell(j).setCellValue("Hii, Excel!");
				}
			}
		
			fos = new FileOutputStream(".\\src\\test\\resources\\AdvanceSelenium.xlsx");
			wb.write(fos);
			System.out.println("Excel file created successfully.");
		} 
		catch (Exception e) {
		} 
		finally {
			fos.close();
		}
	}
}
