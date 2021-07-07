package Pages;

import Steps.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//div[contains(@class,'kitt-content')]")
    WebElement menuItems;

    @FindBy(xpath = "//div[@class='kitt-content']")
    WebElement allInsurance;

    public MainPage() {
PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath("//a[contains(@onclick,'kitt-top-menu-8')][contains(text(),'"+itemName+"')]")).click();
    }

    public void selectInsuranceItem(String itemName){
        allInsurance.findElement(By.xpath("//a[contains(@class,'kitt-top-menu__link')][text()='"+itemName+"']")).click();
    }

}
