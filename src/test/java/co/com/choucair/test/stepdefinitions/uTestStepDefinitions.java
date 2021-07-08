package co.com.choucair.test.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenUp;

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than User wants to register on the uTest page$")
    public void thanUserWantsToRegisterOnTheUTestPage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp
                .thePage());
    }

    @When("^he find and fill out the form$")
    public void heFindAndFillOutTheForm(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(uTestData.get(0).getFirstName(),
                uTestData.get(0).getLastName(), uTestData.get(0).getEmail(), uTestData.get(0).getMonth(),
                uTestData.get(0).getDay(), uTestData.get(0).getYear(), uTestData.get(0).getZip(),
                uTestData.get(0).getPassword()));
    }

    @Then("^he login and enter to the page$")
    public void heLoginAndEnterToThePage() {

    }

}
