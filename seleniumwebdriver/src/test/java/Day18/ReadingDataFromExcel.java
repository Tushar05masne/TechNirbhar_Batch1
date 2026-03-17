package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File --> Workbook --> Sheets -->Rows--> Cells

// FileInputStream -> for reading data		FileOutputStream--> for writing data
// System.getProperty("user.dir")--> D:\\myWork\\Testing\\Java\\workspaces\\seleniumwebdriver

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");		// Sheet1- sheetname
		
		int 	totalRows = sheet.getLastRowNum();
		int rows = sheet.getPhysicalNumberOfRows();		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		
		System.out.println("Total number of rows: "+totalRows);		//5	- counting rows from 0
		System.out.println("Total physical number of rows: "+rows);	// 6 
		System.out.println("Total number of cells: "+totalCells);		//4	- counting cells from 1
		
		for(int r=0;r<=totalRows;r++) {					// row starts from 0 that's why it's r<=totalRows
			
			XSSFRow	currentrow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) {				// cell starts from 1 thats why its c<totalCells
				XSSFCell	 cell =	currentrow.getCell(c);
				System.out.print(cell.toString()+"\t\t");
			}
			System.out.println();		
		}
		workbook.close();
		file.close();
	}

}
