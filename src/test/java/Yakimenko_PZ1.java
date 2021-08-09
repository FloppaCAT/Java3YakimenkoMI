
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;


public class Yakimenko_PZ1 extends BaseTest {


    @Test
    @Ignore
    public void Sber1() throws InterruptedException {
        driver.get(baseUrl);
        //2
        driver.findElement(By.xpath("//div[@class='kitt-content']//a[contains(@onclick,'kitt-top-menu-8')][contains(text(),'Страхование')]")).click();
        //3
        driver.findElement(By.xpath("//div[@class='kitt-content']//a[contains(@class,'kitt-t')][text()='Путешествия']")).click();
        //4
        driver.findElement(By.xpath("//button[@class='kitt-cookie-warning__close'][text()='Закрыть']")).click();
        //проверка совпадения названия
        WebElement title = driver.findElement(By.xpath("//H1[contains(@class,'kitt-heading')][text()='Страхование путешественников']"));
        Assert.assertEquals("Страхование путешественников", title.getText());
        //нажата кнопка Оформить онлайн
        driver.findElement(By.xpath("//SPAN[@class='kitt-button__text'][text()='Оформить онлайн']")).click();
        //выбран тариф - минимальный
        driver.findElement(By.xpath("(//DIV[@_ngcontent-c11=''])[1]")).click();
        //Нажата кнопка - оформить
        Thread.sleep(1000);
        driver.findElement(By.xpath("//BUTTON[@class='btn large'][text()='Оформить']")).click();

        sendText(By.id("surname_vzr_ins_0"), "Иванов");
        sendText(By.id("name_vzr_ins_0"), "Иван");
        sendText(By.id("birthDate_vzr_ins_0"), "03031996");
        driver.findElement(By.xpath("//INPUT[@id='person_lastName']")).click();
        Thread.sleep(500);
        sendText(By.id("person_lastName"), "Колянов");
        sendText(By.id("person_firstName"), "Колян");
        sendText(By.id("person_middleName"), "Колянович");
        sendText(By.id("person_birthDate"), "04041998");

        driver.findElement(By.xpath("//INPUT[@id='passportSeries']")).click();
        Thread.sleep(500);
        sendText(By.id("passportSeries"), "9328");
        sendText(By.id("passportNumber"), "098765");
        sendText(By.id("documentDate"), "04042018");
        Thread.sleep(500);
        driver.findElement(By.xpath("//INPUT[@id='documentIssue']")).click();
        sendText(By.id("documentIssue"), "Отделом ФМС КПСС УСБС");

        driver.findElement(By.xpath("//label[@class='btn ng-untouched ng-pristine ng-valid active'][text()='Мужской']")).click();

        //10
        Assert.assertEquals("Иванов", driver.findElement(By.id("surname_vzr_ins_0")).getAttribute("value"));
        Assert.assertEquals("Иван", driver.findElement(By.id("name_vzr_ins_0")).getAttribute("value"));
        Assert.assertEquals("03.03.1996", driver.findElement(By.id("birthDate_vzr_ins_0")).getAttribute("value"));
        Assert.assertEquals("Колянов", driver.findElement(By.id("person_lastName")).getAttribute("value"));
        Assert.assertEquals("Колян", driver.findElement(By.id("person_firstName")).getAttribute("value"));
        Assert.assertEquals("Колянович", driver.findElement(By.id("person_middleName")).getAttribute("value"));
        Assert.assertEquals("04.04.1998", driver.findElement(By.id("person_birthDate")).getAttribute("value"));
        Assert.assertEquals("9328", driver.findElement(By.id("passportSeries")).getAttribute("value"));
        Assert.assertEquals("098765", driver.findElement(By.id("passportNumber")).getAttribute("value"));
        Assert.assertEquals("04.04.2018", driver.findElement(By.id("documentDate")).getAttribute("value"));
        Assert.assertEquals("Отделом ФМС КПСС УСБС", driver.findElement(By.id("documentIssue")).getAttribute("value"));

        //11
        Thread.sleep(1000);
        driver.findElement(By.xpath("//BUTTON[@class='btn btn-primary page__btn']")).click();

        //12
        Thread.sleep(1000);
        WebElement errMsg = driver.findElement(By.xpath("//div[@class='alert-form alert-form-error']"));
        Assert.assertEquals("При заполнении данных произошла ошибка", errMsg.getText());

    }

}
