package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.ui.HomePage;
import com.demoqa.automation.utils.Javascrip;
import com.demoqa.automation.utils.UploadPicture;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FillPage implements Task {


    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataInjections.getUsername()).into(HomePage.FIRTS_NAME),
                Enter.theValue(dataInjections.getLastname()).into(HomePage.LAST_NAME),
                Enter.theValue(dataInjections.getEmail()).into(HomePage.EMAIL),
                JavaScriptClick.on(HomePage.GENDER_CHECK),
                Enter.theValue(dataInjections.getNumber()).into(HomePage.MOBILE_NUMBER),
                Enter.keyValues(UploadPicture.filePath(dataInjections.getFileImput())).into(HomePage.PICTURE),
                JavaScriptClick.on(HomePage.CHECK_HOBBIES),
                Enter.theValue(dataInjections.getAddres()).into(HomePage.CURRENT_ADDRESS),
                JavaScriptClick.on(HomePage.SUBMIT),
                JavaScriptClick.on(HomePage.CLOSE)
        );


    }

    public static FillPage goTo(){

        return instrumented(FillPage.class);
    }
}
