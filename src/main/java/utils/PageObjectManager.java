package utils;

import io.appium.java_client.android.AndroidDriver;
import pages.pageClasses.*;

public class PageObjectManager {
    public AndroidDriver _driver;
    public LoginPage loginPage;
    public ProductsPage productsPage;
    public YourCartPage yourCartPage;
    public CheckOutInformationPage checkOutInformationPage;
    public CheckOutOverViewPage checkOutOverViewPage;
    public CheckOutCompletePage checkOutCompletePage;
    public PageObjectManager(AndroidDriver driver) {
        this._driver = driver;
    }

    public LoginPage loginPage() {
        if (loginPage == null)
            loginPage = new LoginPage(_driver);
        return loginPage;
    }

    public ProductsPage productsPage() {
        if (productsPage == null)
            productsPage = new ProductsPage(_driver);
        return productsPage;
    }

    public YourCartPage yourCartPage() {
        if (yourCartPage == null)
            yourCartPage = new YourCartPage(_driver);
        return yourCartPage;
    }

    public CheckOutInformationPage checkOutInformationPage() {
        if (checkOutInformationPage == null)
            checkOutInformationPage = new CheckOutInformationPage(_driver);
        return checkOutInformationPage;
    }

    public CheckOutOverViewPage checkOutOverViewPage() {
        if (checkOutOverViewPage == null)
            checkOutOverViewPage = new CheckOutOverViewPage(_driver);
        return checkOutOverViewPage;
    }

    public CheckOutCompletePage checkOutCompletePage() {
        if (checkOutCompletePage == null)
            checkOutCompletePage = new CheckOutCompletePage(_driver);
        return checkOutCompletePage;
    }

}
