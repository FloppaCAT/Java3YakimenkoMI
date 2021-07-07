package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataEntryPage extends BasePage {

    @FindBy(xpath = "//form[@class='needs-validation page-form forming-product-form ng-untouched ng-dirty ng-invalid']")
    public WebElement formPage;

    @FindBy(id = "surname_vzr_ins_0")
    public WebElement lastName;

    @FindBy(id = "name_vzr_ins_0")
    public WebElement firstName;

    @FindBy(id = "birthDate_vzr_ins_0")
    public WebElement birthdate;

    @FindBy(xpath = "//INPUT[@id='person_lastName']")
    public WebElement target1;

    @FindBy(id = "person_lastName")
    public WebElement lastName1;

    @FindBy(id = "person_firstName")
    public WebElement firstName1;

    @FindBy(id = "person_middleName")
    public WebElement middleName1;

    @FindBy(id = "person_birthDate")
    public WebElement birthdate1;

    @FindBy(xpath = "//INPUT[@id='passportSeries']")
    public WebElement target2;

    @FindBy(id = "passportSeries")
    public WebElement passportSeries;

    @FindBy(id = "passportNumber")
    public WebElement passportNumber;

    @FindBy(id = "documentDate")
    public WebElement documentDate;

    @FindBy(xpath = "//INPUT[@id='documentIssue']")
    public WebElement target3;

    @FindBy(id = "documentIssue")
    public WebElement documentIssue;

    @FindBy(xpath = "//label[@class='btn ng-untouched ng-pristine ng-valid active'][text()='Мужской']")
    public WebElement chooseGender;

    @FindBy(xpath = "//BUTTON[@class='btn btn-primary page__btn']")
    public WebElement pushButton;


    public DataEntryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия":
                fillField(lastName, value);
                break;
            case "Имя":
                fillField(firstName, value);
                break;
            case "Дата рождения":
                fillField(birthdate, value);
                break;
            case "Фамилия 1":
                fillField(lastName1, value);
                break;
            case "Имя 1":
                fillField(firstName1, value);
                break;
            case "Отчество 1":
                fillField(middleName1, value);
                break;
            case "Дата рождения 1":
                fillField(birthdate1, value);
                break;
            case "Серия паспорта":
                fillField(passportSeries, value);
                break;
            case "Номер паспорта":
                fillField(passportNumber, value);
                break;
            case "Дата выдачи":
                fillField(documentDate, value);
                break;
            case "Кем выдан":
                fillField(documentIssue, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия":
                return lastName.getAttribute("value");
            case "Имя":
                return firstName.getAttribute("value");
            case "Дата рождения":
                return birthdate.getAttribute("value");
            case "Фамилия 1":
                return lastName1.getAttribute("value");
            case "Имя 1":
                return firstName1.getAttribute("value");
            case "Отчество 1":
                return middleName1.getAttribute("value");
            case "Дата рождения 1":
                return birthdate1.getAttribute("value");
            case "Серия паспорта":
                return passportSeries.getAttribute("value");
            case "Номер паспорта":
                return passportNumber.getAttribute("value");
            case "Дата выдачи":
                return documentDate.getAttribute("value");
            case "Кем выдан":
                return documentIssue.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public void errorMessage(String errorMessage) {
        String xpath = "//div[@class='alert-form alert-form-error']";
        String actualValue = driver.findElement(By.xpath(xpath)).getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, errorMessage),
                actualValue.contains(errorMessage));



    }
}






