package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

}
