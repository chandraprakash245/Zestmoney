package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static WebDriver driver;
    private static String URL="https://www.facebook.com";

    @BeforeSuite
    public void startDriver(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        driver.get(URL);
    }

    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}