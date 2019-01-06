package SerenityExample.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://newtours.demoaut.com")
public class NewToursLoginPage extends PageObject {
    @FindBy(name = "userName")
    WebElement txt_userName;

    @FindBy(name = "password")
    WebElement txt_password;

    @FindBy(name="login")
    WebElement btn_SignIn;

    public void getLoginResult(String userName, String Password){
        txt_userName.sendKeys(userName);
        txt_password.sendKeys(Password);
        btn_SignIn.submit();
    }

    public String getCurrentURL() {
        return getDriver().getCurrentUrl();
    }
}
