package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (xpath = "//b[contains(text(), 'Sign in')]")
    public WebElement signInButton;

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(linkText = "Point of Sale")
    public WebElement pointofSale;

    @FindBy(xpath = "//li[@class='active']//a[@class='oe_menu_leaf']")
    public WebElement products;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']//div[@class='oe_kanban_global_click o_kanban_record'][1]")
    public WebElement AlienWare;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement Alienwaretitle;


    public void login (String usernameString, String passwordString) {
        username.sendKeys(usernameString);
        password.sendKeys(passwordString);
        loginButton.click();
    }
}
