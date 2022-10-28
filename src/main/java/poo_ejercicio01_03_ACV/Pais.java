/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Pais {

    private String nombrePais;
    private String liga;
    
     public String mostrarInfoPais() {
        return " que pertenece a la liga " + this.liga;
               
    }  
  

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public String getLiga() {
        return liga;
    }

    public Pais(String nombrePais, String liga) {
        this.nombrePais = nombrePais;
        this.liga = liga;
    }
    

}
