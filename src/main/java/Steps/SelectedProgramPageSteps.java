package Steps;


import Pages.SelectedProgramPage;
import ru.yandex.qatools.allure.annotations.Step;


import static org.junit.Assert.assertEquals;


public class SelectedProgramPageSteps extends BaseTest{

    @Step("Проверено наличие типа страховки \"Страхование путешественников\"")
    public void secondReturnedItem(String field){
        SelectedProgramPage actual = new SelectedProgramPage(driver);
        String value = actual.secondReturnedItem().getText();
        assertEquals(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", actual, value, field), field, value);
    }


    @Step("Нажата кнопка {0}")
    public void selectSecondItem(String menuItem){
        new SelectedProgramPage(driver).selectSecondItem(menuItem);
    }

}
