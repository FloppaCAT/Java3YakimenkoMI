package Steps;

import Pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps extends BaseTest {

    @Step("Выбран пункт меню {0}")
    public void selectMenuItem(String itemName) {
        new MainPage().selectMenuItem(itemName);
    }

    @Step("Выбран пункт подменю {0}")
    public void selectInsuranceItem(String menuItem) {
        new MainPage().selectInsuranceItem(menuItem);
    }
}
