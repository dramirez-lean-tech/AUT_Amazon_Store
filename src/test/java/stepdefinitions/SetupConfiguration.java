package stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;





public class SetupConfiguration {

    public static Actor UserWeb;
    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;


    @Before
    public void prepareStage() {

        UserWeb = Actor.named("The user");

     }



}
