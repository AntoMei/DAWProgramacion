package Primos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tema6/Primos/primos.dat"));

            for (int i = 1; i < 500; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();;

        } catch (IOException e) {
            System.out.println("Error");
        } 
    }

    public static boolean esPrimo(int numero){
        
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}