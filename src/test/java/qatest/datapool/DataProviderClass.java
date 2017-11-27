package qatest.datapool;

import org.testng.annotations.DataProvider;

/**
 * Created by amarpreet911 on 11/25/17.
 */
public class DataProviderClass {
   // public static final String TestDataExcel = "testDataExcel";

    private static DataReader reader = new DataReader();

    @DataProvider(name = "TestDataExcel")
    public static Object[][] testData() {
        return reader.getCredentials("/home/amarpreet911/Documents/Selenium/Selenium_Workspace/SeleniumJavaAutomation/src/test/resources/TestData.xls", "sheet1");
      //  return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }
}
