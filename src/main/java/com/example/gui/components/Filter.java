package com.example.gui.components;

import com.example.gui.model.CarType;
import com.onarinskyi.annotations.ui.PageComponent;
import com.onarinskyi.annotations.ui.PageComponentClass;
import com.onarinskyi.gui.AbstractPageComponent;
import ru.yandex.qatools.allure.annotations.Step;

@PageComponentClass
public abstract class Filter extends AbstractPageComponent {

    @PageComponent
    private RadioGroup.Stars radioStars;

    @PageComponent
    private Slider.Price sliderPrice;

    @PageComponent
    private Button.Search buttonSearch;

    @Step
    public void selectRating(int rating) {
        radioStars.select(rating);
    }

    @Step
    public void clickSearch() {
        buttonSearch.click();
    }

    @PageComponentClass
    public static class Cars extends Filter {
        @PageComponent
        private RadioGroup.CarType radioCarType;

        @Step
        public void selectCarType(CarType type) {
            radioCarType.select(type);
        }
    }
}
