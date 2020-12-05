package pages;

import base.BasePage;
import org.openqa.selenium.By;
import utils.ElementUtil;

public class RegistrationPage extends ElementUtil {

    //locators
    By emailBox = By.id("create_account_email");
    By firstnameBox = By.xpath("(//*[@type='text'])[2]");
    By lastNameBox = By.xpath("(//*[@type='text'])[3]");
    By passwordBox = By.xpath("(//*[@type='password'])[2]");
    By passwordConfirmBox = By.xpath("(//*[@type='password'])[3]");
    By phoneNumber = By.xpath("(//*[@type='text'])[5]");
    By address = By.xpath("(//*[@type='text'])[6]");
    By cityBox = By.xpath("(//*[@type='text'])[7]");
    By stateDropDown = By.xpath("(//*[@type='text'])[8]");
    By stateOptions = By.xpath("//*[@class = 'visible menu transition']//span");
    By zipCodeBox = By.xpath("(//*[@type='text'])[9]");
    By countryDropDown = By.xpath("(//*[text()='United States of America'])[1]//parent::div");
    By countryOptions = By.xpath("(//*[text()='United States of America'])[1]//parent::div//span");
    By investorOptions = By.xpath("(//*[@class='_radio_e1a40'])[2]");
    By agreementBox = By.xpath("(//*[@class='_check_1fb41'])[1]");
    By understandBox = By.xpath("//*[contains(@class,' css-ldki8z')]//div[2]//div");
    By captchaBox = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
    By signUpBtn = By.xpath("(//*[contains(@class,'_button_d2f0c _flat_')])[7]");
    By successMessage = By.xpath("//*[contains(text(),'Thank you for signing up with our portal')]");


    //actions
    public void sendEmail(String text) {
        sendValue(emailBox, text);
    }
    public void sendFirstName(String text) {
        sendValue(firstnameBox, text);
    }
    public void sendLastName(String text) {
        sendValue(lastNameBox, text);
    }
    public void sendPassword(String text) {
        sendValue(passwordBox, text);
    }
    public void sendPasswordConfirm(String text) {
        sendValue(passwordConfirmBox, text);
    }
    public void sendPhoneNumber(String text) {
        sendValue(phoneNumber, text);
    }
    public void sendAddress(String text) {
        sendValue(address, text);
    }
    public void sendCity(String text) {
        sendValue(cityBox, text);
    }
    public void sendZipCode(String text) {
        sendValue(zipCodeBox, text);
    }

    public void selectingState(String text){
        clickOn(stateDropDown);
        singleValueSelectionDropDown(stateOptions,text);
    }
    public void selectingCountry(String text){
        clickOn(countryDropDown);
        singleValueSelectionDropDown(countryOptions,text);
    }
    public void clickOnInvester(){
        clickOn(investorOptions);
    }
    public void clickOnAgreement(){
        clickOn(agreementBox);
    }
    public void clickOnUnderstand(){
        clickOn(understandBox);
    }
    public void checkMarkCaptcha(){
        int number = findTheNumberOfFrame(captchaBox);
        BasePage.get().switchTo().frame(number);
        scrollByElement(captchaBox);
        clickOn(captchaBox);
        BasePage.get().switchTo().defaultContent();

    }
    public void signingUp(){
        waitElement(signUpBtn);
        clickOn(signUpBtn);
    }
    public String message(){
        return webAction(successMessage).getText();
    }

}





