import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String domiciloio;

    public static ArrayList<String> personas = new ArrayList<>();

    public Persona() {
        this.nombre = "María";
        this.apellidos = "López";
        this.edad = 25;
        this.dni = "12345678A";
        this.domiciloio = "Calle Castellón";
        personas.add(this);
    }

    public Persona(String nombre, String apellidos, int edad, String dni, String domiciloio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domiciloio = domiciloio;
        personas.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomiciloio() {
        return domiciloio;
    }

    public void setDomiciloio(String domiciloio) {
        this.domiciloio = domiciloio;
    }

    public static ArrayList<String> getPersonas() {
        return personas;
    }

    public static void setPersonas(ArrayList<String> personas) {
        Persona.personas = personas;
    }  

    //Método de clase = static.
    public static void eliminarPersona(String nombre){
        for (String persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personas.remove(persona);
                break;
                
            }
            
        }
    }

    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", dni=" + dni + ", domiciloio=" + domiciloio + ", edad=" + edad
                + ", nombre=" + nombre + "]";
    }
}