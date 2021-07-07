package Steps;

import Pages.PreparationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class PreparationPageSteps extends BaseTest {

    @Step("Выполнено нажатие на карточку - Минимальная")
    public void sendAppBtn1() {
        new PreparationPage(driver).sendAppBtn1.click();
    }

    @Step("Выполнено нажатие на карточку - Минимальная")
    public void sendAppBtn2() {
        new PreparationPage(driver).sendAppBtn2.click();

    }
}
