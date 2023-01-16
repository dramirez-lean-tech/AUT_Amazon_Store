package Interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static utils.FitTime.succefull;


public class Wait implements Interaction {
    private int seconds;

    public Wait(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Awaitility.await().forever().pollInterval(seconds, TimeUnit.SECONDS).until(succefull());

    }

    public static Wait aSecond(int seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }

}
