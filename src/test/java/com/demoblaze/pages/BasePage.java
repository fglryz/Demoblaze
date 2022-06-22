package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    public void getLink(String Link){
        Driver.getDriver().findElement(By.partialLinkText(Link)).click();


    }
}
