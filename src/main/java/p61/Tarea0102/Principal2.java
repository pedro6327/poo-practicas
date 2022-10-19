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
public class Principal2 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        System.out.println("ingrese la dimension del arreglo");
        var dimension = entrada.nextInt();
        var arreglo = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese los datos del vector en la poscicion " + i);
            var numero = entrada.nextInt();

            arreglo[i] = numero;
        }
        System.out.println("el arreglo ingresado es: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println(arreglo[i]);
        }

    }
}
