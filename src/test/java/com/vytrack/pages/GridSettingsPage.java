package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GridSettingsPage {
public GridSettingsPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsBtn;

@FindBy(xpath = "//div[.='Grid Settings']")
    public WebElement gridSettingsTitle;


}
