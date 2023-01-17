package task;


import Interaction.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import net.serenitybdd.screenplay.questions.Text;
import ui.AmazonElectronicsPage;
import ui.AmazonHomePage;


import javax.swing.*;
import java.io.FileWriter;
import java.io.File;

import static ui.ItemDetails.ABOUT_THIS_ITEM_TEXT;



public class ShippingTv implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AmazonHomePage.MENU));
        actor.attemptsTo(Wait.aSecond(1));
        actor.attemptsTo(Click.on(AmazonHomePage.TV_APPPLIANCES_ELECTRONICS_OPTION));
        actor.attemptsTo(Wait.aSecond(1));
        actor.attemptsTo(Click.on(AmazonHomePage.TELEVISIONS_OPTION));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(Scroll.to(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.SORT_BY_LIST));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.HIGH_TO_LOW_OPTION));
        actor.attemptsTo(Wait.aSecond(1));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.TV_SECOND_OPTION));
        actor.attemptsTo(Wait.aSecond(2));
        actor.attemptsTo(SwitchToNewWindow.switchToNewTab());
        actor.attemptsTo(Wait.aSecond(3));
        actor.attemptsTo(Scroll.to(ABOUT_THIS_ITEM_TEXT));

        String txt = Text.of(ABOUT_THIS_ITEM_TEXT).viewedBy(actor).resolve();
        System.out.println("-----------------------------------------------------");
        System.out.println(txt);
        System.out.println("-----------------------------------------------------");

        try {

            File f = new File("C:/Users/Diego Ramirez/Documents/Proyectos/AmazonStore/src/test/resources/filesgenerates/doc.txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            FileWriter file = new FileWriter("C:/Users/Diego Ramirez/Documents/Proyectos/AmazonStore/src/test/resources/filesgenerates/doc.txt");
            file.write(txt);
            file.close();

        }  catch (Exception e){
                JOptionPane.showMessageDialog(null,"error is this one part"+e);
        }


    }
    public static ShippingTv user(){
        return new ShippingTv();
    }

}
