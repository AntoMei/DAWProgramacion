package Ejercicios.CutreCloud;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String email;
    private String password;

    //Añadimos lista para controlor todos los usuario que se crean.
    public static ArrayList<Usuario> list = new ArrayList<>();
    //Añadimos un generador para que luego al constructor se incremente, cada vez que creemos un usuario el contador se incrementará a uno.
    //Quitamos el id porque va a ser interno.
    private static int idGenerator = 0;


    public Usuario(String email, String password) {
        this.password = password;
        
        //El constructor crea dos tipo de objetos, bueno y malo, uno que será el email válido que añadiremos a la lista y el otro que no será el bueno
        if (this.isAvailable(email)) {
            this.email = email; 
            this.id = idGenerator++;
            //Añado este objeto (this que sería el objeto actual list, que será el que creemos) a la lista. 
            list.add(this);
        }else{
            this.id = -1;
            this.email = "Correo duplicado: " + email;
        } 
    }

    //Método para comprobar el email.
    private boolean isAvailable(String email){
        boolean resultado = true;

        for (Usuario usuario : list) {
            if (email.equals(usuario.getEmail())) {
                resultado = false;
                break;
            }         
        }
        return resultado;
    }
    
    public int getId() {
        return id;
    }

    //Quitamos el setter del Id, para que no se cambie.

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    //Método eliminar un usuario por email.

    public void eliminarUnUsuario(String email){
        for (Usuario item : list) {
            if (item.getEmail().equals(email)) {
                list.remove(item);
                break;
            }
        }
    }

    //Método eliminar sus medias. Crear un método en media, que busque los email de los usuarios.

    //Método eliminar usuarios de un dominio.

    public void eliminarUsuario(){
        
    }
} 