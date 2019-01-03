package ui;

import com.example.gui.model.Car;
import com.example.gui.pages.CarDetailsPage;
import com.example.gui.pages.CarsPage;
import com.example.reporting.Feature;
import com.onarinskyi.annotations.ui.PageObject;
import com.onarinskyi.context.AbstractUITest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

@Features(Feature.GUI)
@Stories("Car rent")
public class UiTest extends AbstractUITest {

    @PageObject
    private CarsPage onCarsPage;

    @PageObject
    private CarDetailsPage onCarDetailsPage;

    @Test
    @TestCaseId("1")
    public void verifySearchByType() {
        Car camry = Car.CAMRY;

        onCarsPage.open();

        onCarsPage.selectCarType(camry.getType());

        onCarsPage.clickSearch();

        onCarsPage.verifySearchResultsContain(camry);
    }

    @Test
    @TestCaseId("2")
    public void verifyNavigatingToCarDetailsPage() {
        Car astra = Car.ASTRA;

        onCarsPage.open();

        onCarsPage.find(astra);

        onCarsPage.openCarDetails();

        onCarDetailsPage.verifyCarPhotoIsDisplayed();
    }

    @Test
    @TestCaseId("3")
    public void test() {
        onCarsPage.open();

        onCarsPage.clickSearchInHeader();

        onCarsPage.clickSearchInFilter();
    }
}
