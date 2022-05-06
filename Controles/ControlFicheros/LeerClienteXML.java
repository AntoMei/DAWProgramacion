package ControlFicheros;

import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerClienteXML {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream("Controles/ControlFicheros/Clientes.xml"));

        Element raiz = (Element) doc.getChildNodes().item(0);
        NodeList clientes = raiz.getElementsByTagName("cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            Element el = (Element) clientes.item(i);
            System.out.println(el.getNodeName() + " " + (i + 1));
            System.out.println("Id: " + el.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
            System.out.println("Nif: " + el.getElementsByTagName("nif").item(0).getFirstChild().getNodeValue());
            System.out.println("Nombre: " + el.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue());
            System.out.println("Apellidos: " + el.getElementsByTagName("apellidos").item(0).getFirstChild().getNodeValue());
            System.out.println("Email: " + el.getElementsByTagName("email").item(0).getFirstChild().getNodeValue());
            System.out.println();
        }
        System.out.println(raiz.getTextContent());
    }
}