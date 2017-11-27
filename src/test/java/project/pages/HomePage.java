package project.pages;

import org.openqa.selenium.NoSuchElementException;
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
public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver(), this);
    }

    @FindBy(xpath = Config.homeLogoDisplay)
    WebElement homeLogo;
    @FindBy(partialLinkText = "/m/logout/")//xpath = Config.homeDropDown)
    WebElement homeDropDown;
    @FindBy(xpath = Config.homeDDSignOut)
    WebElement homeDDSignOut;

 /*   public boolean getHomeLogo(){
        try {
            System.out.println("The output is ::::::::::::::::;;" + homeLogo.isDisplayed());
            //  System.out.println("The home logo is "+homeLogo.getText());
            return homeLogo.isDisplayed();//false;//homeLogo.isDisplayed();
        }catch(NoSuchElementException e){
            return false;  //System.out.println("The found exception:::::::::::::: "+e);
        }
    }*/

    public boolean isLoggedInHome(){
        Boolean pageExist = canViewElement(3, homeLogo);
        System.out.println("the page displayed is "+pageExist);
        return pageExist;
    }

    @Step
    public void clickDropDown(){
        clickElement(homeDropDown);
    }

    @Step
    public void clickSignOut(){
        clickElement(homeDDSignOut);
    }

}
