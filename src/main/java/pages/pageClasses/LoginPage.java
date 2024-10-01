package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.LoginPageLoc;
import utils.MobileUtils;

public class LoginPage extends MobileUtils implements LoginPageLoc {
    private AndroidDriver _driver;

    public LoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyLoginPage() {
        verifyElementIsDisplayed(lblHeading, "Login Page");
    }

    public void enterEmail(String email) {
        enterText(txtUserName, email);
    }

    public void enterPassword(String password) {
        enterText(txtPass, password);
    }

    public void clickOnLoginButton() {
        click(btnLogin);
        _driver.findElement(btnLogin).click();
    }
}
