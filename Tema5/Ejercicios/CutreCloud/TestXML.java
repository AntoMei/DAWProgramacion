package Ejercicios.CutreCloud;

package com.mkyong.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TestXML {

    private static final String filename="Tema5/Ejercicios/CutreCloud/Usuarios";
   public static void main(String[] args) {
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();

        try {
            doc.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            
        } catch (Exception e) {
            //TODO: handle exception
        }


       
   }
}
