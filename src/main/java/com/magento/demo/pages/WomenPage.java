package com.magento.demo.pages;

import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    By clickOnCookies = By.xpath("//p[text()='Consent']");
    By mouseHoverOnWomen = By.xpath("//span[normalize-space()='Women']");
    By mouseHoverOnTab = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJakets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By selectBySortList = By.id("sorter");
    By verifyProductNameAlphaOrder = By.xpath("//li//div[1]//div[1]//strong[1]/a");
    By selectPrice = By.id("sorter");
    By productNameText = By.xpath("//strong[@class='product name product-item-name']//a");

    public void clickOnCookies() {
        clickOnElement(clickOnCookies);
    }

    public void mouseHoverOnWomen() {
        mouseHoverToElement(mouseHoverOnWomen);

    }

    public void mouseHoverOnTab() {
        mouseHoverToElement(mouseHoverOnTab);
    }

    public void clickOnJakets() {
        clickOnElement(clickOnJakets);
    }

    public void selectBySortList() {
        selectByVisibleTextFromDropDown(selectBySortList, "Product Name");
    }

    public void selectPrice() {
        selectByVisibleTextFromDropDown(selectPrice, "Price");
    }

    public void nameDisplayInAlphabeticalOrder() {
        List<WebElement> productNames = driver.findElements(productNameText);

        //store product name in the actualProductName List.
        List<String> actualProductsName = new ArrayList<>();
        for (WebElement product : productNames) {
//            System.out.println(product.getText());
            actualProductsName.add(product.getText());

        }

    }


}

