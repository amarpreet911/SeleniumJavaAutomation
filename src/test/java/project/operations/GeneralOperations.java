package project.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.pages.HomePage;
import project.pages.SignInPage;
import qatest.base.BasePage;
import qatest.utilities.Config;

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
        try {
            Assert.assertTrue(signInPage.isPageDisplayed(), "Not on the signIn page of the website");
        }catch(AssertionError e){
            System.out.println("Getting to the signIn page url");
            driver().get(Config.webSiteUrl);
        }
        signInPage.setUserName(username);
        signInPage.setUserPassword(password);
        signInPage.clickLogin();
    }

    public void signOut(){
        HomePage homePage = new HomePage();
        try{
            Assert.assertTrue(homePage.isLoggedInHome(), "Cannot Signout as the user is not LoggedIn");
        }catch(AssertionError e){
            System.out.println("The assertion error found while logging out is "+e);
        }
        homePage.clickDropDown();
      //  homePage.clickSignOut();
    }
}
