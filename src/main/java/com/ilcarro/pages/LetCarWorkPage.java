package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyAdapter;
import java.security.Key;

public class LetCarWorkPage extends BasePage{
    public LetCarWorkPage(WebDriver driver) {

        super(driver);
    }



       @FindBy(css = "[formcontrolname='pickUpPlace']")
        WebElement pickUpPlace;
    public LetCarWorkPage enterLocationAndCarDetails(String location) {
        type(pickUpPlace,location);
        pause(1000);
        pickUpPlace.sendKeys(Keys.DOWN);
        pickUpPlace.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id ="make" )
    WebElement make;
    public LetCarWorkPage car_manufacture(String manufacture) {
        type(make, manufacture);
        pause(1000);
        make.sendKeys(Keys.DOWN);
        make.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "model")
    WebElement mode_l;
    public LetCarWorkPage carModel(String model) {
        type(mode_l,model);
        pause(1000);
        mode_l.sendKeys(Keys.DOWN);
        mode_l.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id ="year")
    WebElement ye_ar;
    public LetCarWorkPage carYear(String year) {
        type(ye_ar,year);
        pause(1000);
        ye_ar.sendKeys(Keys.DOWN);
        ye_ar.sendKeys(Keys.ENTER);

        return this;
    }

    @FindBy(id = "fuel")
    WebElement fu_el;
    public LetCarWorkPage chooseTheFuel(String fuel) {
        click(fu_el);
        fu_el.sendKeys(fuel);
        click(sub_mit);
        return this;
    }

    @FindBy(id = "seats")
    WebElement se_ats;
    public LetCarWorkPage carSeats(String seats) {
        type(se_ats,seats);
        pause(1000);
        se_ats.sendKeys(Keys.DOWN);
        se_ats.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "class")
    WebElement cla_ss;
    public LetCarWorkPage Class(String carClass) {
        type(cla_ss,carClass);
        pause(1000);
        cla_ss.sendKeys(Keys.DOWN);
        cla_ss.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id ="serialNumber")
    WebElement serialNumber;
    public LetCarWorkPage carNumber(String regNumber) {
        type(serialNumber,regNumber);
        pause(1000);
        serialNumber.sendKeys(Keys.DOWN);
        serialNumber.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id ="price")
    WebElement pr_ice;
    public LetCarWorkPage carPrice(String price) {
        type(pr_ice,price);
        pause(1000);
        pr_ice.sendKeys(Keys.DOWN);
        pr_ice.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement sub_mit;
    public LetCarWorkPage clickOnSubmitButton() {
        click(sub_mit);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement message;
    public LetCarWorkPage isAddedMessageDisplayed(String error) {
        pause(2000);
        assert message.getText().contains(error);
        return this;
    }













 /* @FindBy(css = "[class='positive-button ng-star-inserted']")
    WebElement showCar;
    public LetCarWorkPage clickOnShowCarButton() {
        click(showCar);
        return this;
    }
*/
}
