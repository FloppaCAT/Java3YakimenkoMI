package Steps;

import Pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {

    MainPage mainPage = new MainPage();

    SelectedProgramPage selectedProgramPage = new SelectedProgramPage();

    PreparationPage preparationPage = new PreparationPage();

    DataEntryPage dataEntryPage = new DataEntryPage();

    @When("^выбран пункт меню \"(.+)\"$")
    public void stepSelectMenuItem(String menuItem){
        mainPage.selectMenuItem(menuItem);
    }

    @When("^Выбран подпункт меню \"(.+)\"$")
    public void stepSelectSubMenuItem(String menuItem){
        mainPage.selectInsuranceItem(menuItem);
    }

    @When("^Нажата кнопка закрытия предупреждения \"(.+)\"$")
    public void stepCLickCookieCloseButton(String menuItem){
        selectedProgramPage.closeCookieWarning(menuItem);
    }

    @Then("^Проверено наличие типа страховки Страхование путешественников")
    public void stepCheckInsuranceType(){
        selectedProgramPage.checkTitlePage();
    }

    @When("^Нажата кнопка подтверждения \"(.+)\"$")
    public void stepClickInsuranceTypeButton(String menuItem){
        selectedProgramPage.clickButtonByText(menuItem);
    }

    @When("^Выбран тариф Минимальный")
    public void stepSelectMinimalTarif(){
        preparationPage.selectMinimalTarif();
    }

    @Then("^Нажата кнопка выбора")
    public void stepClickTarifButton(){
        preparationPage.clickApplyButton();
    }

    @When("^Заполняются поля:$")
    public void stepFillForm(DataTable fields){
        fields.<String, String>asMap(String.class, String.class)
                .forEach((field, value) -> dataEntryPage.fillField(field, value));
    }

    @Then("^Нажата кнопка подтверждения ввода")
    public void stepClickDataEntryButton(){
        dataEntryPage.clickPushButton();
    }

    @Then("^Присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String errorMessage){
        dataEntryPage.checkErrorMessage(errorMessage);
    }

}
