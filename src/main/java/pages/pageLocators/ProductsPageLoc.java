package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface ProductsPageLoc {
    By lblHeading = By.xpath("//*[@text='PRODUCTS']");
    By btnAddToCart = By.xpath("//*[@content-desc='test-ADD TO CART']");
    By btnCart = AppiumBy.accessibilityId("test-Cart");
}
