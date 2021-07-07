package Steps;

import Pages.AllProgramsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class AllProgramsPageSteps extends BaseTest{

    @Step("Найден в списке тип страхования {0}")
    public void firstReturnedItem(String menuItem) {
        new AllProgramsPage(driver).firstReturnedItem(menuItem);
    }

    @Step("Выбран тип страхования {0}")
    public void selectFirstItem(String menuItem){
        new AllProgramsPage(driver).selectFirstItem(menuItem);
    }

}
