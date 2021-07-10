package com.nbs.pages;

import com.nbs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {
    public Locators(){ PageFactory.initElements(Driver.get(), this);
    }

   @FindBy(id ="content" )
     public WebElement toDoinputBox;


    @FindBy(xpath = "//span[.='Create todo']")
    public WebElement CreateTodo;


    @FindBy(xpath = "//table[@class='mat-table cdk-table mat-elevation-z8']//tbody/tr[1]/td[4]")
    public WebElement checkBox;


}
