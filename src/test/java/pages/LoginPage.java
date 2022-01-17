package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final By USERNAME_INPUT = By.id("id_username");
    public static final By PASSWORD_INPUT = By.id("id_password");
    public static final By LOGIN_BUTTON = By.cssSelector("[type = submit]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(URL);
        return this;
    }

    public void login(String user, String psw) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(psw);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
