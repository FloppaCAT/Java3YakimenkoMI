package Pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class SelectedProgramPage extends BasePage {

    @FindBy(xpath = "//div[@class='kitt-grid kitt-grid_fixed']")
    WebElement SecondPageItems;


    @Step("Проверено наличие типа страховки Страхование путешественников")
    public SelectedProgramPage checkTitlePage() {
        WebElement title = SecondPageItems.findElement(By.xpath("//H1[contains(@class,'kitt-heading')][text()='Страхование путешественников']"));
        Assert.assertEquals("Страхование путешественников", title.getText());
        return this;
    }

    @Step("Нажат кнопка {0}")
    public SelectedProgramPage closeCookieWarning(String itemName){
        driver.findElement(By.xpath("//button[@class='kitt-cookie-warning__close'][text()='" + itemName + "']")).click();
        return this;
    }

    @Step("Нажата кнопка {0}")
    public PreparationPage clickButtonByText(String itemName) {
        driver.findElement(By.xpath("//SPAN[@class='kitt-button__text'][text()='" + itemName + "']")).click();
        return new PreparationPage();
    }

}
