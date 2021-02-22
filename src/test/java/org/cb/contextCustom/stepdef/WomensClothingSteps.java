package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.WomensClothing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WomensClothingSteps extends Base{
    WomensClothing womensClothing = new WomensClothing();
    Logger logger = LoggerFactory.getLogger(WomensClothingSteps.class);

    @When("move on to Categories dropdown menu")
    public void moveOnToCategoriesDropdownMenu() {
        moveToElement(womensClothing.categories);
    }

    @Then("move on to Women's Clothing sub-menu")
    public void moveOnToWomenSClothingSubMenu() {
        moveToElement(womensClothing.womenscloth);
        waitSomeTime(1000L);
    }

    @And("move and click on All Women's Clothing")
    public void moveAndClickOnAllWomenSClothing() {
        moveAndClickToElement(womensClothing.allWomen);
    }

    @Then("verify that Women's Clothing text is present")
    public void verifyThatWomenSClothingTextIsPresent() {
        String expected = "Women's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, womensClothing.womensClothingText);
    }

    @And("verify that first women item image is present")
    public void verifyThatFirstWomenItemImageIsPresent() {
    }

    @And("verify that women item brand name is present")
    public void verifyThatWomenItemBrandNameIsPresent() {
    }

    @Then("verify that women item title is present")
    public void verifyThatWomenItemTitleIsPresent() {
    }

    @And("verify that women item price is present")
    public void verifyThatWomenItemPriceIsPresent() {
    }

    @And("click on first women item picture")
    public void clickOnFirstWomenItemPicture() {
    }

    @Then("verify that first women item name is present")
    public void verifyThatFirstWomenItemNameIsPresent() {
    }
}
