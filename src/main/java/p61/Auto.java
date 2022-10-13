/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author PEDRO
 */
public class Auto {
    
 String placa;
    String marca;
    String nombrePropietario;
    int anio;
    String color;
    double precio;
    
            
    public String mostrarInfo(){
        var retorno="El auto tiene placa: "+this.placa+" es marca: "+this.marca+" el propietario es:  "
                +this.nombrePropietario+"  El año del auto es: "+this.anio ;
        
        return retorno;          
    }
    public String getProvincia(){
        

        var retorno="";
        var primeraLetra="";
        primeraLetra= this.placa.substring(0,1);
        switch (primeraLetra) {
            case "A":
                retorno="Azuay";
                break;
                case "P":
                retorno="Pichincha";
                break;
                case "G":
                retorno="Guayas";
                break;
                case "U":
                retorno="Cañar";
                break;
                case "L":
                retorno="Loja";
                break;
                default:
                  retorno="Provincia NO definida";   
        }
        return retorno;          
    }
    
    public String getPaisMarca(){
        var retorno="";
        if(this.marca.equals("Chevrolet")){
        retorno="EEUU";
        }
        else {
            if (this.marca.equals("Toyota")) {
             retorno="Japon";   
            }
            else {
                if (this.marca.equals("Jettour")) {
             retorno="Chino";   
            }
                else {
                      if (this.marca.equals("Audi")) {
             retorno="Aleman";   
            }
                      
                      else {
                            retorno="ND"; 
                      }
                }
                
            
                     }
          
      
                }
        return retorno;          
    }
    public int getNumerocontinente(){
        // 1 africa 2 america 3 asia 4 europa 5 oceania
       var marcaPais =this.getPaisMarca();
        var retorno=0;
        switch (marcaPais) {
            case "EEUU":
               retorno=2;
                break;
                case "Japon":
               retorno=3 ;
                break;
                case "Jettour":
               retorno=3 ;
                break;
                case "Aleman":
               retorno=4 ;
                break;
            default:
                retorno=0 ;
                
        }
        
        
        
        return retorno;          
    }
    
     public double getIva(){
        var retorno=0.0d;
        retorno = this.precio*0.12;
        return retorno;          
    }
   
     public double getCostomatricula(){
         /*edad de 0-5 años 10% precio si es menos de 10000 si se asegura 
         edad de 5-15 años 10% precio si es menos de 10000 a 20000 si se asegura 
         edad de 15-nayor años 10% precio si es menos de 20000 a 30000 si se asegura 
         */
        var retorno=0.0d;
         if (this.getEdad(2022) > 0 && this.getEdad(2022)<=5) {
             retorno=this.precio*0.1;
         }
         else{
             if (this.getEdad(2022) > 5 && this.getEdad(2022)<=10) {
             retorno=this.precio*0.08;
         }
             else{
                 if (this.getEdad(2022) > 10 && this.getEdad(2022)<=15) {
             retorno=this.precio*0.06;
         }
                 else {
                     if (this.getEdad(2022) > 15 ) {
             retorno=this.precio*0.05;
         }
                 }
             }
         }
          return retorno;       
    }   
     
     public boolean esTaxi(){
        var retorno=true;
        return retorno;          
    }      
     
     
     
       public boolean seAsegura(int anioActual){
        var retorno=false;
          var edad = this.getEdad(anioActual);
           if (edad<=5 && this.getCostomatricula()<10000) {
               retorno=true;
           }
           else{
               if (edad>5 && edad<=15  && this.getCostomatricula()>10000 && this.getCostomatricula()<20000) {
               retorno=true;
           }
               else{
                    if ( edad>15 ) {
               retorno=false;
           }
               }
              
           }
        return retorno;          
    }  
       
        
      public boolean esClasico(){
        var retorno=false;
      
        return retorno;          
    }   
      
      public int getEdad(int anioActual){
        var retorno=0;
        retorno= anioActual- this.anio;
        return retorno;          
    }  
      //depreciasion no puede exceder el precio 
      // 10 por años
       public double getDepreciasion(int anioActual){
        var retorno=0.0d;
        var edad = this.getEdad(anioActual);
        retorno = edad*0.1*this.precio;
        return retorno;          
    }
      
      public boolean esPLacaValida(){
        var retorno=true;
        return retorno;          
    }    
      
}

