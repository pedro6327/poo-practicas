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
    private Asignatura materia;

       public String mostrarInfoGrupo() {
        return "El nombre de la asignatura es: " + this.getMateria().getNombre() + " El numero de estudiantes en la materia es: "+this.getNumeroEstudiantes()+
                 "El numero del grupo es: " +this.getNumeroGrupo()+" El profesor que imparte la materia es: "+this.getDocencia().getNombre() ;
        
        
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
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

    public Grupo(int numeroGrupo, int numeroEstudiantes, Profesor docencia, Asignatura materia) {
        this.numeroGrupo = numeroGrupo;
        this.numeroEstudiantes = numeroEstudiantes;
        this.docencia = docencia;
        this.materia = materia;
    }

    
    

}
