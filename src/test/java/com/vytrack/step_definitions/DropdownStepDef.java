package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DropdownStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();

    @Given("the user is logged in and on Fleet Management page")
    public void the_user_is_logged_in_and_on_fleet_management_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        vytrackLoginPage.login("user48", "UserUser123");
    }
    @When("the user clicks on Fleet module")
    public void the_user_clicks_on_fleet_module() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetManagementPage.fleetModuleBtn).perform();
    }
    @When("the user clicks on Vehicles subcategory")
    public void the_user_clicks_on_vehicles_subcategory() {

        fleetManagementPage.vehiclesBtn.click();
    }
    @Then("the user should see the Vehicles page with Cars header")
    public void the_user_should_see_the_vehicles_page_with_cars_header() {
        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
    }

    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        vytrackLoginPage.login(username, password);
    }

}
