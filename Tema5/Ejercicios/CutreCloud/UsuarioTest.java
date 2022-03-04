package Ejercicios.CutreCloud;

public class UsuarioTest {
    public static void main(String[] args) {
        
      Usuario u1 = new Usuario("Julio@cutrecloud.com", "hacker");
      Usuario u2 = new Usuario("Pepe@cutrecloud.com", "123456");
      Usuario u3 = new Usuario("Pepe@cutrecloud.com", "adc");  

      Media m1 = new Media("archivo", "sonido.mp3", MediaType.AUDIO, u1);
      Media m2 = new Media("fichero", "imagen.jpg", MediaType.IMAGE, u2);

      System.out.println(u1.generateXML());
      System.out.println(u2.generateXML());
      System.out.println(m1.generateXML());
      System.out.println(m2.generateXML());

    }  
}