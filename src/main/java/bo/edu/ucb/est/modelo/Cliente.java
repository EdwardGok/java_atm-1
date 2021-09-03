/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import bo.edu.ucb.est.interfaz.Bienvenido;

/**
 *
 * @author ecampohermoso
 */
public class Cliente {
    private String nombre;
    private String codigoCliente;
    private String pinSeguridad;
    private List<Cuenta> cuentas;
    double monto;
    boolean S;
    Scanner leer =new Scanner(System.in); 
    Bienvenido uno=new Bienvenido();
    
    public Cliente(String nombre, String codigoCliente, String pinSeguridad) {
        this.nombre = nombre;
        this.codigoCliente = codigoCliente;
        this.pinSeguridad = pinSeguridad;
        this.cuentas = new ArrayList();
    }
    public void MostrarCuentas(){
        int i;
        for (i = 0; i < cuentas.size(); i++) {
            Cuenta cuent = cuentas.get(i);
            cuent.Mostrar(i+1);
        }
        System.out.print(i+1);
        System.out.println(". Volver al menú principal");
    }
    public void BuscarCuentas(int i1, int opcion){
        if(i1>0 && i1<(cuentas.size()+1))
        {
            Cuenta cuent = cuentas.get(i1-1);
            switch(opcion){
                case 1:
                    cuent.MostrarTodo(i1-1);
                    break;
                case 2:
                    cuent.MostrarTodo(i1-1);
                    do{
                        uno.retirar();
                        monto=leer.nextDouble();
                        S=cuent.retirar(monto);
                        if(S==false){
                            uno.error();
                        }else{
                            uno.Exito();
                        }
                    }while(S==false);
                    
                    break;
                case 3:
                    cuent.MostrarTodo(i1-1);
                    do{
                        uno.depositar();
                        monto=leer.nextDouble();
                        S=cuent.depositar(monto);
                        if(S==false){
                            uno.error();
                        }else{
                            uno.Exito();
                        }
                    }while(S==false);
                    break;
                    
            }
            
        }
        else
        {
            if(i1==(cuentas.size()+1))
            {
                System.out.println("Volviendo...");
            }
            else
            {
                System.out.println("Error");
            }
            
        }
    }
    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getPinSeguridad() {
        return pinSeguridad;
    }

    public void setPinSeguridad(String pinSeguridad) {
        this.pinSeguridad = pinSeguridad;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
}
