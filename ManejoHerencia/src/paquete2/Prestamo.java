/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int TiempoMeses;
    protected String Ciudad;
    
    public Prestamo(Persona beneficiar, int tiempomeses, String ciudad){
        beneficiario = beneficiar;
        TiempoMeses = tiempomeses;
        Ciudad = ciudad;
    }
    
    public void establecerBeneficiario(Persona n){
        beneficiario = n;
    }
    
    public void establecerTiempoMeses(int n){
        TiempoMeses = n;
    }
    
    public void establecerCiudad(String n){
        Ciudad = n;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerTiempoMeses(){
        return TiempoMeses;
    }
    
    public String obtenerCiudad(){
        return Ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tBeneficiario\n\tNombre: %s\n"
                + "\tApellido: %s\nTiempo de prestamo en meses: %d\nCiudad: %s\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                TiempoMeses, Ciudad); 
        return cadena;
    }
}