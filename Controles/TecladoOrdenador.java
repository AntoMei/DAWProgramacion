public class TecladoOrdenador {
  public static void main(String[] args) {
    Teclado t1 = new Teclado();
    Teclado t2 = new Teclado("rojo", 100, "cable", "ES", "sobremesa");
    System.out.println(t2);
    
    Ordenador o1 = new Ordenador();
    Ordenador o2 = new Ordenador("sobremesa", "azul", t1);
    System.out.println(o2);
  }
}