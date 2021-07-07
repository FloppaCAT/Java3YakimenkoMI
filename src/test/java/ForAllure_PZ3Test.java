import Steps.*;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import Steps.MainPageSteps;
import Steps.AllProgramsPageSteps;
import Steps.SelectedProgramPageSteps;
import Steps.PreparationPageSteps;
import Steps.DataEntryPageSteps;

import java.util.HashMap;

public class ForAllure_PZ3Test extends BaseTest {

    MainPageSteps mps = new MainPageSteps();
    AllProgramsPageSteps apps = new AllProgramsPageSteps();
    SelectedProgramPageSteps spps = new SelectedProgramPageSteps();
    PreparationPageSteps pps = new PreparationPageSteps();
    DataEntryPageSteps deps = new DataEntryPageSteps();
    HashMap<String,String> testData = new HashMap<>();

    @Title("Страхование Сбер")
    @Test
    public void forAllure_PZ3(){

        testData.put("Иванов","Фамилия");
        testData.put("Иван","Имя");
        testData.put("03.03.1996","Дата рождения");
        testData.put("Колянов","Фамилия 1");
        testData.put("Колян","Имя 1");
        testData.put("Колянович","Отчество 1");
        testData.put("04.04.1998","Дата рождения 1");
        testData.put("9328","Серия паспорта");
        testData.put("098765","Серия паспорта");
        testData.put("04.04.2018","Дата выдачи");
        testData.put("Отделом ФМС КПСС УСБС","Кем выдан");

        mps.selectMenuItem("Страхование");
        mps.selectInsuranceItem("Все страховые программы");

        apps.firstReturnedItem("Страхование для путешественников");
        apps.selectFirstItem("Страхование для путешественников");

        spps.secondReturnedItem("Страхование путешественников");
        spps.selectSecondItem("Страхование путешественников");

        pps.sendAppBtn1();
        pps.sendAppBtn2();

        deps.fillField(testData);
        deps.pushButton();
        deps.errorMessage("При заполнении данных произошла ошибка");
    }

}
