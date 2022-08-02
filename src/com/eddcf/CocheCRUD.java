package com.eddcf;

import java.util.List;

/**
 * Se declaran los metodos sin implementar
 *
 * Actua como un contrato
 */

public interface CocheCRUD {

    //Guardar
    void save();

    //Recuperar
    List<Coche> search();

    //Eliminar
    void delete();
}
