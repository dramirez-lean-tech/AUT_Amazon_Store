package task;


import Interaction.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import net.serenitybdd.screenplay.questions.Text;
import ui.AmazonElectronicsPage;
import ui.AmazonHomePage;
import utils.TxtGenerate;

import static ui.ItemDetails.ABOUT_THIS_ITEM_TEXT;
import static utils.Constants.TEXT;


public class ShippingTv implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AmazonHomePage.MENU));
        actor.attemptsTo(Click.on(AmazonHomePage.TV_APPPLIANCES_ELECTRONICS_OPTION));
        actor.attemptsTo(Click.on(AmazonHomePage.TELEVISIONS_OPTION));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(Scroll.to(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.SORT_BY_LIST));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.HIGH_TO_LOW_OPTION));
        actor.attemptsTo(Wait.aSecond(1));
     //   actor.attemptsTo(Click.on(AmazonElectronicsPage.TV_SECOND_OPTION));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.TV_SECOND_OPTION2));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(SwitchToNewWindow.switchToNewTab());
        actor.attemptsTo(Wait.aSecond(3));
        actor.attemptsTo(Scroll.to(ABOUT_THIS_ITEM_TEXT));

        String txt = Text.of(ABOUT_THIS_ITEM_TEXT).viewedBy(actor).resolve();
      //  String txt1 = Text.of(ABOUT_THIS_ITEM_TEXT).viewedBy(actor).asString();
        System.out.println("-----------------------------------------------------");
        System.out.println(txt);
        System.out.println("-----------------------------------------------------");

        actor.remember(TEXT,txt);

        actor.attemptsTo(TxtGenerate.file(txt));


     }
    public static ShippingTv user(){
        return new ShippingTv();
    }

}
