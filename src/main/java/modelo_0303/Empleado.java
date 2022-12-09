/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;
import vista_0303.VentanaEmpleado;

/**
 *
 * @author kevinandres
 */
public class Empleado {
    
    
    private String nombreEmpleado;
    private int codigo;
    private String puesto;
    private LocalDate fechaNacimiento;
    private Empleado empleado;

    public Empleado(String nombreEmpleado, int codigo, String puesto, LocalDate fechaNacimiento, Empleado empleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigo = codigo;
        this.puesto = puesto;
        this.fechaNacimiento = fechaNacimiento;
        this.empleado = empleado;
    }

    public Empleado(int codigo, String nombre, String puesto, LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", codigo de la =" 
                + codigo + ", puesto=" + puesto + ", fechaNacimiento=" 
                + fechaNacimiento + ", empleado=" + empleado + '}';
    }
   
   
    

 


    
    
    
    
    
    
    
    
    
}
