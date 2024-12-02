package com.magento.demo.testsuit;

import com.magento.demo.pages.GearPage;
import com.magento.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {


    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {

        gearPage.clickOnCookies();
        // Mouse Hover on the ‘Gear’ Menu
        gearPage.mouseHoverOnGear();


        //  * Click on the ‘Bags’
        gearPage.clickOnBages();


        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProductOvernightDuffle();


        // * Verify the text ‘Overnight Duffle’
        gearPage.verifyTextOvernightDuffle();


        //      Change the Qty 3
        gearPage.changeTheQty1();
        gearPage.changeTheQty();


        // * Click on the ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();


        // * Verify the text ‘You added Overnight Duffle to your shopping cart.’
        gearPage.verifyTheTextMessage();
        String expectedText="You added Overnight Duffle to your shopping cart.";
        String actualText=gearPage.verifyTheTextMessage();
        Assert.assertEquals(actualText,expectedText,"invalid message");


        //   * Click on the ‘shopping cart’ Link into    message
        gearPage.clickOnShoppingCartLink();


        //  * Verify the product name ‘Overnight Duffle’
        gearPage.verifyTheProductName();
        String expectedProductName="Overnight Duffle";
        String actualProductName=gearPage.verifyTheProductName();
        Assert.assertEquals(actualProductName,expectedProductName,"invalid Proct Name");

        //* Verify the Qty is ‘3’
//        gearPage.verifyTheQty4();
//        String expectedQty="3";
//        String actualQty=gearPage.verifyTheQty4();
//        Assert.assertEquals(actualQty,expectedQty,"inavalid text");


        // * Verify the product price ‘$135.00’
        String exceptedPriceOfProduct="$135.00";
        String actualPriceOfProduct=gearPage.verifyTheProductPrice();
        Assert.assertEquals(actualPriceOfProduct,exceptedPriceOfProduct,"invalid price");

        //* Change the Qty to ‘5’
        gearPage.changeTheQty5();
        gearPage.changeTheQty6();

        // Click on the ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCart();


        // * Verify the product price ‘$225.00’
        String expectedPrice="$225.00";
       String actualPrice=gearPage.verifyTheProductPrices();
       Assert.assertEquals(actualPrice,expectedPrice,"invalid Price");
    }
}
