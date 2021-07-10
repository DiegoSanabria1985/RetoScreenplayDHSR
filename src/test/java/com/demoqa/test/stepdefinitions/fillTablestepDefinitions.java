package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.questions.validations;
import com.demoqa.automation.taks.FillAllsValidations;
import com.demoqa.automation.taks.FillPage;
import com.demoqa.automation.ui.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class fillTablestepDefinitions {

    //DataInjections dataInjections = new DataInjections();

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));

    }

    @Given("^make practice of the demoqa page$")
    public void makePracticeOfTheDemoqaPage() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(HomePage.url));


    }


    @When("^Fill in all the fields of the record$")
    public void fillInAllTheFieldsOfTheRecord() {
        theActorInTheSpotlight().attemptsTo(FillPage.goTo());

    }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {
        theActorInTheSpotlight().attemptsTo(FillAllsValidations.valida());

    }
}
