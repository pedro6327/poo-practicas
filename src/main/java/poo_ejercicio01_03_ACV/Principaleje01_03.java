/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Principaleje01_03 {

    public static void main(String[] args) {

        // var player1 = new Jugador("Medio Campista",team1,"Kevin DebRauyne",1991);
        /*
        player1.setNombre("Kevin DeBruyne");
        player1.setFechaNacimiento(1991);
        player1.setPosicion("Medio Campista");
       
         empleado1.setNombre("Andres");
        empleado1.setFechaNacimiento(1999);
        empleado1.setAnioIngreso("2018");
         */
        var pais1 = new Pais("Inglaterra","Premier");
        var team1 = new Equipo("Manchester City",pais1);
        var player1 = new Jugador("Medio Campista", team1, "Kevin DeBruayne", 1991);
        player1.setTeam(team1);   
        
        var pais2 = new Pais("Inglaterra","Premier");
        var team2 = new Equipo("Liverpool",pais2);
        var player2 = new Jugador("Delantero", team2, "Mohamed Salah", 1992);
        player2.setTeam(team2);
             
        //----------------------------------------------
        var empresa = new Empresa("General Electric", "Jorge Sanchez", "1966");
        var puesto = new Departamento("Gerencia", 9012, empresa);
        var empleado1 = new Empleado("2018", puesto, "Andres", 1999);
        puesto.setEmpresa(empresa);
        
        var empresa1 = new Empresa("Almacenes Eljuri", "Juan Eljuri", "1986");
        var puesto1 = new Departamento("Talento Humano", 3412, empresa1);
        var empleado2 = new Empleado("2015", puesto1, "Karla", 1999);
        puesto1.setEmpresa(empresa1);

        //----------------------------------------------------------------------------------------//
        var profesor1 = new Profesor("Licenciado", "Jorge Andrade", 1989);
        var clase1 = new Asignatura("Algebra Lineal", 6);
        var grupo = new Grupo(3, 45, profesor1,clase1);
        
        var profesor2 = new Profesor("Ingeniero", "Luis Calle", 1986);
        var clase2 = new Asignatura("Calculo Diferencial", 14);
        var grupo2 = new Grupo(4, 50, profesor2,clase2);
       

         
        
        System.out.println(player1.mostrarInfoJugador());
        System.out.print(team1.mostrarInfoEquipo());
        System.out.println(pais1.mostrarInfoPais());
        System.out.println();
        System.out.println(player2.mostrarInfoJugador());
        System.out.print(team2.mostrarInfoEquipo());
        System.out.println(pais2.mostrarInfoPais());
                System.out.println();
        /*------------------------------------------------*/
        System.out.println(empleado1.mostrarInfoEmpleado());
        System.out.print(puesto.mostrarInfoDepartamento());
        System.out.println(empresa.mostrarInfoEmpresa());
       System.out.println();
        System.out.println(empleado2.mostrarInfoEmpleado());
        System.out.print(puesto1.mostrarInfoDepartamento());
        System.out.println(empresa1.mostrarInfoEmpresa());
         /*------------------------------------------------*/
       System.out.println();
        System.out.println(clase1.mostrarInfoAsignatura());
        System.out.print(grupo.mostrarInfoGrupo());
        System.out.println(profesor1.mostrarInfoProfesor());
        
        System.out.println();
        System.out.println(clase2.mostrarInfoAsignatura());
        System.out.print(grupo2.mostrarInfoGrupo());
        System.out.println(profesor2.mostrarInfoProfesor());
                
            
   
    }

}
