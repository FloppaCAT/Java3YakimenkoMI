package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.Step;

public class MainPage extends BasePage{


    WebElement menuItems;

    @FindBy(xpath = "//div[@class='kitt-content']")
    WebElement allInsurance;

    @Step("Выбран пункт меню {0}")
    public MainPage selectMenuItem(String itemName){
        menuItems.findElement(By.xpath("//a[contains(@onclick,'kitt-top-menu-8')][contains(text(),'"+itemName+"')]")).click();
        return this;
    }
    @Step("Выбран пункт подменю {0}")
    public SelectedProgramPage selectInsuranceItem(String itemName){
        allInsurance.findElement(By.xpath("//a[contains(@class,'kitt-t')][text()='"+itemName+"']")).click();
        return new SelectedProgramPage();
    }

}
