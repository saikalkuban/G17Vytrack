package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.GridSettingsPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Grid_SettingsStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();

    GridSettingsPage gridSettingsPage=new GridSettingsPage();

    @Given("the user is on the Vehicles page")
    public void the_user_is_on_the_vehicles_page() {
        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
    }
    @When("the user clicks on Grid Settings button")
    public void the_user_clicks_on_grid_settings_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(gridSettingsPage.gridSettingsBtn).perform();
    }



    @Then("the user should see the Grid Settings title")
    public void theUserShouldSeeTheGridSettingsTitle() {
        Assert.assertEquals("Grid Settings",gridSettingsPage.gridSettingsTitle.getText());
    }
}
