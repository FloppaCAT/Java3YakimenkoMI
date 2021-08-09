import Pages.*;
import org.junit.Test;

public class Refactor_PZ2 extends BaseTest {

    @Test
    public void testInsurance() {
        MainPage mainPage = new MainPage();
        mainPage.selectMenuItem("Страхование")
                .selectInsuranceItem("Путешествия")
                .checkTitlePage()
                .closeCookieWarning("Закрыть")
                .clickButtonByText("Оформить онлайн")
                .selectMinimalTarif()
                .clickApplyButton()
                .fillField("Фамилия", "Иванов")
                .fillField("Имя", "Иван")
                .fillField("Дата рождения", "03.03.1996")
                .fillField("Фамилия 1", "Колянов")
                .fillField("Имя 1", "Колян")
                .fillField("Отчество 1", "Колянович")
                .fillField("Дата рождения 1", "04.04.1998")
                .fillField("Серия паспорта", "9328")
                .fillField("Номер паспорта", "098765")
                .fillField("Дата выдачи", "04.04.2018")
                .fillField("Кем выдан", "Отделом ФМС КПСС УСБС")
                .clickPushButton()
                .checkErrorMessage("При заполнении данных произошла ошибка");

    }


}

