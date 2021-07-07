package co.com.choucair.test.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenUp;

public class uTestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than User wants to register on the uTest page$")
    public void thanUserWantsToRegisterOnTheUTestPage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^he find and fill out the form$")
    public void heFindAndFillOutTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Then("^he login and enter to the page$")
    public void heLoginAndEnterToThePage() {

    }

}
