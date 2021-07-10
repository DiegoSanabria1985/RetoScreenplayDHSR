package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static String url = "https://demoqa.com/automation-practice-form";

    public static final Target FIRTS_NAME = Target.the("enter firts name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("enter last name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("enter email").located(By.id("userEmail"));
    public static final Target GENDER_CHECK = Target.the("check gender").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[2]/input"));
    public static final Target MOBILE_NUMBER = Target.the("Input mobile number").located(By.id("userNumber"));
    public static final Target CHECK_HOBBIES = Target.the("input hobbies").located(By.id("hobbies-checkbox-1"));
    public static final Target PICTURE = Target.the("select picture").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS = Target.the("input address").located(By.id("currentAddress"));
    public static final Target SUBMIT = Target.the("select send").located(By.id("submit"));
    public static final Target VALIDATION = Target.the("located to validation").located(By.id("stateCity-label"));
    public static final Target CLOSE = Target.the("click in close").located(By.id("closeLargeModal"));



}
