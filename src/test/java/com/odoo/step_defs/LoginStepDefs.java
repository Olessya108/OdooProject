package com.odoo.step_defs;

import com.odoo.pages.BasePage;
import com.odoo.pages.InventoryPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().signInButton.click();
    }

    @When("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and(String contactUN, String contactPW) {
    contactUN = ConfigurationReader.get("contactUsername");
    contactPW = ConfigurationReader.get("contactPassword");
      new LoginPage().login(contactUN, contactPW);
      BrowserUtils.waitFor(2);

    }

    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {
        System.out.println("Verifying the user is logged in");
        BrowserUtils.waitFor(2);               //if need time to load
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("#Inbox - Odoo", actualTitle);
    }

    @Then("user should be able to click on Inventory module")
    public void user_should_be_able_to_click_on_Inventory_module() {
    new LoginPage().inventory.click();

    }

    @Then("user should be able to click Reordering Rules")
    public void user_should_be_able_to_click_Reordering_Rules() {
        BrowserUtils.waitFor(2);
       new InventoryPage().reorderingRules.click();
       String actual = Driver.get().getTitle();
        System.out.println(actual);
       Assert.assertEquals("Inventory - Odoo", actual);
    }

}
