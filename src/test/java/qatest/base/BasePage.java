package qatest.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by amarpreet911 on 11/5/17.
 */
public class BasePage extends BaseTest {

    public void waitForElementVisibility(WebElement element){
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
    }

    @Step
    public void clickElement(WebElement element){
        element.click();
    }

    @Step
    public void navigateBackButton(){
        driver.navigate().back();
    }

    @Step
    public void navigateForwardButton(){
        driver.navigate().forward();
    }

    protected void type(String value, WebElement element){
        try{
            wait(1);
            element.clear();
            element.sendKeys(value);
        }catch(Exception e){
            System.out.println("The exception in Base page while typing is "+e);
            e.printStackTrace();
        }

    }

    public void wait(int seconds) throws InterruptedException{
            Thread.sleep(seconds * 1000);
    }

    public boolean canViewElement(int timeOut, WebElement element){
        try {
            new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception te) {
            return false;
        }
    }

}
