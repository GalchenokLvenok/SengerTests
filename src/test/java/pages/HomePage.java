package pages;

import elements.Block;
import elements.Link;
import elements.Logo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public boolean isPageOpened() {
        return isExist(new Block(driver,"block-bike-demand").findBlock());
    }

    public HomePage clickLink(String name) {
            new Link(driver,name).findLink().click();
            return this;
    }
}
