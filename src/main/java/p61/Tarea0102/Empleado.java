/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.Tarea0102;

/**
 *
 * @author PEDRO
 */
public class Empleado {
    
String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioingreso;

    public double calcularIngresos() {
        var sueldo = 0.0d;
        if (this.horasTrabajadas <= 160) {
            sueldo = this.horasTrabajadas * this.costoHora;
        } else {
            if (this.horasTrabajadas > 160) {
                sueldo = 160 * this.costoHora;
            }
        }
        return sueldo;
    }

    public double calcularBonoHorasExtra() {
        var bono = 0.0d;

        if (this.horasTrabajadas > 160) {
            var horasExtra = this.horasTrabajadas - 160;
            var costohora = this.costoHora * 2;
            bono = horasExtra * costohora;
        }

        return bono;
    }

    public double calcularImpuesto(int limite1, int limite2, int limite3) {
        // var retorno = 0.0d;
        var impuesto = this.calcularBonoHorasExtra() + this.calcularIngresos();

        if (impuesto <= limite1) {
            impuesto = 0.0d;

        } else {
            if (impuesto > limite1 && impuesto <= limite2) {
                impuesto = impuesto * 0.05;
            } else {
                if (impuesto > limite2 && impuesto <= limite3) {
                    impuesto = impuesto * 0.12;
                } else {
                    if (impuesto > limite3) {
                        impuesto = impuesto * 0.25;
                    }
                }
            }
        }
        return impuesto;
    }

    public double calcularTotal(int anioActual) {
        var retorno = 0.0d;
        var anios = anioActual - this.anioingreso;
        var antiguedad = anios * 0.02;
        retorno = this.calcularIngresos() + this.calcularBonoHorasExtra();
        antiguedad = retorno * antiguedad;
        retorno = retorno + antiguedad - this.calcularImpuesto(1000, 2500, 4000);
        System.out.println("El bono del 2% anual  por antiguedad es: " + antiguedad + "$");

        return retorno;
    }

}


