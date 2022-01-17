package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link {
    WebDriver driver;
    String label;
    String linkLocator = "//nav[contains(@aria-label,'Hauptnavigation')]//span[contains(text(),'%s')]";

    public Link(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public WebElement findLink() {
        return driver.findElement(By.xpath(String.format(linkLocator, label)));
    }
}
