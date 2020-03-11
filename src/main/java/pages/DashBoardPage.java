package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    public DashBoardPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="js_6")
    private WebElement statusTextBar;

    @FindBy(xpath = "//span[text()='Post']")
    private WebElement submitButton;

    public void enterStatus(String statusText) throws InterruptedException {
        Thread.sleep(10000);
        wait(statusTextBar);
        statusTextBar.click();
        statusTextBar.sendKeys(statusText);
    }

    public void postStatus(){
        wait(submitButton);
        submitButton.click();
    }

}