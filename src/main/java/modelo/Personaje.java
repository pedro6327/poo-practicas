/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinandres
 */
public class Personaje {

    private String nombrePersonaje;
    private String nombreActor;
    private int codigo;
    private String papel;
    private LocalDate fechaNacimientoA;
     private List<Pelicula> peliculaList;

    public Personaje(String nombrePersonaje, String nombreActor, int codigo, String papel, LocalDate fechaNacimientoA) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombreActor = nombreActor;
        this.codigo = codigo;
        this.papel = papel;
        this.fechaNacimientoA = fechaNacimientoA;
        this.peliculaList= new ArrayList<>();
    }
    
     public void nuevaPelicula(Pelicula p){
        this.peliculaList.add(p);
    }
    
    
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public LocalDate getFechaNacimientoA() {
        return fechaNacimientoA;
    }

    public void setFechaNacimientoA(LocalDate fechaNacimientoA) {
        this.fechaNacimientoA = fechaNacimientoA;
    }

    public List<Pelicula> getPeliculaList() {
        return peliculaList;
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }



    private int calcularEdad() {
        var yearActual = LocalDate.now().getYear();
        return yearActual - this.fechaNacimientoA.getYear();
    }

   
    @Override
    public String toString() {
        return "NombrePersonaje= " + nombrePersonaje + ", nombreActor= "
                + nombreActor + ", codigo=" + codigo + ", papel=" + papel
                + ", fechaNacimientoA=" + fechaNacimientoA + ", aparece en la pelicula=" + peliculaList
                +  "\n";
    }

}
