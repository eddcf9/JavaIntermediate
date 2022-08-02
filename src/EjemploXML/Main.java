package EjemploXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("datos.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            try {
                //Analizamos el documento
                Document document = documentBuilder.parse(file);

                //Obtenemos usuario y clave
                String usuario = document.getElementsByTagName("usuario").item(0).getTextContent();
                String clave = document.getElementsByTagName("clave").item(0).getTextContent();

                //Mostramos usuario y clave
                System.out.println("Usuario: " + usuario + "Clave: " + clave);

                //Mostrar el atributo proovedor
                NamedNodeMap atributos = document.getElementsByTagName("videos").item(0).getAttributes();

                for (int i=0; i<atributos.getLength(); i++) {
                    String atributoNombre = atributos.item(i).getNodeName();
                    String atributoValor = atributos.item(i).getNodeValue();

                    System.out.println("Atributo " + atributoNombre + " contiene " + atributoValor);
                }

                //Mostramos los videos asociados
                NodeList videos = document.getElementsByTagName("videos");

                for (int i=0; i< videos.getLength(); i++) {
                    Node video = videos.item(i);
                    System.out.println(video.getTextContent());
                }

            } catch (Exception e) {
                System.out.println("Error procesando documentos: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error en en el proceso: " + e.getMessage());
        }
    }
}
