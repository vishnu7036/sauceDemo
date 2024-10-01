package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface CheckOutInformationPageLoc {
    By lblHeading = By.xpath("//*[@text='CHECKOUT: INFORMATION']");
    By txtFirstName = AppiumBy.accessibilityId("test-First Name");
    By txtLastName = AppiumBy.accessibilityId("test-Last Name");
    By txtPostalCode = AppiumBy.accessibilityId("test-Zip/Postal Code");
    By btnContinue = By.xpath("//*[@text='CONTINUE']");
}
