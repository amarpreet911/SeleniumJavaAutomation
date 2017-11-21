/*
package qatest.dataprovider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import qatest.utilities.Config;

import java.io.IOException;

*/
/**
 * Created by amarpreet911 on 11/5/17.
 *//*

public class Dataprovider {

    String src;
    XSSFWorkbook srcBook;
    XSSFSheet sourceSheet;
    XSSFCell cell;

  */
/*  public void readData(int sheetNumber, int rowNumber, int colNumber) throws IOException {
        sourceSheet = srcBook.getSheetAt(sheetNumber);

    }*//*

    @DataProvider(name = "readData")
    public Object[][] readData(String sheetName) throws IOException{
        src = Config.testDataExcel;
        // Load the file.
        srcBook = new XSSFWorkbook(src);
        //XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        sourceSheet = srcBook.getSheet(sheetName);

        System.out.println("the sheet's last row is "+sourceSheet.getLastRowNum());
        int rowLast = sourceSheet.getLastRowNum();
        int col  = sourceSheet.getLeftCol();

        System.out.println("the sheet's last col is "+col);
        XSSFRow row = sourceSheet.getRow(0);
        System.out.println("actual last column is  "+row.getLastCellNum());
        int colCount = row.getLastCellNum();
        Object data[][] = new Object[rowLast][col];

        //for(int i=1; i <= sourceSheet.getLastRowNum(); i++){
        for(int i=1; i <= sourceSheet.getLastRowNum(); i++){
            // Import data for Email.

            cell = sourceSheet.getRow(i).getCell(1);//.getRow(i).getCell(1);
            //  cell.setCellType(Cell.CELL_TYPE_STRING);
         //   driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());

            // Import data for password.
            cell = sourceSheet.getRow(i).getCell(2);
            //   cell.setCellType(Cell.CELL_TYPE_STRING);
           // driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
        }

        return Object[0][0];
    }

}
*/
