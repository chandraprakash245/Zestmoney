package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashBoardPage extends BasePage {
    public DashBoardPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//div[@role=\"presentation\"])[3]")
    private WebElement statusBar;

    @FindBy(xpath = "//a[@id=\"creation_hub_entrypoint\"]")
    private WebDriver dashboard;

    @FindBy(xpath = "(//div/button[@type=\"submit\"])[1]")
    private WebElement submitButton;

    public String statusText = "Hello World";

    public void enterStatus(){
        wait(statusBar);
        statusBar.click();
        statusBar.sendKeys(statusText);
    }

    public void postStatus(){
        wait(submitButton);
        submitButton.click();
    }

}
