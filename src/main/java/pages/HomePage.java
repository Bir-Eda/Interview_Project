package pages;

import org.openqa.selenium.By;
import utils.ElementUtil;

public class HomePage extends ElementUtil {
    //locators
    By createAccountBtn = By.xpath("(//*[text()='Create An Account'])[1]");


    //actions
    public void navigatingToSignUpPage(){
        clickOn(createAccountBtn);
    }

}
