package ControlFicheros;

public class Cliente extends Persona {
   
    private int id;
    private String email;

    public Cliente(int id, String nif, String nombre, String apellidos, String email){
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: \t" + id + "\n" + "Nif: \t" + nif + "\n" + "Nombre: \t" + nombre + "\n"
            + "Apellidos: \t" + apellidos + "\n" + "Email: \t" + email;
    }   
}