package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.CheckOutInformationPageLoc;
import utils.MobileUtils;

public class CheckOutInformationPage extends MobileUtils implements CheckOutInformationPageLoc {
    private AndroidDriver _driver;

    public CheckOutInformationPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyCheckoutInformationPage() {
        verifyElementIsDisplayed(lblHeading, "Check out page");
    }

    public void enterFirstName() {
        enterText(txtFirstName, "vishnu");
    }

    public void enterLastName() {
//        hideKeyboard();
        enterText(txtLastName, "pavan");
    }

    public void enterPostalCode() {
//        hideKeyboard();
        enterText(txtPostalCode, "500084");
    }

    public void clickOnContinueButton() {
        hideKeyboard();
        click(btnContinue);
    }
}
