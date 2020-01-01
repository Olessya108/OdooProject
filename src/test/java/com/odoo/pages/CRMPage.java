package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRMPage extends BasePage {

@FindBy (css = ".btn.btn-primary.btn-sm.o-kanban-button-new")
    public WebElement createButton;

@FindBy (css = ".o_field_char.o_field_widget.o_input.o_required_modifier")
public WebElement opportunityInput;

@FindBy (name = "close_dialog")
public WebElement getCreateButton;

@FindBy (xpath = "//span[contains(text(),'textValidation')]")
public WebElement textValidation;
    public CRMPage(){

    }
}
