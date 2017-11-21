package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qatest.base.BasePage;
import qatest.utilities.Config;

/**
 * Created by amarpreet911 on 11/2/17.
 */
public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Config.homeLogoDisplay)
    WebElement homeLogo;

    public boolean getHomeLogo(){
        System.out.println("The home logo is "+homeLogo.getText());
        return homeLogo.isDisplayed();
    }

}
