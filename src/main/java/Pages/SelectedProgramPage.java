package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedProgramPage extends BasePage{

    @FindBy(xpath = "//div[@class='kitt-grid kitt-grid_fixed']")
    WebElement SecondPageItems;

    public SelectedProgramPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public WebElement secondReturnedItem() {
        return SecondPageItems.findElement(By.xpath("//H1[contains(@class,'kitt-heading')][text()='Страхование путешественников']"));
    }

    public void selectSecondItem(String itemName) {
        driver.findElement(By.xpath("//SPAN[@class='kitt-button__text'][text()='" + itemName + "']")).click();

    }

}
