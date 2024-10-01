package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;

public class TestProductsAddToCart extends BaseClass {
    @Test
    public void VerifyProductsAddToCart(){
        pm.loginPage().verifyLoginPage();
        pm.loginPage().enterEmail(email);
        pm.loginPage().enterPassword(pass);
        pm.loginPage().clickOnLoginButton();
        pm.productsPage().verifyProductsPage();
        pm.productsPage().clickOnAddToCartButtonForFirstTwoProducts();
        pm.productsPage().clickOnCartButton();
        pm.yourCartPage().verifyYourCartPage();
        pm.yourCartPage().clickOnCheckOutButton();
        pm.checkOutInformationPage().verifyCheckoutInformationPage();
        pm.checkOutInformationPage().enterFirstName();
        pm.checkOutInformationPage().enterLastName();
        pm.checkOutInformationPage().enterPostalCode();
        pm.checkOutInformationPage().clickOnContinueButton();
        pm.checkOutOverViewPage().verifyCheckoutOverViewPage();
        pm.checkOutOverViewPage().clickOnFinishButton();
        pm.checkOutCompletePage().verifyCheckOutCompletePage();
        pm.checkOutCompletePage().clickOnBackHomeButton();
        pm.productsPage().verifyProductsPage();
    }
}
