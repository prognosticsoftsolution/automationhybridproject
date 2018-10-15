package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;
import dataProvider.Xls_Reader;

public class DataProviderFactory {
	
	
	public static ConfigDataProvider getConfig() {
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
	}
	public static ExcelDataProvider getExcel()
	{
		ExcelDataProvider excel =new ExcelDataProvider(); 
		return excel;
	}

}
  