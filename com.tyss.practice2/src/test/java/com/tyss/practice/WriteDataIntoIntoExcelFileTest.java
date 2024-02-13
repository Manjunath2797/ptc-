package com.tyss.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoIntoExcelFileTest {

	public static void main(String[] args) throws Exception {

		Workbook wb = null;
		FileOutputStream fos = null;

		try {
			
			wb = WorkbookFactory.create(true); // Create a new .xlsx file

			// Create a sheet
			Sheet sheet = wb.createSheet("Sheet1");

			// Write data to the sheet
			sheet.createRow(0).createCell(0).setCellValue("Hii, Excel!"); // Create a row at index 0
			
			// Save the workbook to a file
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
