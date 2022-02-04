public class TecladoyOrdenador {
  public static void main(String[] args) {
    Teclado t1 = new Teclado();
    Teclado t2 = new Teclado("rojo", 100, "cable", "ES", "sobremesa");
    
    Ordenador o1 = new Ordenador();
    Ordenador o2 = new Ordenador("sobremesa", "azul", t1);
    
  }
}
