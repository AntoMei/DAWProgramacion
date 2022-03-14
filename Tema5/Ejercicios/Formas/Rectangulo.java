package Ejercicios.Formas;

public class Rectangulo extends Forma {
  
  private double ladoMenor;
  private double ladoMayor;

  public Rectangulo(String color, int x, int y, String nombre, double ladoMayor, double ladoMenor) {
    super(color, x, y, nombre);
    this.ladoMayor = ladoMayor;
    this.ladoMenor = ladoMenor;
  }

  public void imprimir(){
    super.imprimir();
    System.out.println("Lado mayor: " + ladoMayor);
    System.out.println("Lado menor: " + ladoMenor);
  }

  public double getArea(){
    return ladoMayor * ladoMenor;
  }

  public double calcularPerimetro(){
    return 2 * ladoMayor + 2 * ladoMenor;

  }
  
  public void cambiarTamaño(double factor){
    if (factor > 1) {
      System.out.println(ladoMayor*factor);
      System.out.println(ladoMenor*factor);
    }else{
      if (factor < 1 ) {
        System.out.println(ladoMayor%factor);
        System.out.println(ladoMenor%factor);
      }
    }
  }
}