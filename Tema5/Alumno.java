public class Alumno {
    
    private int id;
    private String nombre;
    private int grupo;
    private static int numAlumnos = 0;

    static void nuevoAlumno() {
        numAlumnos++;
    }

    public Alumno(String pepito, int a) {
        nombre = pepito;
        id = a;
        nuevoAlumno();
    }

    public Alumno(int b, String juanito, int cfsj ) {
        id = b;
        nombre = juanito;
        grupo = cfsj;  
        nuevoAlumno();
    }

    static void preguntarDuda() {
        System.out.println(nombre);
    }

    static void inprimirInforme(){
        System.out.println(numAlumnos);
    }

    static void imprimirInformeAlumnos(){
    }
    public static void main(String[] args) {
     
    }
}