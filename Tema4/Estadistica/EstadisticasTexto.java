package Estadistica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;

public class EstadisticasTexto {

  public void contador() {
    // vocales a usar en la comparacion
    char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    double contadorPalabras = 0;
    double contadorLetras = 0;
    double contadorLineas = 0;
    double contadorVocales = 0;
    double contadorEspacios = 0;
    double contadorTabulador = 0;

    double porcentajesEspacios = 0;
    double porcentajesVocales = 0;
    double porcentajesConsonantes = 0;
    double porcentajesTabuladores = 0;

    try {
      BufferedReader archivo = new BufferedReader(new FileReader("Tema4/Estadistica/fichero.txt"));

      String linea = archivo.readLine();

      while (linea != null) {
        linea = Normalizer.normalize(linea, Normalizer.Form.NFD)
            .replaceAll("[\\u0300-\\u036f]", "")
            .toLowerCase();

        // Troceamos línea cortando donde haya espacios en blanco
        String[] palabras = linea.split(" ");
        // Acumulamos las palabras(trozos) obtenidos
        contadorPalabras += palabras.length;
        // Contar lineas del texto.
        contadorLineas++;

        char[] charsLinia = linea.toCharArray();

        for (int i = 0; i < charsLinia.length; i++) {
          if (Character.isLetter(charsLinia[i])) {
            contadorLetras++;
          }
        }

        for (int i = 0; i < charsLinia.length; i++) {
          if (charsLinia[i] == ' ') {
            contadorEspacios++;
          } else if (charsLinia[i] == '\t') {
            contadorTabulador++;
          }
        }

        for (int i = 0; i < charsLinia.length; i++) {
          for (int j = 0; j < vowels.length; j++) {
            if (charsLinia[i] == vowels[j]) {
              // comparacion
              contadorVocales++;
            }
          }
        }
        // Leemos siguiente línea
        linea = archivo.readLine();
      }

      archivo.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    porcentajesVocales = (contadorVocales * 100.00) / contadorLetras;
    porcentajesEspacios = (contadorEspacios * 100.00) / contadorLetras;
    porcentajesTabuladores = (contadorTabulador * 100.00) / contadorLetras;
    porcentajesConsonantes = (((100.00 - porcentajesVocales) - porcentajesEspacios) - porcentajesTabuladores);

    System.out.println("\nPalabras contadas en el texto: " + contadorPalabras);
    System.out.println("Letras contadas en el texto: " + contadorLetras);
    System.out.println("Lineas contadas en el texto: " + contadorLineas);
    System.out.println("% de vocales: " + porcentajesVocales + "%");
    System.out.println("% de consonantes: " + porcentajesConsonantes + "%");
    System.out.println("% de espacios: " + porcentajesEspacios + "%");
    System.out.println("% de tabuladores: " + porcentajesTabuladores + "%");
  }
}