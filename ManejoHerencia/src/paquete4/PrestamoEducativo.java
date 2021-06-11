/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String NivelEstudio;
    private String CentroEducativo;
    private double ValorCarrera;
    private double ValorMensualCarrera;

    public PrestamoEducativo(Persona beneficiar, int tiempomeses, String ciudad
                            ,String nivelEstudio, String centroEducativo 
                            ,double valorCarrera) {
        super(beneficiar, tiempomeses, ciudad);
        establecerCiudad(ciudad);
        NivelEstudio = nivelEstudio;
        CentroEducativo = centroEducativo;
        ValorCarrera = valorCarrera;
    }

    @Override
    public void establecerCiudad(String n) {
        Ciudad = n.toUpperCase();
    }

    public void establecerNivelEstudio(String n) {
        NivelEstudio = n;
    }

    public void establecerCentroEducatico(String n) {
        CentroEducativo = n;
    }

    public void establecerValorCarrera(double n) {
        ValorCarrera = n;
    }

    public void establecerValorMensualCarrera() {
        ValorMensualCarrera = (ValorCarrera / TiempoMeses) 
                - (0.1 * (ValorCarrera / TiempoMeses));
    }

    public String obtenerNivelEstudio() {
        return NivelEstudio;
    }

    public String obtenerCentroEducativo() {
        return CentroEducativo;
    }

    public double obtenerValorCarrera() {
        return ValorCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return ValorMensualCarrera;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n"
                + "%s", super.toString());
        cadena = String.format("%s\nNivel de estudio: %s\n"
                + "Centro Educatico: %s\nValor Carrera: %.2f\n"
                + "Valor Mensual Carrera: %.2f\n"
                + "\n", cadena,
                NivelEstudio, CentroEducativo, ValorCarrera,
                ValorMensualCarrera);
        return cadena;
    }

}