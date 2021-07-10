package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.questions.PresenceElements;
import com.demoqa.automation.questions.validations;
import com.demoqa.automation.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllsValidations implements Task {

    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(PresenceElements.visible(HomePage.VALIDATION)));
               // seeThat(validations.in(HomePage.VALIDATION),equalToIgnoringCase(dataInjections.getValidacion())));

    }

    public static FillAllsValidations valida(){

        return instrumented(FillAllsValidations.class);
    }
}
