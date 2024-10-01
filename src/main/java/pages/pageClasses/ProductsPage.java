package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pages.pageLocators.ProductsPageLoc;
import utils.MobileUtils;

public class ProductsPage extends MobileUtils implements ProductsPageLoc {
    private AndroidDriver _driver;

    public ProductsPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyProductsPage() {
        verifyElementIsDisplayed(lblHeading, "Products page");
    }

    public void clickOnAddToCartButtonForFirstTwoProducts() {
        _driver.findElements(btnAddToCart).forEach(WebElement::click);
    }

    public void clickOnCartButton() {
        _driver.findElement(btnCart).click();
    }
}
