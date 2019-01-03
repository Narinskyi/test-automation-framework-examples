package com.example.gui.pages;

import com.example.gui.components.Header;
import com.onarinskyi.annotations.ui.PageComponent;
import com.onarinskyi.annotations.ui.PageObjectClass;
import com.onarinskyi.annotations.ui.Url;
import com.onarinskyi.gui.AbstractPage;
import com.example.gui.components.Button;
import com.example.gui.components.Card;
import com.example.gui.components.Filter;
import com.example.gui.model.Car;
import com.example.gui.model.CarType;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import ru.yandex.qatools.allure.annotations.Step;


@Url("/cars")
@PageObjectClass
public class CarsPage extends AbstractPage {

    @PageComponent
    private Filter.Cars filterSearch;

    @PageComponent
    private Card.Car cardCar;

    @PageComponent
    private Header.Cars header;

    // demonstration of ancestor selectors
    @PageComponent(css = "form[role='search']")
    private Button.Search buttonSearchInHeader;

    @PageComponent(name = "fFilters")
    private Button.Search buttonSearchInFilter;

    @Step
    public void clickSearchInHeader() {
        buttonSearchInHeader.click();
    }

    @Step
    public void clickSearchInFilter() {
        buttonSearchInFilter.click();
    }

    @Step
    public void selectCarRating(int rating) {
        filterSearch.selectRating(rating);
    }

    @Step
    public void selectCarType(CarType type) {
        filterSearch.selectCarType(type);
    }

    @Step
    public void clickSearch() {
        filterSearch.clickSearch();
    }

    @Step
    public void find(Car car) {
        selectCarRating(car.getRaiting());
        selectCarType(car.getType());
        clickSearch();
    }

    @Step
    public void verifySearchResultsContain(Car car) {
        MatcherAssert.assertThat(cardCar.getTitle(), CoreMatchers.containsString(car.getName()));
    }

    @Step
    public void openCarDetails() {
        cardCar.clickOnTitleLink();
    }
}
