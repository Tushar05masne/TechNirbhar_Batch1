package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static XSSFWorkbook workbook;
	    static XSSFSheet sheet;

	    public static Object[][] getData(String path, String sheetName) {

	        Object[][] data = null;

	        try {
	            FileInputStream file = new FileInputStream(path);
	            workbook = new XSSFWorkbook(file);
	            sheet = workbook.getSheet(sheetName);

	            int rows = sheet.getPhysicalNumberOfRows();
	            int cols = sheet.getRow(0).getPhysicalNumberOfCells();
	            data = new Object[rows - 1][cols];

	            for (int i = 1; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return data;
	    }
}
