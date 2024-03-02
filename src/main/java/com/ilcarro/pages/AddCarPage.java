package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "body")
    WebElement body;
    public AddCarPage scrollUp() {
        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_UP);
        return this;
    }

}

