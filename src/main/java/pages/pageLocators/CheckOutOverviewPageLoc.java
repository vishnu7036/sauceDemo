package pages.pageLocators;

import org.openqa.selenium.By;

public interface CheckOutOverviewPageLoc {
    By lblHeading = By.xpath("//*[@text='CHECKOUT: OVERVIEW']");
    By btnFinish = By.xpath("//*[@text='FINISH']");
}
