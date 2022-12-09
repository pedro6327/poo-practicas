/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;
import vista_0303.VentanaDepartamento;
/**
 *
 * @author PEDRO
 */
public class Departamento {
    
    private String nombreDepartamento;
    private int codigo;
     private Empresa empresa;

    public Departamento(String nombreDepartamento, int codigo) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigo = codigo;
    }

    public Departamento(String nombre, int codigo, String duenio, LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDepartamento=" + nombreDepartamento 
                + ", codigo=" + codigo + '}';
    }
    


    
}
