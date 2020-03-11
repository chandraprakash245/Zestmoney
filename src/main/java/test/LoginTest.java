package test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    private static String userEmail="chandru.245K@yahoo.in";
    private static String userPass="keerthi245$";
    private static String statusText = "Hello World";

    @Test
    public void login()  {
        //initializing login page
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        //login to facebook
        loginPage.login(userEmail,userPass);
    }

    @Test(dependsOnMethods = {"login"})
    public void enterStatus() throws InterruptedException {
        //initializing dashboard page
        DashBoardPage dashBoardPage = PageFactory.initElements(driver,DashBoardPage.class);
        //passing status text
        dashBoardPage.enterStatus(statusText);
        //posting the status
        dashBoardPage.postStatus();
        Thread.sleep(10000);
    }
}