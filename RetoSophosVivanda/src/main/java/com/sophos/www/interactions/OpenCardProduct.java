package com.sophos.www.interactions;

import static com.sophos.www.exceptions.AddProductException.ELEMENT_NO_VISIBLE_FAILED_MESSAGE;
import static com.sophos.www.userinterfaces.ValidateCar.CARD_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.ElementNotVisibleException;

import com.sophos.www.exceptions.AddProductException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;



public class OpenCardProduct implements Interaction {

    

    public OpenCardProduct(){
        
    }
    
    @Override
    @Step("{0} add a product to shopping cart on vivanda website")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(CARD_BOX)); 
            
           
            	
            	
        }catch (ElementNotVisibleException e){
            throw new AddProductException(ELEMENT_NO_VISIBLE_FAILED_MESSAGE,e);
        }
    }

    public static OpenCardProduct of(){
        return instrumented(OpenCardProduct.class);
    }
}
