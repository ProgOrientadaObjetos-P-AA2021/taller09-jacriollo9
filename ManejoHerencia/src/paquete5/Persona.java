/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Usuario iTC
 */
public class Persona {

    protected String Nombre;
    protected String Apellido;

    public Persona(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }

    public void establecerNombre(String n) {
        Nombre = n;
    }

    public void establecerApellido(String n) {
        Apellido = n;
    }

    public String obtenerNombre() {
        return Nombre;
    }

    public String obtenerApellido() {
        return Apellido;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nApellido: %s\n", 
                Nombre, Apellido);
        return cadena;
    }

}