package com.sophos.www.task;

import static com.sophos.www.exceptions.AddProductException.ELEMENT_NO_VISIBLE_FAILED_MESSAGE;
import static com.sophos.www.userinterfaces.HomeVivanda.BUY_PRODUCT;
import static com.sophos.www.userinterfaces.HomeVivanda.SEARCH_BOX;
import static com.sophos.www.userinterfaces.HomeVivanda.SELECT_PACKAGE;
import static com.sophos.www.userinterfaces.HomeVivanda.SELECT_RANDON_ADRESS;
import static com.sophos.www.userinterfaces.HomeVivanda.ACCEPT_BOTTON;
import static com.sophos.www.userinterfaces.HomeVivanda.CONFIRM_BOTTON;
import static com.sophos.www.userinterfaces.HomeVivanda.CLOSE_BOTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.ElementNotVisibleException;

import com.sophos.www.exceptions.AddProductException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;



public class AddProductToShoppingCart implements Task {

    private String nameProduct;

    public AddProductToShoppingCart(String nameProduct){
        this.nameProduct = nameProduct;
    }
    
    @Override
    @Step("{0} add a product to shopping cart on vivanda website")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Enter.theValue(nameProduct+"\n").into(SEARCH_BOX),            		
            		  		Click.on(BUY_PRODUCT)
            		  		,Click.on(SELECT_PACKAGE)
            		  		,Click.on(SELECT_RANDON_ADRESS)
            		  		,Click.on(ACCEPT_BOTTON)
            		  		,Click.on(CONFIRM_BOTTON)
            		  		,Click.on(CLOSE_BOTTON)); 
            
           
            	
            	
        }catch (ElementNotVisibleException e){
            throw new AddProductException(ELEMENT_NO_VISIBLE_FAILED_MESSAGE,e);
        }
    }

    public static AddProductToShoppingCart withTheName(String nameProduct){
        return instrumented(AddProductToShoppingCart.class,nameProduct);
    }
}
