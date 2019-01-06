package SerenityExample.steps;

import SerenityExample.steps.serenity.NewToursLoginSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class NewToursStepdefs {
@Steps
    NewToursLoginSteps newToursLoginSteps;


    @When ("^the user logs in using (.*) and (.*)$")
    public void user_logs_in_using_userid_and_passwrd(String userid, String password){
        newToursLoginSteps.Login_to_NewTours(userid,password);
    }

    @Then("^the user is logged in with (.*) to the newTours$")
    public  void user_verifies_login_status(String status){
        String login_stat = newToursLoginSteps.GetLoginStatus();
        Assert.assertEquals("Status does not match",status,login_stat);
    }

    @Given("^The user is on the newToursPage$")
    public void theUserIsOnTheNewToursPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user clicks on the registration link$")
    public void theUserClicksOnTheRegistrationLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^enters the (.*),(.*), (.*) , (.*) and (.*) in the registration page$")
    public void entersTheNameAddressUsernameEmailAndPasswordInTheRegistrationPage(String Name, String Address, String email, String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user profile is created successfully$")
    public void theUserProfileIsCreatedSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
