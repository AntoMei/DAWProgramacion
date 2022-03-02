package Ejercicios.CutreCloud;

public class ParserXMLTest {

    public static void printXML(ParserXML imprimible){
        System.out.println(imprimible.generateXML());
    }

    public static void main(String[] args) {

        Usuario u1 = new Usuario("kk.@gmail.com", "blablablabla");
        Media m1 = new Media("audio.mp4", "dhuifdhewohfoehw", MediaType.AUDIO, u1);

        printXML(u1);
        printXML(m1);     
    }  
}