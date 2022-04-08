package Primos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeePrimos {
    public static void main(String[] args) throws IOException {

       String file = "Tema6/Primos/primos.dat";

       try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
        }
       } catch (Exception e) {
          System.out.println("Error");
          e.printStackTrace();
       }
    }
}