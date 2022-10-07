/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_practica1_acv;

import java.util.ArrayList;

/**
 *
 * @author kevinandres
 */
public class Poo_practica1_ACV {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var persona1 = new Persona ();
        var persona2 = new Persona ();
        var persona3 = new Persona ();
        
        persona1.nombre = "Juan";
        persona1.cedula = "0106043589";
        persona1.edad = 19;
        persona1.fechaNacimiento = "12/05/99";
        
        
        persona2.nombre = "Patricio";
        persona2.cedula = "0100091878";
        persona2.edad = 20;
        persona2.fechaNacimiento = "19/04/98";
        
        persona3.nombre = "Ana";
        persona3.cedula = "0306048778";
        persona3.edad = 21;
        persona3.fechaNacimiento = "01/02/95";
        
        
        var auto1 = new Auto ();
        var auto2 = new Auto ();
        var auto3 = new Auto ();
        
        auto1.anio = 2012;
        auto1.marca = "Toyota";
        auto1.placa = "ADL-207";
        auto1.color = "celeste";
        
        auto2.anio = 2010;
        auto2.marca = "Chevrolet";
        auto2.placa = "AXT5-302";
        auto2.color = "negro";
        
        auto3.anio =  2012;
        auto3.marca = "Jeep";
        auto3.placa = "PKD-117";
        auto3.color = "rojo";
        
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        
        perro1.nombre = "Hades";
        perro1.edad = 2;
        perro1.raza = "Pitbull";
        perro1.vacunado = "si"; 
        
        perro2.nombre = "Jack";
        perro2.edad = 3;
        perro2.raza = "Chiguagua";
        perro2.vacunado = "no"; 
        
        perro3.nombre = "Bruno";
        perro3.edad = 8;
        perro3.raza = "Pastor Aleman";
        perro3.vacunado = "si"; 
        
        var moto1 = new Motos();
        var moto2 = new Motos();
        var moto3 = new Motos();
        
        moto1.cilindraje = 150;
        moto1.marca = "Kawasaky";
        moto1.placa = "AL-287";
        moto1.color = "Plomo";
        
        moto2.cilindraje = 440;
        moto2.marca = "Axxo";
        moto2.placa = "PT-687";
        moto2.color = "Rojo";
        
        moto3.cilindraje = 350;
        moto3.marca = "Suzuki";
        moto3.placa = "BG-562";
        moto3.color = "Azul";
        
        var celular1 = new Celular();
        var celular2 = new Celular();
        var celular3 = new Celular();
        
        celular1.marca = "Samsung";
        celular1.modelo = "A50";
        celular1.almacenamiento = 32;
        celular1.resolucionCamara = "10Mpx";
        
        celular2.marca = "Realme";
        celular2.modelo = "7 pro";
        celular2.almacenamiento = 128;
        celular2.resolucionCamara = "64Mpx";
        
        celular3.marca = "Xiaomi";
        celular3.modelo = "Redmi note 12";
        celular3.almacenamiento = 256;
        celular3.resolucionCamara = "50Mpx";
        
        var compu1 = new Computadora();
        var compu2 = new Computadora();
        var compu3 = new Computadora();
        
        compu1.marca = "HP";
        compu1.numeroSerie = "0102055";
        compu1.almacenamiento = 250;
        compu1.procesador = "core i7";
        
        compu2.marca = "Apple";
        compu2.numeroSerie = "01562655";
        compu2.almacenamiento = 500;
        compu2.procesador = "M1";
        
        compu3.marca = "Lenovo";
        compu3.numeroSerie = "018916555";
        compu3.almacenamiento = 1000;
        compu3.procesador = "core i9";
        
        
        //----------------------------------------------------------------------------------------------------------
        
          System.out.println("La persona se llama " + persona1.nombre+" su cedula es "+ 
                persona1.cedula+" su edad es "+persona1.edad +" su fecha de nacimiento es "+ 
          persona1.fechaNacimiento);
          
           System.out.println("La persona se llama " + persona2.nombre+" su cedula es "+ 
                persona2.cedula+" su edad es "+persona2.edad +" su fecha de nacimiento es "+ 
          persona2.fechaNacimiento);
           
            System.out.println("La persona se llama " + persona3.nombre+" su cedula es "+ 
                persona3.cedula+" su edad es "+persona3.edad +" su fecha de nacimiento es "+ 
          persona3.fechaNacimiento);
            
         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");   
          
        System.out.println("El perro se llama " + perro1.nombre+" tiene "+perro1.edad+ " años su raza es "+ 
                perro1.raza+" "+perro1.vacunado+  " esta vacunado" );
        
          System.out.println("El perro se llama " + perro2.nombre+" tiene "+perro2.edad+ "años su raza es "+ 
                perro2.raza+" "+perro2.vacunado+ " esta vacunado" );
          
            System.out.println("Mi perro se llama " + perro3.nombre+" tiene "+perro3.edad+ "años su raza es"+ 
                perro3.raza+" "+perro3.vacunado+ " esta vacunado" );
          
         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");   
             
            
           
          System.out.println("La auto es un " + auto1.marca +" es de color "+auto1.color+ " su placa es "+ 
                auto1.placa + " y es del año "+auto1.anio);
          
           System.out.println("La auto es un " + auto2.marca +" es de color "+auto2.color+ " su placa es "+ 
                auto2.placa + " y es del año "+auto2.anio);
           
            System.out.println("La auto es un " + auto3.marca +" es de color "+auto3.color+ " su placa es"+ 
                auto3.placa + " y es del año"+auto3.anio);
            
         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");     
         
         
         System.out.println("La moto es una " + moto1.marca +" es de color "+moto1.color+ " su placa es "+ 
                moto1.placa + " y tiene un cilindraje de "+ moto1.cilindraje);
         
         System.out.println("La moto es una " + moto2.marca +" es de color "+moto2.color+ " su placa es "+ 
                moto2.placa + " y tiene un cilindraje de "+ moto2.cilindraje);
         
         
         System.out.println("La moto es una " + moto3.marca +" es de color "+moto3.color+ " su placa es "+ 
                moto3.placa + " y tiene un cilindraje de "+ moto3.cilindraje); 
         
         
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");     
            
            System.out.println("El celular  es " + celular1.marca +" el modelo  "+celular1.modelo+ " su almacenamiento es de  "+ 
                celular1.almacenamiento + " y la resolucion de su camara es de "+ celular1.resolucionCamara);
          
            System.out.println("El celular  es " + celular2.marca +" el modelo  "+celular2.modelo+ " su almacenamiento es de  "+ 
                celular2.almacenamiento + " y la resolucion de su camara es de "+ celular2.resolucionCamara);
            
            System.out.println("El celular  es " + celular3.marca +" el modelo  "+celular3.modelo+ " su almacenamiento es de  "+ 
                celular3.almacenamiento + " y la resolucion de su camara es de "+ celular3.resolucionCamara);
          
          
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");     
            
            System.out.println("La  computadora  es " + compu1.marca +" su numero de serie es  "+ compu1.numeroSerie+ " su almacenamiento es de  "+ 
                compu1.almacenamiento + " su procesador es  "+ compu1.procesador);
          
           System.out.println("La  computadora  es " + compu2.marca +" su numero de serie es  "+ compu2.numeroSerie+ " su almacenamiento es de  "+ 
                compu2.almacenamiento + " su procesador es  "+ compu2.procesador);
           
           System.out.println("La  computadora  es " + compu3.marca +" su numero de serie es  "+ compu3.numeroSerie+ " su almacenamiento es de  "+ 
                compu3.almacenamiento + " su procesador es  "+ compu3.procesador);
          
             
            
            
            
            
            
            
            
          
    }
}
