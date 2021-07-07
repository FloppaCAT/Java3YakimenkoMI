package Steps;

import Pages.DataEntryPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class DataEntryPageSteps extends BaseTest{

    @Step("Поле {0} заполнено значением {1}")
    public void fillField(String field, String value){
        new DataEntryPage(driver).fillField(field, value);
    }

    @Step("Заполняются поля")
    public void fillField(HashMap<String,String> fields){
        fields.forEach(this::fillField);
    }

    @Step("Нажимается кнопка - Продолжить")
    public void pushButton(){
        new DataEntryPage(driver).pushButton.click();
    }

    @Step("Проверить наличие ошибки")
    public void errorMessage (String field){
    new DataEntryPage(driver).errorMessage(field);

    }
}

