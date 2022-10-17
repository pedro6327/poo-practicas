/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.Tarea0102;

import java.util.Scanner;

/**
 *
 * @author PEDRO
 */
public class Principal {
    
 public static void main(String[] args) {

        var empleado1 = new Empleado();
        var empleado2 = new Empleado();
        var empleado3 = new Empleado();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado1: ");
        empleado1.nombre = entrada.next();

        System.out.println("Ingrese el año de ingreso del empleado1: ");
        empleado1.anioingreso = entrada.nextInt();

        System.out.println("Ingrese las horas trabajadas del empleado1: ");
        empleado1.horasTrabajadas = entrada.nextInt();

        System.out.println("Ingrese el costo hora: ");
        empleado1.costoHora = entrada.nextDouble();

        System.out.println("El ingreso basico del empleado  es: " + empleado1.calcularIngresos() + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado1.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado1.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado1.calcularTotal(2022) + "$");

        empleado2.nombre = "Sebastian";
        empleado2.horasTrabajadas = 172;
        empleado2.costoHora = 12;
        empleado2.anioingreso = 2007;

        empleado3.nombre = "Emily";
        empleado3.horasTrabajadas = 212;
        empleado3.costoHora = 15;
        empleado3.anioingreso = 2016;
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("EL nombre del empleado2 es: " + empleado2.nombre + " Las horas trabajadas por el empleado2 son: " + empleado2.horasTrabajadas);
        System.out.println("EL año de ingreso del empleado2 es: " + empleado2.anioingreso + " El costo hora es : " + empleado2.costoHora);
        System.out.println("El ingreso basico del empleado  es: " + empleado2.calcularIngresos() + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado2.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado2.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado2.calcularTotal(2022) + "$");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("EL nombre del empleado3 es: " + empleado3.nombre + " Las horas trabajadas por el empleado3 son: " + empleado3.horasTrabajadas);
        System.out.println("EL año de ingreso del empleado3 es: " + empleado3.anioingreso + " El costo hora es : " + empleado3.costoHora);
        System.out.println("El ingreso basico del empleado  es: " + empleado3.calcularIngresos() + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado3.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado3.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado3.calcularTotal(2022) + "$");

    }

}