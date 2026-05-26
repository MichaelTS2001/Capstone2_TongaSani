package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

    public static void writeCart(Pizza pizza){
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/cart", true);

            fileWriter.write(String.format("%d", pizza.getSize()));

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Error writing to file.");
        }
    }





}
