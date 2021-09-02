/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import bo.edu.ucb.est.interfaz.Bienvenido;
import bo.edu.ucb.est.modelo.Banco;
import java.util.Scanner;
/**
 *
 * @author ecampohermoso
 */
public class Cajero {
    public Cajero(Banco bisa){
        this.bisa=bisa;
    }
    Bienvenido uno=new Bienvenido();
    Banco bisa = new Banco("BANCO BISA");
    Scanner leer =new Scanner(System.in);
    String codeCli;
    String pin;
    public void MostrarBienvenida(){
        do{
        uno.Linea();
        uno.Bienvenido();
        codeCli=leer.next();
        uno.pin();
        pin=leer.next();
        uno.Linea();
        }while(bisa.buscarClientePorCodigo(codeCli,pin)==null);
    }
    public void MenuPrincipal(){
        
    }
}
