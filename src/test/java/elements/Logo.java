package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logo {
    WebDriver driver;
    String label;
    String logoLocator = "//header//a[contains(@class,'home-link')]//img[contains(@alt,'%s')]";

    public Logo(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public By findLogo() {
        return By.xpath(String.format(logoLocator, label));
    }
}
