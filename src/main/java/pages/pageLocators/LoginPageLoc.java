package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface LoginPageLoc {
    By lblHeading = By.xpath("//*[@content-desc='test-Login']/*/*[1]");
    By txtUserName = AppiumBy.accessibilityId("test-Username");
    By txtPass = AppiumBy.accessibilityId("test-Password");
    By btnLogin = By.xpath("//*[@text='LOGIN']");
}
