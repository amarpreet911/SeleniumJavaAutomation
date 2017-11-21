package project.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.pages.SignInPage;
import qatest.base.BasePage;

/**
 * Created by amarpreet911 on 11/20/17.
 */
public class GeneralOperations extends BasePage{
    WebDriver driver;
    public GeneralOperations() {
        PageFactory.initElements(driver(), this);
    }

    public void login(String username, String password) {
        SignInPage signInPage = new SignInPage();
        Assert.assertTrue(signInPage.isPageDisplayed(), "Not on the signIn page of the website");
        System.out.println("useername in general is username:::"+username);
        signInPage.setUserName(username);
        signInPage.setUserPassword(password);
        signInPage.clickLogin();
    }

    public void logout(){

    }
}
