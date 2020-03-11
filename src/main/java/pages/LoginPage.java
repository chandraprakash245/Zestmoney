package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){ super(driver); }

    @FindBy(id= "email")
    private WebElement email;

    @FindBy(id = "pass" )
    private WebElement password;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;

    public void login(String userEmail,String userPassword){
        sendKeys(email,userEmail);
        sendKeys(password,userPassword);
        loginButton.click();
    }

}