package Ejercicios.CutreCloud;

public class UsuarioTest {
    public static void main(String[] args) {
        
      Usuario u1 = new Usuario("Julio@cutrecloud.com", "hacker");
      Usuario u2 = new Usuario("Pepe@cutrecloud.com", "123456");
      Usuario u3 = new Usuario("Pepe@cutrecloud.com", "adc");  

      Media m1 = new Media(678, "song.mp3", "blalikwenf", MediaType.AUDIO, u1);
      Media m2 = new Media(432, "imagen.jpg", "imagen", MediaType.IMAGE, u2);
      Media m3 = new Media(487, "video.mp4", "video", MediaType.VIDEO, u3);

      System.out.println(u1.getEmail());
    }  
}