package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MobileUtils {

    private AndroidDriver _driver;

    public MobileUtils(AndroidDriver driver) {
        this._driver = driver;
    }

    public void verifyElementIsDisplayed(By loc, String eleName){
        Assert.assertTrue(_driver.findElement(loc).isDisplayed(),eleName+" is Displayed");
    }

    public void scrollToElement(String text){
        _driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\"))"));
    }

    public void enterText(By loc, String text){
        _driver.findElement(loc).sendKeys(text);
    }

    public void hideKeyboard(){
        if(_driver.isKeyboardShown())
            _driver.hideKeyboard();
    }

    public void click(By loc){
        _driver.findElement(loc).click();
    }

}
