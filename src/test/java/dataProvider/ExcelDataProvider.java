package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {  
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File src=new File("./applicationtestdata/Appdata.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			  wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println("exception is"+e.getMessage());
		}
	}
	
	public String getData(int sheetIndex,int row,int column)
	{
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}

	public Double getData1(int sheetIndex,int row,int column)
	{
	double data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getNumericCellValue();
		
		return data;
	}

	public String getData(String sheetname,int row,int column)
	{
		String data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
}
