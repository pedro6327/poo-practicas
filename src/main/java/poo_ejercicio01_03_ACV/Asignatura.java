/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Asignatura {

    private String nombre;
    private int horasSemanales;
 

    public String mostrarInfoAsignatura() {
        return "Las horas semanales de la asignatura es : " + this.getHorasSemanales();
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }


    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        
    }
    

}
