package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);


    }
   @FindBy(id="login")
    public WebElement username;


    @FindBy(id ="password")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
            public WebElement submit;

public void login(String usernameStr,String passwordStr ){
    username.sendKeys(usernameStr);
    password.sendKeys(passwordStr);
    submit.click();
}




}
