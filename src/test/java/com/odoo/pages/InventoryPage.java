package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(linkText = "Reordering Rules")
    public WebElement reorderingRules;

    public InventoryPage(){

    }
}
