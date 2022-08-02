package EjemploJSON;

import org.json.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            //Creamos el inputstream desde un fichero
            InputStream is = new FileInputStream("datos.json");

            //Creamos un token que leera desde nuestro is
            JSONTokener tokener = new JSONTokener(is);

            //Lo pasamos a una instancia de la clase object
            JSONObject obj = new JSONObject(tokener);

            //Obtenemos las credenciales
            JSONObject credenciales = obj.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario: " + usuario + " clave: " + clave);

            //Dentro de las credenciales vienen los videos
            JSONArray videos = credenciales.getJSONArray("videos");
            for (Object video : videos) {
                System.out.println(video.toString());
            }
        } catch (Exception e) {
            System.out.println("No puede leer el fichero" + e.getMessage());
        }
    }
}
