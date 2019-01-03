package base;

import com.example.config.TestConfig;
import com.example.gui.pages.CarDetailsPage;
import com.example.gui.pages.CarsPage;
import com.onarinskyi.annotations.ui.PageObject;
import com.onarinskyi.context.AbstractUITest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public abstract class BaseUiTest extends AbstractUITest {
    @PageObject
    protected CarsPage onCarsPage;

    @PageObject
    protected CarDetailsPage onCarDetailsPage;
}
