package stepDefinitions;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.WestMarine;

public class WestMarineStepDef {

    WestMarine wm=new WestMarine();

    @Given("^I am on the WestMarine website$")
    public void i_am_on_the_WestMarine_website() {
        Assert.assertEquals(BasePage.get().getTitle(),"Boat Parts, Sailing, Kayaks, Paddleboards and Marine Electronics | West Marine");
    }

    @When("^I click on sign in button$")
    public void i_click_on_sign_in_button() {
        wm.signinClick();
    }
//    @And("^I enter (.+) into emailbox$")   // bu metodu alttaki ile birlestirdik ayri ayri yapmak yerine
//    public void i_enter_valid_into_emailbox(String text) {
//        wm.enterEmail(text);
//    }

    @Then("^I enter (.+) into (emailbox|passwordBox)$")
    public void i_enter_password_into_passwordBox(String text, String textField) {
        switch(textField){
            case "emailbox":
                wm.enterEmail(text);

                break;
            case "passwordBox":
                wm.enterPassword(text);
                break;

        }

    }

    @Then("^I want to see warning message$")
    public void i_want_to_see_warning_message() {
        wm.submitBox();
        Assert.assertEquals(wm.warning(),"There is an error with your email and/or password. " +
                "Passwords are case-sensitive, must be at least 8 characters and contain one letter and one number.\n Chat Now for Assistance");
    }


    @When("^I type \"([^\"]*)\" in search box$")
    public void i_type_something_in_search_box(String text) {
      wm.enterSearchBox(text);
    }

    @Then("^I click search button$")
    public void i_click_search_button()  {
        wm.searchBoxClick();
    }

    @And("^I validate to women shoes department$")
    public void i_navigate_to_women_shoes_page() {
        Assert.assertEquals(wm.departmentTitle(), "Women's Shoes | West Marine");

    }

    }

    //<target-surefire*reports-sag tikla browser- unset file name i tikla>
    // xml fileda parallel testing icin bu yontem takip edilir
    // headless browser: browseri acmadan arka planda browseri acar ama biz goremeyiz






