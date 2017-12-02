package qatest.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import qatest.reporting.TestListner;
import qatest.utilities.Config;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by amarpreet911 on 11/2/17.
 */
/*@Listeners(TestListner.class)*/

public class BaseTest {

    public static WebDriver driver;
    WebDriverWait wait;

    public static WebDriver driver(){
        return driver;
    }

    @BeforeSuite
    public void init(){

    }

    @BeforeClass
    public void setDriver() throws InterruptedException{
        System.out.println("1.) for firefox");
        System.out.println("2.) for chrome");
        System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
        driver = new ChromeDriver();
        /*Scanner input = new Scanner(System.in);

        int chooseDriver = input.nextInt();

        switch(chooseDriver){
            case 1:
                System.setProperty("webdriver.gecko.driver", Config.firefoxDriverPath);
                driver = new FirefoxDriver();
            case 2:
                System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
                driver = new ChromeDriver();
        }*/
        driver.get(Config.webSiteUrl);

        wait = new WebDriverWait(driver,3);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(1000);
    }

    @BeforeMethod
    public void setUp()
    {
        isSkipped();


        //  driver.manage().window().maximize();
    }

    public void isSkipped(){

    }
}
