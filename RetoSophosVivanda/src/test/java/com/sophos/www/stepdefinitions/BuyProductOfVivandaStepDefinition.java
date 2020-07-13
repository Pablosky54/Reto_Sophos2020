package com.sophos.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import com.sophos.www.interactions.OpenCardProduct;
import com.sophos.www.models.Product;
import com.sophos.www.questions.ValidateAddCar;
import com.sophos.www.task.AddProductToShoppingCart;
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
		theActorInTheSpotlight().attemptsTo(AddProductToShoppingCart.withTheName(Product.PRODUCT.toString())
				,OpenCardProduct.of());
	   
	}

	@Then("^I should see that the product was added successfully$")
	public void iShouldSeeThatTheProductWasAddedSuccessfully() {
		
		theActorInTheSpotlight().should(seeThat(ValidateAddCar.nameProductIs(Product.PRODUCT.toString())));
	    
	    
	}

}
