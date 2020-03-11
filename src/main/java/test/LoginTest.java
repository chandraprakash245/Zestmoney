package test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 0)
    public void login()  {

        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

        //login to facebook
        loginPage.login();
    }

    @Test(priority = 1)
    public void enterStatus() throws InterruptedException {
        DashBoardPage dashBoardPage = PageFactory.initElements(driver,DashBoardPage.class);

        //passing status text
        dashBoardPage.enterStatus();

        //posting the status
        dashBoardPage.postStatus();
    }


}