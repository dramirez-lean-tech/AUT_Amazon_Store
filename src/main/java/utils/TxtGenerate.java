package utils;

import net.serenitybdd.screenplay.Performable;

import java.io.FileWriter;
import java.io.IOException;


public class TxtGenerate {

    public String x;

    public String TxtGenerate() throws IOException {
        FileWriter fileTxt = new FileWriter("C:/Users/Diego Ramirez/Documents/Proyectos/AmazonStore/target/filesgenerates/doc.txt");
        fileTxt.write(x);
        return x;
    }

    public static Performable file(String data) {

        return null;
    }

    }




