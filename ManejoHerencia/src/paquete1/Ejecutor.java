/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author: iTC
 *          
 *          
 */         
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int opcion, prestamoMeses;
        String nombre, apellido, tipoAutomovil, marcaAutomovil, ciudadPrestamo;
        double valorAutomovil, valorCarrera;
        while (bandera) {
            System.out.println("\t-------BIENVENIDO------");
            System.out.println("=====================");
            System.out.println("Ingrese 1 si requiere Prestamo de tipo Automovil\n"
                    + "Ingrese 2 si requiere Prestamo de tipo Educativo");
            System.out.println("=====================");
            System.out.println("");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1 || opcion == 2) {
                System.out.println("");
                System.out.println("\tDATOS DE EL BENEFICIARIO");
                System.out.println("--------------------------------------");
                System.out.println("Ingrese el nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido");
                apellido = entrada.nextLine();
                System.out.println("");
                System.out.println("\tPRESTAMO");
                System.out.println("----------------------------------");
                System.out.println("Ingrese el tiempo de el prestamo en meses");
                prestamoMeses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad donde se realizo el prestamo");
                ciudadPrestamo = entrada.nextLine();
                Persona persona1 = new Persona(nombre, apellido);
                System.out.println("--------------------------------------");
                if (opcion == 1) {
                    System.out.println("\t------PRESTAMO AUTOMOVIL------");
                    System.out.println("Ingrese el tipo de automovil");
                    tipoAutomovil = entrada.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    marcaAutomovil = entrada.nextLine();
                    System.out.println("");
                    System.out.println("\tDATOS DE EL GERENTE");
                    System.out.println("--------------------------------------");
                    System.out.println("Ingrese el nombre");
                    String nombre2 = entrada.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apellido2 = entrada.nextLine();
                    Persona persona2 = new Persona(nombre2, apellido2);
                    System.out.println("Ingrese el valor del automovil");
                    valorAutomovil = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoAutomovil prestamoautomovil = new PrestamoAutomovil(persona1, prestamoMeses,
                            ciudadPrestamo, tipoAutomovil, marcaAutomovil, persona2, valorAutomovil);
                    prestamoautomovil.establecerValorMensualAutomovil();
                    System.out.println(prestamoautomovil);
                } else {
                    System.out.println("\t------PRESTAMO ESTUDIANTIL------");
                    System.out.println("Ingrese el nivel de estudio");
                    String nivel = entrada.nextLine();
                    System.out.println("Ingrese el nombre del centro educativo");
                    String centro = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera");
                    valorCarrera = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoEducativo pe = new PrestamoEducativo(persona1,
                            prestamoMeses, ciudadPrestamo, nivel, centro, valorCarrera);
                    pe.establecerValorMensualCarrera();
                    System.out.println(pe);
                }
            } else {
                System.out.println("===================");
                System.out.println("La opcion ingresada es incorrecta");
                System.out.println("===================");
            }
            System.out.println("Digite SI para ingresar datos\n"
                    + "Digite NO para salir del ciclo");
            String ap = entrada.nextLine();
            if (ap.toLowerCase().equals("SI")) {
                bandera = true;
            } else if (ap.toLowerCase().equals("NO")) {
                bandera = false;
            }
        }
    }
}
