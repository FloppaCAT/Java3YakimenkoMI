import Pages.*;
import Steps.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Refactor_PZ2 extends BaseTest {

    @Test
    public void testInsurance() throws Exception {
        //driver.get(baseUrl);
        //2
        MainPage mainPage = new MainPage();
        mainPage.selectMenuItem("Страхование");
        //3
        MainPage mp1 = new MainPage();
        mp1.selectInsuranceItem("Все страховые программы");
        //4
        AllProgramsPage app = new AllProgramsPage(driver);
        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",app.firstReturnedItem("Страхование для путешественников"));
        app.selectFirstItem("Страхование для путешественников");
        //5
        SelectedProgramPage sp = new SelectedProgramPage(driver);

        Assert.assertEquals("Страхование путешественников", sp.secondReturnedItem().getText());
        //6
        sp.selectSecondItem("Оформить онлайн");

        //7 и 8
        PreparationPage pp = new PreparationPage(driver);
        pp.sendAppBtn1.click();
        Thread.sleep(500);
        pp.sendAppBtn2.click();
        //9
        DataEntryPage dep = new DataEntryPage(driver);

        dep.fillField("Фамилия", "Иванов");
        dep.fillField("Имя", "Иван");
        dep.fillField("Дата рождения", "03.03.1996");
        dep.target1.click();
        Thread.sleep(500);
        dep.fillField("Фамилия 1", "Колянов");
        dep.fillField("Имя 1", "Колян");
        dep.fillField("Отчество 1", "Колянович");
        dep.fillField("Дата рождения 1", "04.04.1998");
        dep.target2.click();
        Thread.sleep(500);
        dep.fillField("Серия паспорта", "9328");
        dep.fillField("Номер паспорта", "098765");
        dep.fillField("Дата выдачи", "04.04.2018");
        dep.target3.click();
        Thread.sleep(500);
        dep.fillField("Кем выдан", "Отделом ФМС КПСС УСБС");
        dep.chooseGender.click();
        //10
        Assert.assertEquals("Иванов", dep.getFillField("Фамилия"));
        Assert.assertEquals("Иван", dep.getFillField("Имя"));
        Assert.assertEquals("03.03.1996", dep.getFillField("Дата рождения"));
        Assert.assertEquals("Колянов", dep.getFillField("Фамилия 1"));
        Assert.assertEquals("Колян", dep.getFillField("Имя 1"));
        Assert.assertEquals("Колянович", dep.getFillField("Отчество 1"));
        Assert.assertEquals("04.04.1998", dep.getFillField("Дата рождения 1"));
        Assert.assertEquals("9328", dep.getFillField("Серия паспорта"));
        Assert.assertEquals("098765", dep.getFillField("Номер паспорта"));
        Assert.assertEquals("04.04.2018", dep.getFillField("Дата выдачи"));
        Assert.assertEquals("Отделом ФМС КПСС УСБС", dep.getFillField("Кем выдан"));
        //11
        Thread.sleep(1000);
        dep.pushButton.click();
        //12
        Thread.sleep(1000);
        dep.errorMessage("При заполнении данных произошла ошибка");

    }
}

