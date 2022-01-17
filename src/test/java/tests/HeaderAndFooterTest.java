package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HeaderAndFooterTest extends BaseTest {


    @Test(description = "Positive test")
    public void transferShouldBeSucceed() {
        loginPage.open();
        assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.login(USER_LOGIN, USER_PSW);
        assertTrue(homePage.isPageOpened(), "Login is failed");
        transfersBetweenAccountsPage.open();
        assertTrue(transfersBetweenAccountsPage.isPageOpened(), "Transfer between accounts page is not opened");

        Transfer transfer = TransferFactory.get();

        transfersBetweenAccountsPage
                .fillTransfer(transfer)
                .submit("Continue")
                .submit("Confirm");
        assertTrue(successPopup.isPageOpened(), "Transfer is not succeed");
    }


}
