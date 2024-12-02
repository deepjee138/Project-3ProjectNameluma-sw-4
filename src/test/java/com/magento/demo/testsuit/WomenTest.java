package com.magento.demo.testsuit;

import com.magento.demo.pages.WomenPage;
import com.magento.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        // click On cookies
        womenPage.clickOnCookies();

        // * Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();


        //   * Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTab();


        //* Click on the ‘Jackets’
        womenPage.clickOnJakets();


        //* Select Sort By filter “Product Name”
        womenPage.selectBySortList();


        //* Verify the product name displayed inalphabetical order
        womenPage.nameDisplayInAlphabeticalOrder();


    }

    @Test
    public void verifyTheSortByPriceFilter() {

        womenPage.clickOnCookies();
        //Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();
        //   * Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTab();

        //* Click on the ‘Jackets’
        womenPage.clickOnJakets();

        //* Select Sort By filter “Price”
        womenPage.selectPrice();

        //* Verify the product price displayed in    Low to High


    }


}


