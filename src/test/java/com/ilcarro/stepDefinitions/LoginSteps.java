package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User click on the login link")
    public void click_On_Login_Link(){

        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void validData(){

        new LoginPage(driver).enterData("j.d@com.de","Antpavl1234!!!");
    }
    @And("User clicks on Yalla button")
    public void click_On_Yalla_Button(){

        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies Success  message is displayed")
    public void verifySuccessMessage(){

        new LoginPage(driver).isSuccessMessageDisplayed();
    }
    @And("User enters valid email and wrong password")
    public void enters_valid_email_wrong_password(DataTable table){
        new LoginPage(driver).enterWrondData(table);
    }
    @Then("User verifies error  message is displayed")
    public void verify_Error_message(){
        new LoginPage(driver).isErrorDisplayed();
    }
}
