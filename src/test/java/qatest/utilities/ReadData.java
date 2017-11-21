package qatest.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import qatest.utilities.Config;

import java.io.IOException;

/**
 * Created by amarpreet911 on 11/5/17.
 */
public class ReadData {

    String src;
    XSSFWorkbook srcBook;
    XSSFSheet sourceSheet;

    public ReadData(String sheetName) throws IOException{
        src = Config.testDataExcel;
        // Load the file.
        srcBook = new XSSFWorkbook(src);
        //XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        XSSFSheet sourceSheet = srcBook.getSheet(sheetName);
        System.out.println("the sheet's last row is "+sourceSheet.getLastRowNum());

    }
}
