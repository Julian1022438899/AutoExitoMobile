package co.com.choucair.certification.exitomobile.stepdefinitions;

import co.com.choucair.certification.exitomobi.tasks.OpenUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ExitoMobileStepDefinitions {
    @Given("that user to enter the exito application")
    public void thatUserToEnterTheExitoApplication() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }
    @When("he enters the information in the register form")
    public void heEntersTheInformationInTheRegisterForm() {

    }
    @Then("he verifies the register")
    public void heVerifiesTheRegister() {

    }
    //////////////////////////////
    @When("log in and I add a product to the shopping cart")
    public void logInAndIAddAProductToTheShoppingCart() {

    }
    @Then("he verifies that the product was added to the shopping cart")
    public void heVerifiesThatTheProductWasAddedToTheShoppingCart() {

    }

}
