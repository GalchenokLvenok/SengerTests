package pages;

import elements.Logo;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public static final String URL = "https://senger.neo.dev.fnstrt.de/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement waitVisibilityOfElement(String element) {
        return new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
    }

    public boolean isPageOpened() {
        return isExist(new Logo(driver,"Senger Neo Logo").findLogo());
    }

    public boolean isExist(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
