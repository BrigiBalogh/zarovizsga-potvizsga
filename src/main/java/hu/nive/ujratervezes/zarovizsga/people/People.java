package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class People {

    private String Male;

    public int getNumberOfMales(String path) {
        int count =0;

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = reader.readLine() )!= null) {
                String[] linePart = line.split(",");
                String gender = linePart[4].toUpperCase();
                if(gender.equals(Male)){
                    count++;
                }
                return count;
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
        return count;
    }
}
