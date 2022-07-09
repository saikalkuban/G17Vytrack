package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetManagementPage {

    public FleetManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModuleBtn;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehiclesBtn;

    @FindBy (xpath = "//h1[.='Cars']")
    public WebElement carsHeader;

}
