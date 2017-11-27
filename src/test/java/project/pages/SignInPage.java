package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qatest.base.BasePage;
import qatest.utilities.Config;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by amarpreet911 on 11/2/17.
 */
public class SignInPage extends BasePage{

    public SignInPage() {
        PageFactory.initElements(driver(), this);
    }

    @FindBy(xpath = Config.userId)
    WebElement userID;
    //@FindBy(name = "uid")

    @FindBy(xpath = Config.userPassword)
   // @FindBy(name = "password")
    WebElement userPassword;

    @FindBy(xpath = Config.loginButton)
    WebElement loginButton;

    @FindBy(name = Config.resetButton)
    WebElement resetButton;

    //Setting up the username
    @Step()
    public void setUserName(String userID){
        this.userID.clear();
        System.out.println("usermane in signin page is "+userID);
        this.userID.sendKeys(userID);
    }

    // Setting up the password
    @Step
    public void setUserPassword(String userPassword){
        this.userPassword.clear();
        this.userPassword.sendKeys(userPassword);
    }

    // Click on the login button
    @Step
    public void clickLogin(){
        clickElement(loginButton);
        //loginButton.click();
    }

    // Click on the reset button
    @Step
    public void clickReset(){
        resetButton.click();
    }

    @Step
    public boolean isPageDisplayed() {
        Boolean page = canViewElement(3, loginButton);
        System.out.println("the page displayed is "+page);
        return page;
    }

}



