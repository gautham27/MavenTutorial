package com.TechM.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ObjectMap {

    @FindBy(xpath = "//label[contains(text(),'Enter message')]//parent::*//input")
    public WebElement edtUserMessage_1;

    @FindBy(xpath = "(//label[contains(text(),'Enter message')]//following::*//input)[1]")
    public WebElement edtEnterValue1;

    @FindBy(xpath = "(//label[contains(text(),'Enter message')]//following::*//input)[2]")
    public WebElement edtEnterValue2;

    @FindBy(xpath = "//form[@id='get-input']//child::*//input")
    public WebElement edtUserMessage_2;

    @FindBy(xpath = "//button[(starts-with(text(),'Get'))]")
    public WebElement btnGetTotal;

    @FindBy(xpath = "//button[text()='Show Message']")
    public WebElement btnShowMessage;

    @FindBy(name = "optradio")
    public WebElement rdbMale;


    @FindBy(xpath = "//input[@value='Female']")
    public WebElement rdbFemale;

    @FindBy(id = "select-demo")
    public WebElement lstForm;

    @FindBy(id = "multi-select")
    public WebElement lstMultiSelect;

    @FindBy(xpath = "(//button[text()='Click me!'])[1]")
    public WebElement btnClickMe1;

    @FindBy(xpath = "(//button[text()='Click me!'])[2]")
    public WebElement btnClickMe2;

    @FindBy(xpath = "//button[text()='Click for Prompt Box']")
    public WebElement btnClickMe3;

    @FindBy(xpath = "//p")
    public WebElement txtP;

    @FindAll(@FindBy(xpath = "//h3//parent::*//span"))
    public List<WebElement> lstDraggable;

    @FindBy(id = "mydropzone")
    public WebElement edtDropZone;

    @FindBy(xpath = "//button[text()='New Browser Window']")
    public WebElement btnNewBrowserWindow;

    @FindBy(xpath = "//button[text()='New Browser Tab']")
    public WebElement btnNewBrowserTab;


    @FindBy(id = "frame1")
    public WebElement frmTop;

    @FindBy(id = "frame2")
    public WebElement frmContent;

    @FindBy(xpath = "//h2[text()='www.toolsqa.com']")
    public WebElement txtToolsQA;
    @FindBy(xpath = "//h1[text()='This is a sample page']")
    public WebElement txtThisIsSamplePage;

    @FindBy(xpath = "id('todrag')/span")
    public WebElement lstTools;


    WebDriver driver;

    public ObjectMap(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }




}
