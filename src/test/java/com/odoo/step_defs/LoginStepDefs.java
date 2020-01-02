package com.odoo.step_defs;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username =ConfigurationReader.get("eventsManagerUserName");
        String password =ConfigurationReader.get("eventsManagerPassWord");
        new LoginPage().login(username,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username , String password ) {
        System.out.println("username = "+username );
        System.out.println("password = "+password  );
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("ASDasda");
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String title) {
        System.out.println("title = "+title);
        BrowserUtils.waitFor(3);
        Assert.assertTrue("Actual title: "+Driver.get().getTitle(),Driver.get().getTitle().contains(title));
    }


}
