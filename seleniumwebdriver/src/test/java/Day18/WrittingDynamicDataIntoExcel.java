package Day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamicData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter how may cells: ");
		int cells = sc.nextInt();
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c=0;c<cells;c++) {
				
				XSSFCell currentCell = currentRow.createCell(c);
				System.out.println("Enter the value for "+r+" row and "+c+" cell");
				currentCell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created...");
		
	}

}
