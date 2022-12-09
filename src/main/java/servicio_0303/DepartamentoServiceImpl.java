/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio_0303;

import java.util.ArrayList;
import java.util.List;
import modelo_0303.Departamento;

/**
 *
 * @author kevinandres
 */
public class DepartamentoServiceImpl implements DepartamentoService {
    
    private static List<Departamento> departamentoList;
    

    public DepartamentoServiceImpl() {
        this.departamentoList= new ArrayList<>();
    }

    @Override
    public void crear(Departamento departamento) {
        
        this.departamentoList.add(departamento);
 
        }
    
    

    @Override
    public void modificar(int codigo, Departamento departamentoModificado) {
        
         var indice=0;
        
        this.departamentoList.set(indice, departamentoModificado);
        
       }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var departamento:this.departamentoList){
            if(departamento.getCodigo()==codigo){
                this.departamentoList.remove(indice);
                
                break;
            }else{
                indice++;
            }
        }
        
        
        }

    
     @Override
    public Departamento buscarPorCodigo(int codigo) {
        Departamento retorno=null;
        for(var departamento:this.departamentoList){
            if(codigo==departamento.getCodigo()){
                retorno=departamento;
                break;
            }
        }
        return retorno;
    }
    
    @Override
    
    public List<Departamento> listar() {
        
        return this.departamentoList;
        
        }

    
    
}