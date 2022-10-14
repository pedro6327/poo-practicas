/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author PEDRO
 */
public class Practica3 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        var auto1 = new Auto();
        var auto2 = new Auto();
        var auto3 = new Auto();
        var auto4 = new Auto();
        var auto5 = new Auto();

        auto1.marca = "Toyota";
        auto1.placa = "GDL0207";
        auto1.nombrePropietario = "Karla";
        auto1.anio = 2016;
        auto1.color = "rojo";
        auto1.precio = 20000;
        auto1.cilindrajeMotor = 1600;

        auto2.marca = "Chevrolet";
        auto2.placa = "ABL0307";
        auto2.nombrePropietario = "Pedro";
        auto2.anio = 2018;
        auto2.color = "azul";
        auto2.precio = 30000;
        auto2.cilindrajeMotor = 1000;

        auto3.marca = "Jettour";
        auto3.placa = "PVL0307";
        auto3.nombrePropietario = "Andres";
        auto3.anio = 2015;
        auto3.color = "rojo";
        auto3.precio = 70000;
        auto3.cilindrajeMotor = 1900;

        auto4.marca = "Audi";
        auto4.placa = "UUB0847";
        auto4.nombrePropietario = "Juan";
        auto4.anio = 2002;
        auto4.color = "rojo";
        auto4.precio = 10000;
        auto4.cilindrajeMotor = 2000;

        auto5.marca = "Lada";
        auto5.placa = "LHY0577";
        auto5.nombrePropietario = "Raul";
        auto5.anio = 2008;
        auto5.color = "rojo";
        auto5.precio = 40000;
        auto5.cilindrajeMotor = 2200;

        System.out.println(auto2.mostrarInfo());
        System.out.println("El pais de de origen es " + auto2.getPaisMarca() + " la provincia es "
                + auto2.getProvincia() + " el auto tiene :" + auto2.getEdad(2022) + " años"
                + " El iva del auto es: " + auto2.getIva() + " El costo de la matricula es " + auto2.getCostomatricula());
        System.out.println("el carro esta asegurado " + auto2.seAsegura(2022));
        System.out.println("la placa es valida:  " + auto2.esPLacaValida());
        System.out.println("la Tasa Solidaria es   " + auto2.getTasaSolidaria(2022));

        System.out.println(auto1.mostrarInfo());
        System.out.println("El pais de de origen es " + auto1.getPaisMarca() + " la provincia es "
                + auto1.getProvincia() + " el auto tiene :" + auto1.getEdad(2022) + " años"
                + "El iva del auto es: " + auto1.getIva());
        System.out.println("la placa es valida:  " + auto1.esPLacaValida());
        System.out.println("la Tasa Solidaria es   " + auto1.getTasaSolidaria(2022));

        System.out.println(auto3.mostrarInfo());
        System.out.println("El pais de de origen es " + auto3.getPaisMarca() + " la provincia es "
                + auto3.getProvincia() + " el auto tiene :" + auto3.getEdad(2022) + " años"
                + "El iva del auto es: " + auto3.getIva());
        System.out.println("la placa es valida:  " + auto3.esPLacaValida());
        System.out.println("la Tasa Solidaria es   " + auto3.getTasaSolidaria(2022));

        System.out.println(auto4.mostrarInfo());
        System.out.println("El pais de de origen es " + auto4.getPaisMarca() + " la provincia es "
                + auto4.getProvincia() + " el auto tiene :" + auto4.getEdad(2022) + " años"
                + "El iva del auto es: " + auto4.getIva());
        System.out.println("la placa es valida:  " + auto4.esPLacaValida());
        System.out.println("la Tasa Solidaria es   " + auto4.getTasaSolidaria(2022));

        System.out.println(auto5.mostrarInfo());
        System.out.println("El pais de de origen es " + auto5.getPaisMarca() + " la provincia es "
                + auto5.getProvincia() + " el auto tiene :" + auto5.getEdad(2022) + " años"
                + "El iva del auto es: " + auto5.getIva());
        System.out.println("la placa es valida:  " + auto5.esPLacaValida());
        System.out.println("la Tasa Solidaria es   " + auto5.getTasaSolidaria(2022));

    }

}
