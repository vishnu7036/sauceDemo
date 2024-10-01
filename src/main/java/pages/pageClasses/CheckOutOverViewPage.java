package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.CheckOutOverviewPageLoc;
import utils.MobileUtils;

public class CheckOutOverViewPage extends MobileUtils implements CheckOutOverviewPageLoc {
    private AndroidDriver _driver;
    public CheckOutOverViewPage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyCheckoutOverViewPage(){
        verifyElementIsDisplayed(lblHeading,"Checkout Overview Page");
    }
    public void clickOnFinishButton(){
        scrollToElement("FINISH");
        click(btnFinish);
    }
}
