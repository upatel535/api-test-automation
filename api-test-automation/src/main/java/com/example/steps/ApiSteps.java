package com.example.steps;

import com.example.page.ApiPage;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.cucumber.Then;
import io.cucumber.When;
//import org.junit.Assert;

public class ApiSteps {
    private ApiPage apiPage = new ApiPage();
    private String response;

    @When("I fetch all phone names")
    public void iFetchAllPhoneNames() throws Exception {
        response = apiPage.getAllPhones();
    }

    @Then("I should see phones starting with work apple")
    public void iShouldSeePhonesStartingWithWorkApple() {
        // Parse the response and validate
    }

    @Then("I should get the phone with lowest cost")
    public void iShouldGetThePhoneWithLowestCost() {
        // Parse the response and validate
    }

    @Then("I should validate that ID is not null")
    public void iShouldValidateThatIDIsNotNull() {
        // Parse the response and validate
    }
}
