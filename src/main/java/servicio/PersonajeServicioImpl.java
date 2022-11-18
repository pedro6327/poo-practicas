/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;
import modelo.Personaje;

/**
 *
 * @author kevinandres
 */
public class PersonajeServicioImpl implements PersonajeServicio {

    List<Personaje> personajeList;
    List<Pelicula> peliculaList;
    
    
    
    
       
    public PersonajeServicioImpl() {
        this.personajeList = new ArrayList<>();
        this.peliculaList = new ArrayList<>();
        
    }
    
    @Override
    
    public void crear(Personaje personaje, Pelicula pelicula) {
        this.personajeList.add(personaje);
        this.peliculaList.add(pelicula);
     
     
        
        
        
    }
    
    @Override
    public void modificar(int codigo, Personaje personajeModificado) {
        var indice = 0;
        this.personajeList.set(indice, personajeModificado);
    }

    @Override
    public void eliminar(int codigo) {
        var indice = 0;
        for (var personaje : this.personajeList) {
            if (personaje.getCodigo() == codigo) {
                this.personajeList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

    @Override
    public List<Personaje> listar() {
        return this.personajeList;
    }

    

}
