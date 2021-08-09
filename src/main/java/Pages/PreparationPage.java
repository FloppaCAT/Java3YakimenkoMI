package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreparationPage extends BasePage{

    @FindBy(xpath = "(//DIV[@_ngcontent-c11=''])[1]")
    public WebElement selectInsuranceTarifMin;

    @FindBy(xpath = "//BUTTON[@class='btn large'][text()='Оформить']")
    public WebElement applyButton;

    @Step("Выполнено нажатие на карточку - Минимальная")
    public PreparationPage selectMinimalTarif() {
         selectInsuranceTarifMin.click();
         return this;
    }

    @Step("Выполнено нажатие на кнопку")
    public DataEntryPage clickApplyButton() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignore) {
        }
        applyButton.click();
        return new DataEntryPage();
    }

}
