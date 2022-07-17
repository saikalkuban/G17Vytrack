package com.vytrack.step_definitions;
import org.junit.Assert;
import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

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
        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.cars));
        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
    }

    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        vytrackLoginPage.login(username, password);
    }

    @When("the user clicks on the Export Grid dropdown")
    public void the_user_clicks_on_the_export_grid_dropdown() throws InterruptedException {
        Thread.sleep(5000);
        vehiclesPage.exportGridBtn.click();

    }
    @Then("the user should see the dropdown options")
    public void the_user_should_see_the_dropdown_options() {
        Assert.assertTrue(vehiclesPage.csv.isDisplayed());
    }


    @Then("the user should be able to reset the page")
    public void theUserShouldBeAbleToResetThePage() {
        wait.until(ExpectedConditions.visibilityOf(vehiclesPage.cars));
        vehiclesPage.resetBtn.click();
    }

    @Then("the reset button should be displayed")

    public void the_reset_button_should_be_displayed() {
        Assert.assertTrue(vehiclesPage.resetBtn.isDisplayed());


    }}
