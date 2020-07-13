package com.sophos.www.questions;

import static com.sophos.www.userinterfaces.ValidateCar.PRODUCT_BOX;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAddCar implements Question<Boolean> {
	
	private String nameProduct;
	
	
 

	public ValidateAddCar(String nameProduct) {
		super();
		this.nameProduct = nameProduct;
	}

	@Override
    public Boolean answeredBy(Actor actor) {
    	
        return Text.of(PRODUCT_BOX).viewedBy(actor).asString().equals(nameProduct);
    }

    public static ValidateAddCar nameProductIs(String nameProduct){
        return new ValidateAddCar(nameProduct);
    }
}