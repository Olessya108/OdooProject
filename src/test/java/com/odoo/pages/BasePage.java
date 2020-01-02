package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

@FindBy(linkText = "Inventory")
public WebElement inventory;

@FindBy(linkText = "CRM")
public WebElement CRM;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    }