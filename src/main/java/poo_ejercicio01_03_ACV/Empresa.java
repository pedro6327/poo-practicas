/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Empresa {

    private String nombre;
    private String duenioEmpresa;
    private String anioCreacion;
    
     public String mostrarInfoEmpresa() {
        return " la empresa se creo en el anio " + this.anioCreacion
              + " el duenio es " + this.duenioEmpresa;

    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDuenioEmpresa(String duenioEmpresa) {
        this.duenioEmpresa = duenioEmpresa;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getDuenioEmpresa() {
        return duenioEmpresa;
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }



    
    public Empresa(String nombre, String duenioEmpresa, String anioCreacion) {
        this.nombre = nombre;
        this.duenioEmpresa = duenioEmpresa;
        this.anioCreacion = anioCreacion;
    }
    

}
