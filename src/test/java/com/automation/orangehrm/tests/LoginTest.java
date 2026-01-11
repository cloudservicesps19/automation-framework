

package com.automation.orangehrm.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.orangehrm.base.BaseTest;
import com.automation.orangehrm.pages.DashboardPage;
import com.automation.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyTitle() {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println(loginPage.getPageTitle());
    }
    
   
    
    @Test
    public void loginTest() {
    	
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        
        String title = dashboardPage.getPageTitle();

        Assert.assertTrue(title.contains("OrangeHRM"),
                "Login failed or Dashboard not loaded");
    }
}