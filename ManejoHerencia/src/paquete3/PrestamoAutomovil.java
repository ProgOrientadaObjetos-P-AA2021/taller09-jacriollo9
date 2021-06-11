/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author iTC
 */
public class PrestamoAutomovil extends Prestamo {

    private String TipoAutomovil;
    private String MarcaAutomovil;
    private Persona Garante;
    private double ValorAutomovil;
    private double ValorMensualAutomovil;

    public PrestamoAutomovil(Persona beneficiar, int tiempomeses, String ciudad
                            ,String tipoAutomovil, String marcaAutomovil 
                            ,Persona garante, double valorAutomovil) {
        super(beneficiar, tiempomeses, ciudad);
        establecerCiudad(ciudad);
        TipoAutomovil = tipoAutomovil;
        MarcaAutomovil = marcaAutomovil;
        Garante = garante;
        ValorAutomovil = valorAutomovil;
    }

    @Override
    public void establecerCiudad(String n) {
        Ciudad = n.toLowerCase();
    }

    public void establecerTipoAutomovil(String n) {
        TipoAutomovil = n;
    }

    public void establecerMarcaAutomovil(String n) {
        MarcaAutomovil = n;
    }

    public void establecerGarante(Persona n) {
        Garante = n;
    }

    public void establecerValorAutomovil(double n) {
        ValorAutomovil = n;
    }

    public void establecerValorMensualAutomovil() {
        ValorMensualAutomovil = ValorAutomovil / TiempoMeses;;
    }

    public String obtenerTipoAutomovil() {
        return TipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return MarcaAutomovil;
    }

    public Persona obtenerGarante() {
        return Garante;
    }

    public double obtenerValorAutomovil() {
        return ValorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return ValorMensualAutomovil;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n"
                + "%s", super.toString());
        cadena = String.format("%s\nTipo automovil: %s\nMarcaAutomovil: %s\n"
                + "Garante\nNombre: %s\nApellido: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Automovil: %.2f\n"
                + "\n", cadena,
                TipoAutomovil, MarcaAutomovil,
                Garante.obtenerNombre(), 
                Garante.obtenerApellido(),
                ValorAutomovil,
                ValorMensualAutomovil);
        return cadena;
    }

}
