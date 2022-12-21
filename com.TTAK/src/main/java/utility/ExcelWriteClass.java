package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.constant.ConstantValueParser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;



public class ExcelWriteClass 
{
	public static Platform platform;
	
	//Location of Test data excel file
    public static String testDataExcelPath = null;
public static String File_TestData ="SMARTTTAK_TestCases.xlsx";
public static String excelPath=System.getProperty("user.dir")+"\\src\\main\\resources\\TTAKSMARTTestData.xlsx";

    //Excel WorkBook
    private static XSSFWorkbook excelWBook;

    //Excel Sheet
    private static XSSFSheet excelWSheet;

    //Excel cell
    private static XSSFCell cell;

    //Excel row
    private static XSSFRow row;

    

    //This method gets excel file, row and column number and set a value to the that cell.
    public static String setCellData(String value, int RowNum, int ColNum) throws Exception {
        
        	  FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TTAKSMARTTestData.xlsx");
              excelWBook = new XSSFWorkbook(ExcelFile);
              excelWSheet = excelWBook.getSheet("Sheet1");
              Row row = excelWSheet.getRow(RowNum);
  			Cell cell= row.getCell(ColNum);
                DataFormatter formatter = new DataFormatter();
                String cellData = formatter.formatCellValue(cell);
                if (cell == null) {
                    cell = row.createCell(ColNum);
                    cell.setCellValue(value);
                } else {
                	
                    cell.setCellValue(value);
                }
                          
           FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TTAKSMARTTestData.xlsx");
            excelWBook.write(fileOut);

          
            fileOut.close();
            return cell.getStringCellValue();
       
        }
    }


  



        
    



