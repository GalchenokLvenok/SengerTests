package pages;

import elements.Block;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RacingBikesPage extends BasePage {

    public RacingBikesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(new Block(driver,"").findBlock());
    }

    public RacingBikesPage open() {
        driver.get(URL + "rennräder/");
        return this;
    }
}
