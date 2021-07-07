package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProgramsPage extends BasePage{

    @FindBy(xpath = "//div[@class='uc-form__wrapper-full uc-form__wrapper-full_no-grouping']")
    WebElement FirstPageItems;

    public AllProgramsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement firstReturnedItem(String itemName){
        return FirstPageItems.findElement(By.xpath("//H3[@class='uc-full__header'][text()='"+itemName+"']"));
    }

    public void selectFirstItem(String itemName){
        FirstPageItems.findElement(By.xpath("//H3[@class='uc-full__header'][text()='"+itemName+"']")).click();
    }

}
