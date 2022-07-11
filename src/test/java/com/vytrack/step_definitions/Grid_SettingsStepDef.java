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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Grid_SettingsStepDef {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    FleetManagementPage fleetManagementPage = new FleetManagementPage();

    GridSettingsPage gridSettingsPage=new GridSettingsPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("truck driver enter below credentials")
    public void truck_driver_enter_below_credentials(Map<String,String> credentials) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
       vytrackLoginPage.login(credentials.get("username"),credentials.get("password"));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
    }
    @Given("truck driver click on login button")
    public void truck_driver_click_on_login_button() {
       vytrackLoginPage.loginBtn.click();
    }
    @When("truck driver hover over fleet module")
    public void truck_driver_hover_over_fleet_module() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetManagementPage.fleetModuleBtn).perform();
        fleetManagementPage.vehiclesBtn.click();
    }
    @When("truck driver click on vehicles")
    public void truck_driver_click_on_vehicles() {


    }
    @When("truck driver should see vehicles page")
    public void truck_driver_should_see_vehicles_page() {
        Assert.assertEquals("Cars", fleetManagementPage.carsHeader.getText());
    }
    @Then("truck driver should be able to click Grid Settings Button")
    public void truck_driver_should_be_able_to_click_grid_settings_button() {
        gridSettingsPage.gridSettingsBtn.click();
    }

}


