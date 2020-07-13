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
	
	public static final Target SEARCH_BOX = Target.the("search box in vivanda home page")
            .located(By.xpath("//div//header//input[@type='search']"));
	
	public static final Target BUY_PRODUCT = Target.the("Add box button")
            .located(By.xpath("*//div[@class='buy-button-normal']"));
	
	public static final Target SELECT_PACKAGE = Target.the("Select package button")
            .located(By.xpath("*//div//button[@class='SalesChannel__deliveryButton']//span[contains(text(),'Recojo')]"));
	
	public static final Target SELECT_RANDON_ADRESS = Target.the("Select randon adress button")
            .located(By.xpath("*//div//span[@class='checkmark']"));
	
	public static final Target ACCEPT_BOTTON = Target.the("Accept add adress botton")
            .located(By.xpath("*//div//div[@class='SalesChannel__buttonWrapper']//button[@class='SalesChannel__preButton']"));
	
	public static final Target CONFIRM_BOTTON = Target.the("Confirm add adress botton")
            .located(By.xpath("*//div//div[@class='SalesChannel__buttonWrapper']//button[@class='SalesChannel__confirmButton SalesChannel__confirmButton--ubigeo SalesChannel_confirmButton--active']"));
	
	public static final Target CLOSE_BOTTON = Target.the("Close botton of windows")
            .located(By.xpath("//div[@class='SalesChannel__close']"));

}
