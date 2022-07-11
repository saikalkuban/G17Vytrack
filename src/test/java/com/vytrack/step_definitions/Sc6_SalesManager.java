package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Sc6_SalesManager {
    FleetManagementPage fleetManagementPage = new FleetManagementPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @Given("Sales manager enter below credentials")
    public void sales_manager_enter_below_credentials(Map<String,String> credentials) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        String username=credentials.get("username");
        String password=credentials.get("password");
        new VytrackLoginPage().login(username,password);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

    }
    @And("Sales manager click on login button")
    public void sales_manager_click_on_login_button() {

    }
    @When("Sales manager hover over fleet module")
    public void sales_manager_hover_over_fleet_module() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetManagementPage.fleetModuleBtn).perform();
        fleetManagementPage.vehiclesBtn.click();
    }
    @When("Sales manager click on vehicles")
    public void sales_manager_click_on_vehicles() {

    }
    @When("Sales manager should see vehicles page")
    public void sales_manager_should_see_vehicles_page() {
        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshBtn));
    }
    @Then("Sales manager should be able to refresh the page")
    public void sales_manager_should_be_able_to_refresh_the_page() {
        vehiclesPage.refreshBtn.click();
        Assert.assertTrue(vehiclesPage.refreshBtn.isDisplayed());
    }
}
