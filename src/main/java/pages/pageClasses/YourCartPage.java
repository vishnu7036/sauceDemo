package pages.pageClasses;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.YourCartPageLoc;
import utils.MobileUtils;

public class YourCartPage extends MobileUtils implements YourCartPageLoc {
    private AppiumDriver _driver;

    public YourCartPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyYourCartPage() {
        verifyElementIsDisplayed(lblHeading,"You Cart Page");
    }

    public void clickOnCheckOutButton() {
        scrollToElement("CHECKOUT");
        click(btnCheckout);
    }

}
