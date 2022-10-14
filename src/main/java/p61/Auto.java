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
    int cilindrajeMotor;

    public String mostrarInfo() {
        var retorno = "El auto tiene placa: " + this.placa + " es marca: " + this.marca + " el propietario es:  "
                + this.nombrePropietario + "  El año del auto es: " + this.anio;

        return retorno;
    }

    public String getProvincia() {

        var retorno = "";
        var primeraLetra = "";
        primeraLetra = this.placa.substring(0, 1);
        switch (primeraLetra) {
            case "A":
                retorno = "Azuay";
                break;
            case "P":
                retorno = "Pichincha";
                break;
            case "G":
                retorno = "Guayas";
                break;
            case "U":
                retorno = "Cañar";
                break;
            case "L":
                retorno = "Loja";
                break;
            default:
                retorno = "Provincia NO definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EEUU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                if (this.marca.equals("Jettour")) {
                    retorno = "Chino";
                } else {
                    if (this.marca.equals("Audi")) {
                        retorno = "Aleman";
                    } else {
                        retorno = "ND";
                    }
                }

            }

        }
        return retorno;
    }

    public int getNumerocontinente() {
        // 1 africa 2 america 3 asia 4 europa 5 oceania
        var marcaPais = this.getPaisMarca();
        var retorno = 0;
        switch (marcaPais) {
            case "EEUU":
                retorno = 2;
                break;
            case "Japon":
                retorno = 3;
                break;
            case "Jettour":
                retorno = 3;
                break;
            case "Aleman":
                retorno = 4;
                break;
            default:
                retorno = 0;

        }

        return retorno;
    }

    public double getIva() {
        var retorno = 0.0d;
        retorno = this.precio * 0.12;
        return retorno;
    }

    public double getCostomatricula() {
        /*edad de 0-5 años 10% precio si es menos de 10000 si se asegura 
         edad de 5-15 años 10% precio si es menos de 10000 a 20000 si se asegura 
         edad de 15-nayor años 10% precio si es menos de 20000 a 30000 si se asegura 
         */
        var retorno = 0.0d;
        if (this.getEdad(2022) > 0 && this.getEdad(2022) <= 5) {
            retorno = this.precio * 0.1;
        } else {
            if (this.getEdad(2022) > 5 && this.getEdad(2022) <= 10) {
                retorno = this.precio * 0.08;
            } else {
                if (this.getEdad(2022) > 10 && this.getEdad(2022) <= 15) {
                    retorno = this.precio * 0.06;
                } else {
                    if (this.getEdad(2022) > 15) {
                        retorno = this.precio * 0.05;
                    }
                }
            }
        }
        return retorno;
    }

    public boolean esTaxi() {
        var retorno = true;
        return retorno;
    }

    public boolean seAsegura(int anioActual) {
        var retorno = false;
        var edad = this.getEdad(anioActual);
        if (edad <= 5 && this.getCostomatricula() < 10000) {
            retorno = true;
        } else {
            if (edad > 5 && edad <= 15 && this.getCostomatricula() > 10000 && this.getCostomatricula() < 20000) {
                retorno = true;
            } else {
                if (edad > 15) {
                    retorno = false;
                }
            }

        }
        return retorno;
    }

    public boolean esClasico(int anioActual, int anioClasico ) {
        var retorno = false;

        return retorno;
    }
 public double getTasaSolidaria(int anioActual) {
     /*
     edad>20 tasa=0
     edad 0-5 y cilindraje <1500 tasa =15%costo
      edad 0-5 y cilindraje >1500 <2000 tasa =20%costo
     edad 0-5 y cilindraje >2000 tasa =25%costo
     edad 5-15 y cilindraje <1500 tasa =10%costo
      edad 5-15 y cilindraje >1500 <2000 tasa =15%costo
     edad 5-15 y cilindraje >2000 tasa =18%costo
     edad 15-20 tasa =5%costo
      edad >20 tasa =5%costo
    
     */
        var retorno = 0.0d;
        var edad = this.getEdad(anioActual);
        if (edad <= 5 && this.cilindrajeMotor<1500) {
            retorno = this.precio*0.15;
        } else{
            if (edad <= 5 && this.cilindrajeMotor>1500 && this.cilindrajeMotor<2000) {
            retorno = this.precio*0.2;
        } else{ if (edad <= 5 && this.cilindrajeMotor>2000 ) {
            retorno = this.precio*0.25;
        } else{ if (edad > 5 && edad <= 15 && this.cilindrajeMotor<1500 ) {
            retorno = this.precio*0.1;
   
        } else{ if (edad > 5 && edad <= 15 && this.cilindrajeMotor>1500 && this.cilindrajeMotor<2000) {
            retorno = this.precio*0.15;
        } else{ if (edad > 5 && edad <= 15 && this.cilindrajeMotor>2000) {
            retorno = this.precio*0.18;  
        } else{if (edad > 15 && edad <= 20 ) {
            retorno = this.precio*0.05;     
        }else{if (edad > 20 ) {
            retorno = this.precio*0.03;  
        }
        
        }
        }
        }
        
        }
            
            }
        
        }
        
    }
        return retorno;
 }
 
 
    public int getEdad(int anioActual) {
        var retorno = 0;
        retorno = anioActual - this.anio;
        return retorno;
    }
    //depreciasion no puede exceder el precio 
    // 10 por años

    public double getDepreciasion(int anioActual) {
        var retorno = 0.0d;
        var edad = this.getEdad(anioActual);
        retorno = edad * 0.1 * this.precio;
        return retorno;
    }

    public boolean esPLacaValida() {
        var retorno = false;
        var longitud=this.placa.length();
        if (longitud==7) {
            var char1=this.placa.charAt(0);
            var char2=this.placa.charAt(1);
            var char3=this.placa.charAt(2);
            var char4=this.placa.charAt(3);
            var char5=this.placa.charAt(4);
            var char6=this.placa.charAt(5);
            var char7=this.placa.charAt(6);
            
            if (Character.isLetter(char1) && Character.isLetter(char2)&& Character.isLetter(char3)
                &&  Character.isDigit(char4)&&  Character.isDigit(char5)&&  Character.isDigit(char6) ) {
                retorno= true;
            }
            
           
        }
        
        
        
        return retorno;
    }
    
    

}

