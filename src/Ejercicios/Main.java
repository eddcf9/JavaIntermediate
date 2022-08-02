package Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Ejercicio1
        String[] arreglo = {"Hola", "Adios", "Ejemplo"};
        for(String dato : arreglo) {
            System.out.println(dato);
        }

        //Ejercicio2
        int[][] arr = {{1,2,3}, {4,5,6}};
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.println("Valor de Columna: " + i + " Fila: " + j + " = " + arr[i][j]);
            }
            System.out.println("");
        }

        //Ejercicio3
        Vector<String> arr2 = new Vector<>(5);
        arr2.add("Esto");
        arr2.add("es");
        arr2.add("un");
        arr2.add("vector");
        arr2.add("en");
        arr2.add("Java");
        arr2.remove(2);
        arr2.remove(3);
        arr2.trimToSize();
        for (String dato: arr2) {
            System.out.println(dato);
        }
        System.out.println("");

        //Ejercicio4
        //El problema es que con la capacidad por defecto se duplica el tamaño y por ende es mas
        //la carga para la memoria.

        //Ejercicio5
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Lista");
        lista.add("Array");
        lista.add("String");
        LinkedList<String> list = new LinkedList<>(lista);
        for(String dato : lista) {
            System.out.println(dato);
        }
        for(String dato : list) {
            System.out.println(dato);
        }
        System.out.println("");

        //Ejercicio6
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            list2.add(i);
        }

        for(int i=0; i<list2.size(); i++) {
            int numrep = list2.get(i)%2;
            if(numrep == 0){
                System.out.println("Este es un numero par: " + list2.get(i));
                list2.remove(i);
            }
        }

        System.out.println(list2);

        //Ejercicio7
        System.out.println("");
        Main m = new Main();
        m.divideZero();

        //Ejercicio8
        System.out.println("");
        try {
            InputStream filein = new FileInputStream("/etc/passwd");
            PrintStream fileio = new PrintStream("destino.txt");
            m.fichero(filein, fileio);
        } catch (IOException e) {
            System.out.println("Algo salio mal, " + e.getMessage());
        }


    }

    public void divideZero() {
        try {
            int operacion = 5 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Esto no puede hacerse, " + e.getMessage());
        } finally {
            System.out.println("Demo de codigo");
        }
    }

    public void fichero(InputStream filein, PrintStream fileout) {
        try {
            byte[] datos = filein.readAllBytes();
            filein.close();
            fileout.write(datos);
            fileout.close();
        } catch (IOException e) {
            System.out.println("Algo salio mal, " + e.getMessage());
        }
    }


}
