package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.LoginPageLoc;

public class LoginPage implements LoginPageLoc {
    private AndroidDriver _driver;
    public LoginPage(AndroidDriver driver){
        this._driver = driver;
    }

    public void verifyLoginPage(){
        _driver.findElement(lblHeading).isDisplayed();
    }
    public void enterEmail(String email) {
        _driver.findElement(txtUserName).sendKeys(email);
    }
    public void enterPassword(String password){
        _driver.findElement(txtPass).sendKeys(password);
    }
    public void clickOnLoginButton(){
        _driver.findElement(btnLogin).click();
    }
}
