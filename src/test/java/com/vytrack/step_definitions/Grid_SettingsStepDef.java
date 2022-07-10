package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.GridSettingsPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Grid_SettingsStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();

    GridSettingsPage gridSettingsPage=new GridSettingsPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("the user is on the Vehicles page with Cars header")
    public void the_user_is_on_the_vehicles_page_with_cars_header() {
    //    Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
    //    vytrackLoginPage.login("user48", "UserUser123");
    //    Select fleet = new Select(gridSettingsPage.fleet);
     //   fleet.selectByIndex(1);

        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
    }

    @When("the user clicks on Grid Settings button")
    public void theUserClicksOnGridSettingsButton() {
        gridSettingsPage.gridSettingsBtn.click();
    }


    @Then("the user should see the settings with Grid Settings title")
    public void the_user_should_see_the_settings_with_grid_settings_title() {


Assert.assertEquals("Grid Settings",gridSettingsPage.gridSettingsTitle.getText());
    }


}
