package pages;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.ElementUtil;

public class WestMarine extends ElementUtil {
    //locator
    By signinBtn = (By.xpath("//a[contains(@class, 'user-account-menu')]"));
    By emailBtn = (By.xpath("//*[@id='header_j_username']"));
    By password = (By.id("header_j_password"));
    By signIn = (By.xpath("(//*[text()='Sign In'])[2]"));
    By warningMessage = (By.xpath("//*[contains(text(),'Passwords are case-sensitive,')]"));
    By searchBox = (By.id("search"));
    By searchBoxBtn = (By.xpath("//*[contains(@class,'search-button btn')]"));

    public void signinClick(){
        clickOn(signinBtn);
    }
    public void enterEmail(String text){
        sendValue(emailBtn, text);
    }
    public void enterPassword(String text){
        sendValue(password, text);
    }
    public void submitBox(){
        clickOn(signIn);
    }
    public String warning(){
        return webAction(warningMessage).getText();
    }

    public void enterSearchBox(String text){
        sendValue(searchBox, text);
    }
    public void searchBoxClick(){
        clickOn(searchBoxBtn);
    }
    public String departmentTitle(){
        return BasePage.get().getTitle();  //bu metodla sayfanin title`ini aldim
    }






}
