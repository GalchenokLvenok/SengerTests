package pages;

import elements.ActiveClass;
import org.openqa.selenium.WebDriver;

public class RacingBikesPage extends BasePage {

    public RacingBikesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened() && isExist(new ActiveClass(driver,"rennrader active").classIsActive());
    }

    public RacingBikesPage open() {
        driver.get(URL + "rennräder/");
        return this;
    }
}
