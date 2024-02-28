package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.LetCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class CarWorkSteps {

    @And("User clicks on Logged in button")
    public void click_on_ok(){
        new LoginPage(driver).clickOnOkButton();
    }

    @And("User clicks on Let the car work button")
     public void click_on_let_the_car(){
      new LoginPage(driver).clickOnTheLetTheCarButton();
     }
  @And("User enters location")
   public void  enter_location_and_carDetails(){
      new LetCarWorkPage(driver).enterLocationAndCarDetails("Jerusalem");
   }

    @And("User enters car manufacture")
    public void carManufacture(){
        new LetCarWorkPage(driver).car_manufacture("opel");
    }
    @And("User enters car model")
    public void car_model(){
        new LetCarWorkPage(driver).carModel("corsa");
    }

    @And("User enters car year")
    public void car_year(){
        new LetCarWorkPage(driver).carYear("1987");
    }

    @And("User enters car fuel")
    public void car_fuel(){
        new LetCarWorkPage(driver).chooseTheFuel("Petrol");
    }

    @And("User enters car seats")
    public void car_seats(){
        new LetCarWorkPage(driver).carSeats("5");
    }

    @And("User enters car class")
    public void car_class(){
        new LetCarWorkPage(driver).Class("sedan");
    }
    @And("User enters car registration number")
    public void car_number(){
        new LetCarWorkPage(driver).carNumber("tö-16");
    }

    @And("User enters car price")
    public void car_price(){
        new LetCarWorkPage(driver).carPrice("115");
    }
    @And("User clicks on Submit button")
    public void click_on_submit_button(){
        new LetCarWorkPage(driver).clickOnSubmitButton();
    }
  @Then("User verifies Message Car wars added")
    public void get_message(){
        new LetCarWorkPage(driver).isAddedMessageDisplayed("Car added");
    }

  /* @And("User clicks on Show car")
    public void click_on_show_car(){
        new LetCarWorkPage(driver).clickOnShowCarButton();
    }

*/

}
