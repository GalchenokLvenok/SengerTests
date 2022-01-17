package pages;

import elements.Block;
import elements.Logo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(new Block(driver,"block-bike-demand").findBlock());
    }
}
