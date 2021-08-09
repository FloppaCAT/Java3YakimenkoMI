package Pages;

import Util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver = DriverManager.getDriverManager().getDriver();

    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void sendText (By locator, String value)
    {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

}
