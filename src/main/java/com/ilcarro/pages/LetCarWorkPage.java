package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyAdapter;
import java.security.Key;
public class LetCarWorkPage extends BasePage {
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[formcontrolname='pickUpPlace']")
    WebElement pickUpPlace;
    public LetCarWorkPage enterLocationAndCarDetails(String location) {
        type(pickUpPlace, location);
        pause(1000);
        pickUpPlace.sendKeys(Keys.DOWN);
        pickUpPlace.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(id = "make")
    WebElement make;
    public LetCarWorkPage car_manufacture(String manufacture) {
        type(make, manufacture);
        return this;
    }
    @FindBy(id = "model")
    WebElement mode_l;
    public LetCarWorkPage carModel(String model) {
        type(mode_l, model);
        return this;
    }
    @FindBy(id = "year")
    WebElement ye_ar;
    public LetCarWorkPage carYear(String year) {
        type(ye_ar, year);
        return this;
    }
    @FindBy(id = "fuel")
    WebElement fu_el;
    public LetCarWorkPage chooseTheFuel(String fuel) {
        click(fu_el);
        fu_el.sendKeys(fuel);
        fu_el.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(id = "seats")
    WebElement se_ats;
    public LetCarWorkPage carSeats(String seats) {
        type(se_ats, seats);
        return this;
    }
    @FindBy(id = "class")
    WebElement cla_ss;
    public LetCarWorkPage Class(String carClass) {
        type(cla_ss, carClass);
        return this;
    }
    @FindBy(id = "serialNumber")
    WebElement serialNumber;
    public LetCarWorkPage carNumber(String regNumber) {
        type(serialNumber, regNumber);
        return this;
    }
    @FindBy(id = "price")
    WebElement pr_ice;
    public LetCarWorkPage carPrice(String price) {
        type(pr_ice, price);
        return this;
    }
    @FindBy(css = "[type='submit']")
    WebElement sub_mit;
    public LetCarWorkPage clickOnSubmitButton() {
        pause(1000);
        click(sub_mit);
        return this;
    }
    @FindBy(xpath = "//h1[.='Car added']")
    WebElement message;
    public LetCarWorkPage isAddedMessageDisplayed(String text) {
        pause(2000);
        assert message.getText().contains(text);
        return this;
    }


 @FindBy(css = "[class='positive-button ng-star-inserted']")
    WebElement showCar;
    public LetCarWorkPage clickOnShowCarButton() {
        pause(1000);
        click(showCar);
        return new LetCarWorkPage(driver);
    }

}
