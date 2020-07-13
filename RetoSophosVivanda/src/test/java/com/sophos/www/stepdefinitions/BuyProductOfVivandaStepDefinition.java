package com.sophos.www.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.www.task.OpenTheBrowser;
import com.sophos.www.userinterfaces.HomeVivanda;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyProductOfVivandaStepDefinition {
	
	@Before
    public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
        theActorCalled("JuanPablo");
    }
	
	
	@Given("^User open website$")
	public void userOpenWebsite()  {
		theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on(HomeVivanda.newInstance()));
	}


	@When("^I add a product to the shopping cart$")
	public void iAddAProductToTheShoppingCart() {
	   
	}

	@Then("^I should see that the product was added successfully$")
	public void iShouldSeeThatTheProductWasAddedSuccessfully() throws Exception {
	    
	}

}
