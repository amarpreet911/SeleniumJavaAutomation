package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.operations.GeneralOperations;
import project.pages.SignInPage;
import qatest.datapool.DataProviderClass;
import ru.yandex.qatools.allure.annotations.Title;
import project.pages.HomePage;
import qatest.base.BaseTest;
import org.testng.annotations.DataProvider;

/**
 * Created by amarpreet911 on 11/2/17.
 */
public class SignInTests extends BaseTest {

    //allure testingadapter for @title annotation
    @Title("Title-TST-1")
    @Test(testName = "TST-1", priority=1, dataProvider = "TestDataExcel", dataProviderClass = DataProviderClass.class,
            description = "Test for Valid_Credentials")
    public void signInScreen(String userName, String password) throws InterruptedException, AssertionError{
        System.out.println("This should run second");
        GeneralOperations operations = new GeneralOperations();
        operations.login(userName, password);
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isLoggedInHome(), "Unable to Login");
        operations.signOut();
        //homePage.navigateBackButton();
        //Thread.sleep(6000);
    }

    @Title("Title-TST-2")
    @Test(testName = "TST-2", priority=1, dataProvider = "TestDataExcel", dataProviderClass = DataProviderClass.class
            ,description = "Test for Invalid_Credentials")
    public void signInScreenIN(String userName, String password) throws InterruptedException, AssertionError{
        System.out.println("This should run second");
        GeneralOperations operations = new GeneralOperations();
        operations.login(userName, password);
        HomePage homePage = new HomePage();
        try {
            Assert.assertFalse(homePage.isLoggedInHome(), "LoggedIn: Test failed");
        }catch(AssertionError e){
            System.out.println("Gt the assertion error(For Invalid Credentials) "+e);
            operations.signOut();
        }
        //Thread.sleep(6000);
        //homePage.navigateBackButton();
    }
}
