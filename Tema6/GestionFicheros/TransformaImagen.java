package GestionFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransformaImagen {

    File f = null;

    public TransformaImagen(File fEnt) {

        // Control de existencia del fichero y control de la extensión .bmp (sacar

        // mensajes de error)
        if (fEnt.exists()== false) {
            System.out.println("El fichero no existe");
            
        }

    }

    public void transformaNegativo() throws IOException {

        // Transformar a negativo y guardar como *_n.bmp

        FileInputStream fImg_in = new FileInputStream(f);
        FileOutputStream fImg_ou = new FileOutputStream(f + "_n.bmp");

        byte[] buffer = new byte[54];
        int n = fImg_in.read(buffer);
        

 
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp

        

    }

    

    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

    private String getNombreSinExtension() {

        //Devuelve el nombre del archivo f sin extensión

        

    }

}