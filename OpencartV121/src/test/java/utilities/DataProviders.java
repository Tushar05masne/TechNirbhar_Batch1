package utilities;

import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException
	{
		String xlpath = ".\\testData\\Opencart_LoginData.xlsx";	// taking xlpath from testData
		
		ExcelUtility xlutils = new ExcelUtility(xlpath);		// creating object for ExcelUtility
		
		int totalrows = xlutils.getRowCount("Sheet1");
		int totalcols = xlutils.getCellCount("Sheet1", 1);

		String[][] logindata = new String[totalrows][totalcols];	// creating for 2D array which can store LoginId and Password
		
		//reading data from xlsheet
		for(int i=1;i<=totalrows;i++)		// 1 as data in row starts from 1
		{
			for(int j=0;j<totalcols;j++)		// 0 as data in column starts from 0
			{
				logindata[i-1][j] = xlutils.getCellData("Sheet1", i, j);		//i-1 as we are storing data in array and its index starts from 0		
			}
		}
		return logindata;
	}
	
	
}
