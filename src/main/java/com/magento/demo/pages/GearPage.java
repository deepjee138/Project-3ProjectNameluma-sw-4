package com.magento.demo.pages;

import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By clickOnCookies=By.xpath("//p[text()='Consent']");
    By mouseHoverOnGear=By.xpath("//span[normalize-space()='Gear']");
    By clickOnBages=By.xpath("//span[normalize-space()='Bags']");
    By clickOnProductOvernightDuffle=By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyTextOvernightDuffle=By.xpath("//span[@class='base']");
    By changeTheQty=By.xpath("//input[@id='qty']");
    By clickOnAddToCartButton=By.xpath("//button[@id='product-addtocart-button']");
    By verifyTheTextMessage=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCartLink=By.xpath("//a[normalize-space()='shopping cart']");
    By verifyTheProductName=By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyTheQty4=By.xpath("//input[@title='Qty']");
    By verifyTheProductPrice=By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeTheQty5=By.xpath("(//input[@class='input-text qty'])[1]");
    By clickOnUpdateShoppingCart=By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By verifyTheProductPrices2=By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");
    public void clickOnCookies(){
        clickOnElement(clickOnCookies);
    }
    public void mouseHoverOnGear(){
        mouseHoverToElement(mouseHoverOnGear);
    }
    public void clickOnBages(){
        clickOnElement(clickOnBages);
    }
    public void clickOnProductOvernightDuffle(){
        clickOnElement(clickOnProductOvernightDuffle);
    }
    public String verifyTextOvernightDuffle(){
        return getTextFromElement(verifyTextOvernightDuffle);
    }
    public void changeTheQty1(){
     driver.findElement(changeTheQty).clear();
    }
    public void changeTheQty(){
        sendTextToElement(changeTheQty,"3");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }
    public String verifyTheTextMessage(){
        return getTextFromElement(verifyTheTextMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(clickOnShoppingCartLink);
    }
    public String verifyTheProductName(){
        return getTextFromElement(verifyTheProductName);
    }
    public String verifyTheQty4(){
        return getTextFromElement(verifyTheQty4);
    }
    public String verifyTheProductPrice(){
        return getTextFromElement(verifyTheProductPrice);
    }
    public void changeTheQty5(){
        driver.findElement(changeTheQty5).clear();
    }
    public void changeTheQty6(){
        sendTextToElement(changeTheQty5,"5");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public String verifyTheProductPrices(){
        return getTextFromElement(verifyTheProductPrices2);
    }
}
