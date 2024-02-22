package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase contacto
 */
public class Persona implements PersonaInterface {
    /**
     * Atributos nombre y telefonos, estos ultimos se alamcenaran en una lista tipo string
      */
    private String name;
    private List<String> phones;

    /**
     * Constructor con todos los parametros
     * @param name
     * @param phone
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Getter de nombre
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Getter de telefonos
     * @return
     */
    @Override
    public List<String> getPhones() {
        return this.phones;
    }
}