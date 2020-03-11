package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class BasePage {
    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void wait(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public  void sendKeys(WebElement element,String param){
        element.sendKeys(param);
    }

    public void acceptAlertPopup() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        sleep(1000);
        alert.accept();
        sleep(1000);
        Actions action = new Actions(driver);

    }
}
