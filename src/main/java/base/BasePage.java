package base;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void wait(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void sendKeys(WebElement element,String param){
        element.sendKeys(param);
    }
}