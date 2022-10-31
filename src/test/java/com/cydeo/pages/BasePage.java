package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath = "//button[@class=\"button nav__item active\"]")
    public WebElement viewAllOrdersButtonNav;

    @FindBy(css = "a[href='/products'] button")
    public WebElement viewAllProductsButtonNav;

    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/a[3]/button")
    public WebElement orderButtonNavItem;

    @FindBy(xpath = "//button[@class=\"button __logout\"]")
    public WebElement logoutButton;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
