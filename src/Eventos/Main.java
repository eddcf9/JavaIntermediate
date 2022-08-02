package Eventos;

import java.util.ArrayList;

interface Mensajero {
    void hanSaludado();
}

class Emisor {
    private ArrayList<Mensajero> receptores = new ArrayList<>();

    public void meteReceptor(Mensajero receptor) {
        receptores.add(receptor);
    }

    public void saluda() {
        System.out.println("Hola!!");

        for (Mensajero al : receptores) {
            al.hanSaludado();
        }
    }
}

class Receptor implements Mensajero {

    @Override
    public void hanSaludado() {
        System.out.println(Math.random());
    }
}

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        Receptor receptor = new Receptor();
        Receptor receptor1 = new Receptor();
        Receptor receptor2 = new Receptor();

        emisor.meteReceptor(receptor);
        emisor.meteReceptor(receptor1);
        emisor.meteReceptor(receptor2);

        emisor.saluda();
    }
}
