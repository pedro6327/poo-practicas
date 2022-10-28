/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Equipo {

    private String nombreEquipo;
    Pais nombrep;
    
   public String mostrarInfoEquipo() {
        return "su equipo es el : " + this.nombreEquipo;
               
    }  
  

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombrep(Pais nombrep) {
        this.nombrep = nombrep;
    }

    public Pais getNombrep() {
        return nombrep;
    }

    public Equipo(String nombreEquipo, Pais nombrep) {
        this.nombreEquipo = nombreEquipo;
        this.nombrep = nombrep;
    }

    private String mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
