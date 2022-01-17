package pages;

import elements.ActiveClass;
import elements.Logo;
import org.openqa.selenium.WebDriver;

public class ReparaturservicePage extends BasePage {

    public ReparaturservicePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened() && isExist(new ActiveClass(driver,"reparaturservice active").classIsActive());
    }

    public ReparaturservicePage open() {
        driver.get(URL + "reparaturservice/");
        return this;
    }

    public void clickLogo(String name) {
        driver.findElement(new Logo(driver,name).findLogo()).click();
    }
}
