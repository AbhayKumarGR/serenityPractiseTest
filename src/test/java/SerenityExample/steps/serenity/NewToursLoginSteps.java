package SerenityExample.steps.serenity;

import SerenityExample.pages.NewToursLoginPage;
import net.thucydides.core.annotations.Step;

public class NewToursLoginSteps {
    NewToursLoginPage newToursLoginPage;

    @Step
    public void Login_to_NewTours(String user, String pass) {
        newToursLoginPage.open();
        String status = null;
        newToursLoginPage.getLoginResult(user, pass);
    }

    public String GetLoginStatus(){
        String status= null;
        String NewURL = newToursLoginPage.getCurrentURL();
        if(NewURL.contains("mercuryreservation")){
            status = "successful_login";
        }else status ="failed_login";
        return status;
    }

}
