package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreparationPage extends BasePage{

    @FindBy(xpath = "(//DIV[@_ngcontent-c11=''])[1]")
    public WebElement sendAppBtn1;

    @FindBy(xpath = "//BUTTON[@class='btn btn-primary btn-large'][text()='Оформить']")
    public WebElement sendAppBtn2;

    public PreparationPage(WebDriver driver){
    PageFactory.initElements(driver, this);
    }
}
