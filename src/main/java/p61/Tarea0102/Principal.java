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

        empleado1.nombre = "Andres";
        empleado1.horasTrabajadas = 210;
        empleado1.costoHora = 16;
        empleado1.anioingreso = 2004;

        empleado2.nombre = "Sebastian";
        empleado2.horasTrabajadas = 172;
        empleado2.costoHora = 12;
        empleado2.anioingreso = 2007;

        empleado3.nombre = "Emily";
        empleado3.horasTrabajadas = 212;
        empleado3.costoHora = 15;
        empleado3.anioingreso = 2016;
        System.out.println("EL nombre del empleado1 es: " + empleado1.nombre + " Las horas trabajadas por el empleado1 son: " + empleado1.horasTrabajadas);
        System.out.println("EL año de ingreso del empleado1 es: " + empleado1.anioingreso + " El costo hora es : " + empleado1.costoHora);
        System.out.println("El ingreso basico del empleado  es: " + empleado1.calcularIngresos(2022) + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado1.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado1.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado1.calcularTotal(2022,1000,2500,4000) + "$");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("EL nombre del empleado2 es: " + empleado2.nombre + " Las horas trabajadas por el empleado2 son: " + empleado2.horasTrabajadas);
        System.out.println("EL año de ingreso del empleado2 es: " + empleado2.anioingreso + " El costo hora es : " + empleado2.costoHora);
        System.out.println("El ingreso basico del empleado  es: " + empleado2.calcularIngresos(2022) + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado2.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado2.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado2.calcularTotal(2022,1000,2500,4000) + "$");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("EL nombre del empleado3 es: " + empleado3.nombre + " Las horas trabajadas por el empleado3 son: " + empleado3.horasTrabajadas);
        System.out.println("EL año de ingreso del empleado3 es: " + empleado3.anioingreso + " El costo hora es : " + empleado3.costoHora);
        System.out.println("El ingreso basico del empleado  es: " + empleado3.calcularIngresos(2022) + "$");
        System.out.println("El ingreso por horas extra del empleado es: " + empleado3.calcularBonoHorasExtra() + "$");
        System.out.println("El impuesto del empleado es: " + empleado3.calcularImpuesto(1000, 2500, 4000) + "$");
        System.out.println("El ingreso total del empleado es: " + empleado3.calcularTotal(2022,1000,2500,4000) + "$");

    }

}
