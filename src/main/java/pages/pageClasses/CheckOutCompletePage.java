package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.CheckOutCompletePageLoc;
import utils.MobileUtils;

public class CheckOutCompletePage extends MobileUtils implements CheckOutCompletePageLoc {
    private AndroidDriver _driver;

    public CheckOutCompletePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyCheckOutCompletePage() {
        verifyElementIsDisplayed(lblHeading, "Checkout Complete Page");
    }

    public void clickOnBackHomeButton() {
        click(btnBackHome);
    }
}
