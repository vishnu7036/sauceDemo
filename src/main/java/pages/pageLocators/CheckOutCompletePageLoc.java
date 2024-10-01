package pages.pageLocators;

import org.openqa.selenium.By;

public interface CheckOutCompletePageLoc {
    By lblHeading = By.xpath("//*[@text='CHECKOUT: COMPLETE!']");
    By btnBackHome = By.xpath("//*[@text='BACK HOME']");
}
