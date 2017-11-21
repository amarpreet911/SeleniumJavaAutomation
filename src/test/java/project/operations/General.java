package project.operations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import project.pages.SignInPage;
import qatest.base.BasePage;

/**
 * Created by amarpreet911 on 11/20/17.
 */
public class General extends BasePage{

    public void login(String username, String password) {
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertTrue(signInPage.isPageDisplayed(), "Not on the signIn page of the website");
        signInPage.setUserName(username);
        signInPage.setUserPassword(password);
        signInPage.clickLogin();
    }

    public void logout(){

    }
}
