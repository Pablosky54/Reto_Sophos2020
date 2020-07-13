package com.sophos.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateCar extends PageObject{
	
	public static final Target PRODUCT_BOX = Target.the("Validate product in the card")
            .located(By.xpath("*//div//h4[@class='cartSkuName']"));
	
	public static final Target CARD_BOX = Target.the("The card")
            .located(By.xpath("//div//i[@class='minicart__btn__icon-i']"));

}
