/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Departamento {

    private String nombreDepartamento;
    private int codigoDepartamento;
    Empresa empresa;
    
    
  public String mostrarInfoDepartamento() {
        return "pertenece a la empresa: " + this.empresa.getNombre()
              + " el codigo de su departamento es " + this.getCodigoDepartamento();

    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Departamento(String nombreDepartamento, int codigoDepartamento, Empresa empresa) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigoDepartamento = codigoDepartamento;
        this.empresa = empresa;
    }

   

    
    

}
