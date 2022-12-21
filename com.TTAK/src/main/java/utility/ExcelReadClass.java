package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.sdk.metrics.data.Data;
import lombok.ToString;

public class ExcelReadClass {

	public static FileInputStream f;
	public static XSSFWorkbook b; 
	public static XSSFSheet s;
	public static FileOutputStream fos ;

	// method to read String value from excel sheet.
	
		public static String readStringData(int i, int j) throws IOException {


			f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TTAKSMARTTestData.xlsx");
			b = new XSSFWorkbook(f);
			s = b.getSheet("sheet1");
			Row r = s.getRow(i);
			Cell c= r.getCell(j);
			
			return c.getStringCellValue();
			
			
		}
		
		// method to read integer value from excel sheet.
		public static String readIntegerData(int i, int j) throws IOException {
			f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TTAKSMARTTestData.xlsx");
			b = new XSSFWorkbook(f);
			s = b.getSheet("sheet1");
			Row r = s.getRow(i);
			Cell c= r.getCell(j);
			long a = (long) c.getNumericCellValue();
			
			return String.valueOf(a);
			}
}
	
	
		










