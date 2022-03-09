package Ejercicios.CutreCloud;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Usuario implements ParserXML{

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
    public static boolean eliminarUnUsuario(String email){

        boolean resultado = false;
        
        for (Usuario person : list) {
            if (person.email.equals(email)) {
                list.remove(person);
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    //Método eliminar usuarios de un dominio.
    public static void eliminarUsuario(String domain){

        Iterator<Usuario> it = list.iterator();

        while (it.hasNext()) {
            Usuario user = it.next();

            if (user.email.endsWith(domain)) {
                list.remove(user);
                
            }  
        }
    }

    //Método generateXML.
    public String generateXML(){
        String resultado = "";

        resultado += "<usuario>" + "\n";
        resultado += "<id>" + +id+ "</id>" + "\n";
        resultado += "<email>" +email+ "</email>" + "\n";
        resultado += "<password>" + password+ "</password>" + "\n";
        resultado += "</usuario>";

        return resultado;
    }
        public void writeXML(){

        try{
            String ruta = "Tema5/Ejercicios/CutreCloud/Usuarios/Usuario " + id + ".xml";

            File file = new File(ruta);

            if (!file.exists()) {
            file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(generateXML());
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}