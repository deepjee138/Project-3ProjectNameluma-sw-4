package com.magento.demo.pages;

import com.magento.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By clickOnCookies=By.xpath("//p[text()='Consent']");
    By mouseHoverOnMen=By.xpath("//span[normalize-space()='Men']");
    By mouseHoverOnBottom=By.xpath("//a[@id='ui-id-18']");
    By clickOnPant=By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By mouseHoverOnProductName=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By ClickOnSize=By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By clickOnBlackColour=By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By clickOnAddToCartButton=By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By verifyTheTextMes=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCardLinkOnMess=By.xpath("//a[normalize-space()='shopping cart']");
    By verifyTheTextShoppingCart=By.xpath("//span[@class='base']");
    By verifyTheProductName=By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifyTheProductSize=By.xpath("//dd[contains(text(),'32')]");
    By verifyTheProductIsBlack=By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnMen(){
        mouseHoverToElement(mouseHoverOnMen);
    }
    public void setClickOnCookies(){
        clickOnElement(clickOnCookies);
    }
    public void mouseHoverOnBottom(){
        mouseHoverToElement(mouseHoverOnBottom);
    }
    public void clickOnPant(){
        clickOnElement(clickOnPant);
    }
    public void mouseHoverOnProductName(){
        mouseHoverToElement(mouseHoverOnProductName);

    }
    public void clickOnSize1(){
        mouseHoverToElementAndClick(ClickOnSize);
    }
    public void clickOnBlackColour(){
        clickOnElement(clickOnBlackColour);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }
    public String verifyTheTextMessage(){
        return getTextFromElement(verifyTheTextMes);
    }
    public void clickOnShoppingCardLinkOnMess(){
        clickOnElement(clickOnShoppingCardLinkOnMess);
    }
    public String  verifyTheTextShoppingCart(){
        return getTextFromElement(verifyTheTextShoppingCart);

    }
    public String verifyTheProductName(){
        return getTextFromElement(verifyTheProductName);
    }
    public String verifyTheProductSize(){
        return getTextFromElement(verifyTheProductSize);
    }
    public String verifyTheProductIsBlack(){
        return getTextFromElement(verifyTheProductIsBlack);
    }
}
