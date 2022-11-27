package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteClass {

	public static FileInputStream f;
	public static XSSFWorkbook b; 
	public static XSSFSheet s;
	public static FileOutputStream fos ;
//
//	public void writeExcel(String sheetName,String cellValue,int row,int col) throws IOException {
//
//		String path =System.getProperty("user.dir")+"\\src\\main\\resources\\SMARTTestData.xlsx"; 
//		File file = new File(path);
//		FileInputStream fs= new FileInputStream(file);
//		XSSFWorkbook wb = new XSSFWorkbook();
//		XSSFSheet sheet = wb.getSheet(sheetName);
//		sheet.getRow(row).createCell(col).setCellValue(cellValue);
//		FileOutputStream fos = new FileOutputStream(new File(path));
//		wb.write(fos);
//		wb.close();
//	}
	public static  void writeExcel( int i, int j) throws IOException {
		f = new FileInputStream("E:\\SMART_AUTOMATION\\SMART_TTAK\\com.TTAK\\src\\main\\resources\\SMARTTestData.xlsx");
		b = new XSSFWorkbook(f);
		s = b.getSheet("sheet1");
		Row r = s.getRow(i);
		Cell c= r.getCell(j);
		//s.getRow(i).createCell(j).setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(new File("E:\\SMART_AUTOMATION\\SMART_TTAK\\com.TTAK\\src\\main\\resources\\SMARTTestData.xlsx"));
		b.write(fos);
		b.close();
		//return c.getStringCellValue();
		
		
	}
}






