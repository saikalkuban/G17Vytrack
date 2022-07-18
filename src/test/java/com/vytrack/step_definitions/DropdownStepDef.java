package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("the user is logged in and on Fleet Management page")
    public void the_user_is_logged_in_and_on_fleet_management_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        vytrackLoginPage.login("user48", "UserUser123");

        wait.until(ExpectedConditions.titleIs("Dashboard"));
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

    @When("the user clicks on the Export Grid dropdown")
    public void the_user_clicks_on_the_export_grid_dropdown() {

        vehiclesPage.exportGridBtn.click();

    }

    @Then("the user should see the dropdown options")
    public void the_user_should_see_the_dropdown_options() {
        Assert.assertTrue(vehiclesPage.csv.isDisplayed());
    }

    @Then("the user verifies that Export Grid dropdown is on the left of the page")
    public void the_user_verifies_that_export_grid_dropdown_is_on_the_left_of_the_page() {
        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
        System.out.println("Screen width: " + winWidth);
        int xPos = vehiclesPage.exportGridBtn.getLocation().getX();
        Assert.assertTrue("The button is NOT on the left", xPos <= winWidth / 2);
    }

    @Then("the user verifies that the Grid Settings button is on the right of the page")
    public void the_user_verifies_that_the_grid_settings_button_is_on_the_right_of_the_page() {
        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
        System.out.println("Screen width: " + winWidth);
        int xPos = vehiclesPage.gridSettingsBtn.getLocation().getX();
        Assert.assertTrue("The button is NOT on the right", xPos >= winWidth / 2);
    }
}



