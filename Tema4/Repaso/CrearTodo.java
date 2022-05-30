package Repaso;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CrearTodo {

    // Crear objetos apartir de arrays.

    private static void crearClientes() throws IOException, FileNotFoundException {
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("Tema4/Repaso/clientes.xml"));
        
        int[] id = {1,2,3,4};
        String[] nif = {"5235436","2354334","54354366","346643634"};
        String[] nombre = {"vsbreb","regrhtr","grgerabr","reabhatehb"};
        String[] apellidos = {"greaaebrl","erabtebeg","rahaehgeat","regreer"};
        String[] email = {"regerbr", "greagea", "regearg","reagger"};

        Cliente c;
        PersistenciaCliente pc = new PersistenciaCliente();

        for (int i = 0; i < id.length; i++) {
            c = new Cliente(id[i], nif[i], nombre[i], apellidos[i], email[i]);
            pc.clientes.add(c);
            archivo.writeObject(c);
        }
        archivo.close();
    }

    // Leer los objetos creados.

    private static void leerObjetos() throws IOException, ClassNotFoundException{

        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("Tema4/Repaso/clientes.obj"));

        Cliente c;

        try{
            while(true){
                c = (Cliente) archivo.readObject();

                System.out.println("id: " + c.getId() + ", nif: " + c.getNif() + ", nombre: " + c.getNombre() + ", apellidos: " + c.getApellidos() + ", email: " + c.getEmail());
            }
        } catch (EOFException eof){
            archivo.close();
        }
    }

    // Crear xml a partir de objetos.

    private static void crearClientesXML() throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("Tema4/Repaso/clientes.obj"));

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente c;
        try{
            while(true){
                c = (Cliente) archivo.readObject();
                Element emp = doc.createElement("cliente");
                emp.setAttribute("id", Integer.toString(c.getId()));


                Element nif = doc.createElement("nif");
                nif.appendChild(doc.createTextNode(c.getNif()));
                emp.appendChild(nif);

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(c.getNombre()));
                emp.appendChild(nombre);

                Element apellidos = doc.createElement("apellidos");
                apellidos.appendChild(doc.createTextNode(c.getApellidos()));
                emp.appendChild(apellidos);

                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(c.getEmail()));
                emp.appendChild(email);

                root.appendChild(emp);
            }
        } catch (EOFException eof) {
            archivo.close();
        }

        Transformer transformar = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult resultado = new StreamResult(new FileOutputStream("Tema4/Repaso/clientes.xml"));

        transformar.transform(source, resultado);
        
    }

    // Leer xml de objetos.

    private static void leerClientesXML() throws ParserConfigurationException, SAXException, IOException{

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream("Tema4/Repaso/clientes.xml"));
        Element raiz = (Element) doc.getChildNodes().item(0);
        NodeList clientes = raiz.getElementsByTagName("cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            Element el = (Element) clientes.item(i);
            System.out.println(el.getNodeName() + " " + (i + 1));
            System.out.println("\tid: " + el.getAttribute("id"));
            System.out.println("\tnif: " + el.getElementsByTagName("nif").item(0).getTextContent());
            System.out.println("\tnombre: " + el.getElementsByTagName("nombre").item(0).getTextContent());
            System.out.println("\tapellidos: " + el.getElementsByTagName("apellidos").item(0).getTextContent());
            System.out.println("\temail: " + el.getElementsByTagName("email").item(0).getTextContent());

        }
        System.out.println(raiz.getTextContent());
    }

    // Crear Clientes en JSON
    private static void crearClientesJSON() throws IOException{
    
        PrintWriter archivo = new PrintWriter("Tema4/Repaso/clientes.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        archivo.write("[");

        for (int i = 0; i < PersistenciaCliente.clientes.size(); i++) {
            if(i != PersistenciaCliente.clientes.size()-1){
                String imprimir = gson.toJson(PersistenciaCliente.clientes.get(i));
                archivo.write(imprimir + ",");
            }else{
                String imprimir = gson.toJson(PersistenciaCliente.clientes.get(i));
                archivo.write(imprimir);
            }
        }
        archivo.write("]");
        archivo.close();

    }
    
    private static void leerJSON() throws IOException{
        BufferedReader archivo = new BufferedReader(new FileReader("Tema4/Repaso/clientes.json"));
        Gson gson = new Gson();

        Type tipoListaClientes = new TypeToken<List<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(archivo, tipoListaClientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException{
        crearClientes();
        leerObjetos();
        crearClientesXML();
        leerClientesXML();
        crearClientesJSON();
        leerJSON();
    }
}