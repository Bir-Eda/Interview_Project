package stepDefinitions;

import base.BasePage;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utils.Constants;

public class RegistrationStepDef {
    HomePage hp = new HomePage();
    RegistrationPage rp = new RegistrationPage();

    @Given("^User is on HomePage$")
    public void onHomepage() {
        Assert.assertEquals(BasePage.get().getTitle(), Constants.HOME_PAGE_TITLE);
    }

    @When("^User navigates to RegistrationPage$")
    public void navigateToRegistrationpage()  {
        hp.navigatingToSignUpPage();
        Assert.assertEquals(BasePage.get().getTitle(), Constants.REGISTRATION_PAGE_TITLE);

    }

    @When("^User enters (.+) into (email|firstname|lastname|password|confirmPassword|phoneNumber|address|city|zipCode) box on the registration page$")
    public void enterCredentials(String text, String textField)  {
        switch(textField){
            case "email":
                rp.sendEmail(text);
                break;
            case "firstname":
                rp.sendFirstName(text);
                break;
            case "lastname":
                rp.sendLastName(text);
                break;
            case "password":
                rp.sendPassword(text);
                break;
            case "confirmPassword":
                rp.sendPasswordConfirm(text);
                break;
            case "phoneNumber":
                rp.sendPhoneNumber(text);
                break;
            case "address":
                rp.sendAddress(text);
                break;
            case "city":
                rp.sendCity(text);
                break;
            case "zipCode":
                rp.sendZipCode(text);
                break;

        }

    }


    @Then("^User selects (.+) from (countryDropDownMenu|stateDropDownMenu)$")
    public void selectDropDownOption(String text, String dropDown)  {
        switch(dropDown){
            case "stateDropDownMenu":
                rp.selectingState(text);
                break;
            case "countryDropDownMenu":
               rp.selectingCountry(text);
                break;
        }
    }

    @Then("^User checkmarks on captchaBox$")
    public void checkmarkOnCaptcha() {
        rp.checkMarkCaptcha();
    }


    @And("^User clicks on (investor|aggreementCheckBox|understandCheckBox)$")
    public void clickOnSections(String checkMark)  {
        switch(checkMark){
            case "investor":
                rp.clickOnInvester();
                break;
            case "aggreementCheckBox":
               rp.clickOnAgreement();
                break;
            case "understandCheckBox":
                rp.clickOnUnderstand();
                break;
        }

    }
    @When("^User completes the signUp by clicking signUpButton$")
    public void clickingOnSignupbutton() {
            rp.signingUp();
    }

    @Then("^User verifiyes the success registration$")
    public void verifiyeSuccessfulRegistration()  {
        Assert.assertEquals(rp.message(),Constants.REGISTRATION_SUCCESS_MESSAGE);

    }
}
