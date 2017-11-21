package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;
import project.pages.HomePage;
import project.pages.SignInPage;
import qatest.base.BaseTest;

/**
 * Created by amarpreet911 on 11/2/17.
 */
public class SignInTests extends BaseTest {

    //allure testingadapter for @title annotation
    @Title("Title-TST-1")
    @Test(testName = "TST-1", priority=1, description = "Test for Valid_Credentials")
    public void signInScreen() throws InterruptedException{
        System.out.println("This should run second");
        // the below driver comesfrom BaseTest class
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = new HomePage(driver);
        signInPage.setUserName("***********@gmail.com");
        signInPage.setUserPassword("*************");

        signInPage.clickLogin();
        Assert.assertTrue(homePage.getHomeLogo(), "Unable to Login");
        Thread.sleep(6000);
    }

    @Title("Title-TST-2")
    @Test(testName = "TST-2", priority=1, description = "Test for Invalid_Credentials")
    public void signInScreenIN() throws InterruptedException{
        System.out.println("This should run second");
        // the below driver comesfrom BaseTest class
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = new HomePage(driver);
        signInPage.setUserName("amarpreet911@gmail.com");
        signInPage.setUserPassword("************");
        signInPage.clickLogin();
        Assert.assertFalse(homePage.getHomeLogo(), "Unable to Login");
        Thread.sleep(6000);
    }

}
