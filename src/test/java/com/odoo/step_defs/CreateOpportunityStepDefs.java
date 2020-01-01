package com.odoo.step_defs;

import com.odoo.pages.CRMPage;
import com.odoo.pages.DiscussPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateOpportunityStepDefs {

    @Given("a user is on the CRM tab")
    public void a_user_is_on_the_CRM_tab() {
        //opening browser, got to website
        Driver.get().get(ConfigurationReader.get("url"));
        //sign in
        new LoginPage().signInButton.click();
        new LoginPage().login(ConfigurationReader.get("crmManagerUsername"),ConfigurationReader.get("crmManagerPassword"));
        BrowserUtils.waitFor(3);
        new DiscussPage().CRM.click();
        BrowserUtils.waitFor(2);
    }

    @When("a user clicks on the create button")
    public void a_user_clicks_on_the_create_button() {
    new CRMPage().createButton.click();
    BrowserUtils.waitFor(2);
    }

    @When("a user enters opportunity title")
    public void a_user_enters_opportunity_title() {

     new CRMPage().opportunityInput.sendKeys("textValidation");
    }

    @When("clicks on Create button")
    public void clicks_on_Create_button() {
      new CRMPage().getCreateButton.click();
      BrowserUtils.waitFor(3);
    }

    @Then("the user should see the title name in the pipeline table")
    public void the_user_should_see_the_title_name_in_the_pipeline_table() {

     Assert.assertTrue(new CRMPage().textValidation.isDisplayed());
    }
}
