package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tusha\\Downloads\\TechNirbhar_batch1.xlsx");
		
		 Workbook workbook = new XSSFWorkbook(fis);
		 
		Sheet Sheet = workbook.getSheet("Sheet1");
		
		 // Read specific cell: Row 1 (index 0), Column 2 (index 1)
        Row row1 = Sheet.getRow(5); // first row
        Cell cell1 = row1.getCell(1); // second column
        
        System.out.println(cell1);
        
        
     int number_ofRows = Sheet.getPhysicalNumberOfRows();
     
     System.out.println("number_ofRows "+number_ofRows);
     
     Row Header_row = Sheet.getRow(0);
     
     int number_ofColumn =  Header_row.getPhysicalNumberOfCells();
     
     
     System.out.println("number_ofColumn "+number_ofColumn);
     
     
    
     for(int i=0; i<=number_ofRows-0;i++) {
    	 
    	 Row Row_num = Sheet.getRow(i);
    	 
    	 
    	 for(int j=0; j<number_ofColumn;j++) {
    		 
    		 Cell cell_value = Row_num.getCell(j);
    		 
    		 System.out.println("Cell values for given row are "+cell_value);
    		 
    		 
    		 
    	 }
     }
		
		 
	
     
        
        

	}

}
