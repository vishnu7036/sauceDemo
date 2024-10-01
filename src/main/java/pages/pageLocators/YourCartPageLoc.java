package pages.pageLocators;

import org.openqa.selenium.By;

public interface YourCartPageLoc {
    By lblHeading = By.xpath("//*[@text='YOUR CART']");
    By btnCheckout = By.xpath("//*[@text='CHECKOUT']");
}
