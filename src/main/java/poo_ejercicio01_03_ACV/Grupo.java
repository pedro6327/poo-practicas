/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Grupo {

    private int numeroGrupo;
    private int numeroEstudiantes;
    private Profesor docencia;

     public String mostrarInfoGrupo() {
        return "El número de estudiantes es: " + this.numeroEstudiantes;

    }
    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }
    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
 

    public void setDocencia(Profesor docencia) {
        this.docencia = docencia;
    }

    public Profesor getDocencia() {
        return docencia;
    }

    public Grupo(int numeroGrupo, int numeroEstudiantes, Profesor docencia) {
        this.numeroGrupo = numeroGrupo;
        this.numeroEstudiantes = numeroEstudiantes;
        this.docencia = docencia;
    }
    

}
