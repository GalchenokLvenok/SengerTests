package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HeaderAndFooterTest extends BaseTest {


    @Test(description = "Positive smoke test to check header link")
    public void headerLinkWorks() {
        loginPage.open()
                 .login("Autotest","xKx4uMqgASw4VAc");
        assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.clickLink("Fahrräder")
                .clickLink("Reparaturservice");
        assertTrue(reparaturservicePage.isPageOpened(),"Reparaturservice page is not opened");
        reparaturservicePage.clickLogo("Senger Neo Logo");
        assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

}
