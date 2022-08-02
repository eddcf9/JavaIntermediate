package com.eddcf;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Se esta guardando un coche");
    }

    @Override
    public List<Coche> search() {
        System.out.println("Se esta buscando un coche");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Se elimino un coche");
    }
}
