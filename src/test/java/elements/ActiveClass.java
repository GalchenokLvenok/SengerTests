package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiveClass {
    WebDriver driver;
    String label;
    String classLocator = "//a[@class='%s']";

    public ActiveClass(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public By classIsActive() {
        return By.xpath(String.format(classLocator, label));
    }
}
