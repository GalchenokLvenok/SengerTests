package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Block {
    WebDriver driver;
    String label;
    String blockLocator = "//div[contains(@class,'%s')]";

    public Block(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public By findBlock() {
        return By.xpath(String.format(blockLocator, label));
    }
}
