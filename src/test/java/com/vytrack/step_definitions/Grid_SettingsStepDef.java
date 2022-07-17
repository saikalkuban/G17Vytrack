//package com.vytrack.step_definitions;
//
//import com.vytrack.pages.FleetManagementPage;
//import com.vytrack.pages.GridSettingsPage;
//import com.vytrack.pages.VytrackLoginPage;
//import com.vytrack.utilities.ConfigurationReader;
//import com.vytrack.utilities.Driver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.Map;
//
//public class Grid_SettingsStepDef {
//
//    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
//
//    FleetManagementPage fleetManagementPage = new FleetManagementPage();
//
//    GridSettingsPage gridSettingsPage=new GridSettingsPage();
//
//    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//
//    @Given("the user is on the login page")
//    public void the_user_is_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
//    }
//
//    @When("the user enters the username {string}")
//    public void the_user_enters_the_username(String username) {
//        vytrackLoginPage.inputUsername.sendKeys(username + Keys.ENTER);
//    }
//    @When("the user enters the password {string}")
//    public void the_user_enters_the_password(String password) {
//        vytrackLoginPage.inputPassword.sendKeys(password + Keys.ENTER);
//    }
//    @When("the user clicks the login button")
//    public void the_user_clicks_the_login_button() {
//        vytrackLoginPage.loginBtn.click();
//    }
//
//    @Then("the user should see Fleet Management page")
//    public void the_user_should_see_fleet_management_page() {
//        Assert.assertEquals("FLEET MANAGEMENT", vytrackLoginPage.fleetManagement.getText());
//    }
//
//    @Then("the user should be able to click Grid Setting button")
//    public void the_user_should_be_able_to_click_grid_setting_button() {
//
//    }
//
//
//}
