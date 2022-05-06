package ControlFicheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearClienteXML {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformException, TransformerFactoryConfigurationError, TransformerException {
        
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("Controles/ControlFicheros/Clientes.obj"));

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("cliente");
        doc.appendChild(root);

        Cliente c1;
        try {
            while (true) {
                c1 = (Cliente) f.readObject();
                Element cli = doc.createElement("cliente");
                Element id = doc.createElement("id");
                Element nif = doc.createElement("nif");
                Element nombre = doc.createElement("nombre");
                Element apellidos = doc.createElement("apellidos");
                Element email = doc.createElement("email");

                id.appendChild(doc.createTextNode(c1.getId()));
                nif.appendChild(doc.createTextNode(c1.getNif()));
                nombre.appendChild(doc.createTextNode(c1.getNombre()));
                apellidos.appendChild(doc.createTextNode(c1.getApellidos()));
                email.appendChild(doc.createTextNode(c1.getEmail()));

                cli.appendChild(id);
                cli.appendChild(nif);
                cli.appendChild(nombre);
                cli.appendChild(apellidos);
                cli.appendChild(email);


                root.appendChild(cli);
            }

        } catch (EOFException eof) {
            f.close();
        }
        Transformer trans = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("Controles/ControlFicheros/Clientes.xml"));
        
        trans.transform(source, result);
    }
}