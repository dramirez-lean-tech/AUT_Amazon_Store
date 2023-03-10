package utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.time.temporal.TemporalUnit;
import java.util.concurrent.Callable;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FitTime {
    static Boolean allMessagesProcessed = true;
    static TemporalUnit unit;

    private FitTime() {
    }

    public static Callable<Boolean> succefull() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return allMessagesProcessed;
            }
        };
    }

    public static void restaurarTiempoPorDefecto (Actor actor) {
        BrowseTheWeb.as(actor).resetImplicitTimeout();
    }

    public static void fijarSegundos (Actor actor, int segundos) {
        BrowseTheWeb.as(actor).setImplicitTimeout(segundos, SECONDS);
    }
}