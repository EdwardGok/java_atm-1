/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.eleccion;

import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.interfaz.Bienvenido;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Eleccion {
    Bienvenido uno=new Bienvenido();
    Scanner leer =new Scanner(System.in);
    int opcion;
    public void eleccionMenu(int eleccion, Cliente cli){
        switch(eleccion)
        {
            
            case 1:
                cli.MostrarCuentas();
                uno.Linea();
                uno.Opcion();
                opcion=leer.nextInt();
                uno.Linea();
                cli.BuscarCuentas(opcion,1);
                uno.Linea();
                break;
            case 2:
                cli.MostrarCuentas();
                uno.Linea();
                uno.Opcion();
                opcion=leer.nextInt();
                uno.Linea();
                cli.BuscarCuentas(opcion,2);
                uno.Linea();
                break;
            case 3: 
                cli.MostrarCuentas();
                uno.Linea();
                uno.Opcion();
                opcion=leer.nextInt();
                uno.Linea();
                cli.BuscarCuentas(opcion,3);
                uno.Linea();
                break;
            default:
        }
    }
    
}
