package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileReader {

    public void writeCart(StringBuilder sb){
        try{
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy-----hh-mm-ss");
            String formattedDate = current.format(dateTimeFormatter);

            String fileName = "src/main/resources/" + formattedDate + ".txt";

            System.out.println(fileName);

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(String.format(sb.toString()));

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Error writing to file.");
        }
    }





}
