package com.sophos.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.vivanda.com.pe/")
public class HomeVivanda extends PageObject{
	
	public static HomeVivanda newInstance(){
        return new HomeVivanda();
    }
	
	public static final Target SEARCH_BOX = Target.the("search box in metro home page")
            .located(By.xpath("//*[@id=\"search-autocomplete-input\"]"));
	

}
