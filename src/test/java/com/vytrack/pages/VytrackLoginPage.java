package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "prependedInput")
    public WebElement inputUsername;

    @FindBy (id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@id='_submit']")
    public WebElement loginBtn;

    @FindBy (xpath = "(//a[.='Fleet Management'])[2]")
    public WebElement fleetManagement;


    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }
}

