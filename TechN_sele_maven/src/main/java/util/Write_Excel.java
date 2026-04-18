package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		// Create a new workbook
		 Workbook workbook = new XSSFWorkbook();
        
        // Create a sheet
         org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("DemoSheet123");
        
        // Create a row
        Row row = sheet.createRow(0);
        
        // Create cells and set values
        
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("SN");
       
        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Name");
        
        Cell cell3 = row.createCell(2);
        cell3.setCellValue("Age");
        
        // Add another row
        Row row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("1");
        row2.createCell(1).setCellValue("Tushar");
        row2.createCell(2).setCellValue(28);
        
        
        Row row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("2");
        row3.createCell(1).setCellValue("Mahesh");
        row3.createCell(2).setCellValue(38);
        
        
        
        Row row4 = sheet.createRow(3);
        row4.createCell(0).setCellValue("3");
        row4.createCell(1).setCellValue("Tejashwini");
        row4.createCell(2).setCellValue(23);
        
        
        Row row5 = sheet.createRow(4);
        row5.createCell(0).setCellValue("4");
        row5.createCell(1).setCellValue("Mitali");
        row5.createCell(2).setCellValue(23);
        
        
        
        Row row6 = sheet.createRow(5);
        row6.createCell(0).setCellValue("5");
        row6.createCell(1).setCellValue("Monika");
        row6.createCell(2).setCellValue(27);
        
        
        
        // Write to file
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\tusha\\Downloads\\example1234.xlsx")) {
            workbook.write(fos);
            workbook.close();
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	}


