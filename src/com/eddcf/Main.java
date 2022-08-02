package com.eddcf;

public class Main {
    public static void main(String [] args) {

        CocheCRUDImpl cochenuevo = new CocheCRUDImpl();

        cochenuevo.save();
        cochenuevo.search();
        cochenuevo.delete();


    }
}
