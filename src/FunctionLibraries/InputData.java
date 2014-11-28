package FunctionLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputData {
	
	public String readInputData(String dataField) throws IOException {
		
 		FileInputStream excelFile = null;
 		String dataValue=null;
 		
 		try {
	 			
 				File directory = new File ("");
	 	 		String absolutepath	=	directory.getAbsolutePath();
	 	 		String  objectRepositoryFile= absolutepath + "\\Data.xlsx";
 				excelFile = new FileInputStream(new File(objectRepositoryFile)); 
 				XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
 				XSSFSheet sheet = workbook.getSheet("Sheet1");
 				int rowCount = sheet.getLastRowNum() + 1;
 				int colCount = sheet.getRow(0).getLastCellNum();
 					for(int i =1; i < rowCount; i++)
 					{
	 					XSSFRow row = sheet.getRow(i);
	 					int j =0;
	 					DataFormatter df = new DataFormatter();
	 					String fieldName = df.formatCellValue(sheet.getRow(i).getCell(j));
	 					if(fieldName.equalsIgnoreCase(dataField))
	 					{
	 						dataValue = df.formatCellValue(sheet.getRow(i).getCell(j+1));
	 						break;
	 					}	
 					}
 		} catch (Exception e) {
 			System.out.println("Exception: " + e.getMessage());
 			return dataValue;
 		} finally {
 			excelFile.close();
 		}
		return dataValue;		
	}
}
