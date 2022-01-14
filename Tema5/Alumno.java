class Alumno {

    //Zona de atributos de clase

    private static int totalAlumnos = 0;

    //Zona de atributos
    
    private int id;
    private String nombre;
    private String grupo;
    private static int numAlumnos = 0;

    //Zona de métodos

    public Alumno(int identificador, String nombreAlumno) {
      id = identificador;
      nombre = nombreAlumno;
      grupo = "No asignado"; 

      totalAlumnos++;
    }

    public Alumno(int identificador, String nombreAlumno, String grupoAlumno) {
        id = identificador;
        nombre = nombreAlumno;
        grupo = grupoAlumno;

        totalAlumnos++;
    }

    public void preguntarDuda(){
        System.out.println(nombre + " levanta la mano");
    }

    public static void imprimirInforme(){
        System.out.println("Total de alumnos: " +totalAlumnos);
    }

    public static void imprimirInformeAlumnos(Alumno [] alumnos){
        System.out.println("Nombre\t\t\tGrupo");
        for(Alumno alumno : alumnos){
            System.out.println(alumno.nombre + "\t\t\t" + alumno.grupo);
            //\t expresa un tabulador, imprime un tabulador
            ///n expresa un salto de línea, imprime un salto de línea
        }
    }
}