/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.interfaz;

/**
 *
 * @author HP
 */
public class Bienvenido {
    public void Bienvenido(){
        System.out.println("Bienvenido al BANCO BISA\n\nIngrese su codigo de cliente: ");
    }
    public void pin(){
        System.out.println("Ingrese su pin: ");
    }
    public void CredencialesIncorrectas(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nCredenciales Incorrectas\nIntentelo de nuevo");
    }
    public void Linea(){
        System.out.println("**********************");
    }
    
}
