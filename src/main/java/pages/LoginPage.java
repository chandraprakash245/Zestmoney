package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath= "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id=\"pass\"]" )
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement login;

    public void login(){
        sendKeys(email,"chandru.245K@yahoo.in");
        sendKeys(password,"keerthi245$");
        login.click();
    }

}
