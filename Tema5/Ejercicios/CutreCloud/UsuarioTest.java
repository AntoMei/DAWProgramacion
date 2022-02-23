package Ejercicios.CutreCloud;

public class UsuarioTest {
    public static void main(String[] args) {
        
      Usuario u1 = new Usuario("Julio@cutrecloud.com", "hacker");
      Usuario u2 = new Usuario("Pepe@cutrecloud.com", "123456");
      Usuario u3 = new Usuario("Pepe@cutrecloud.com", "adc");  
      
      System.out.println(u1.getEmail());
    }  
}