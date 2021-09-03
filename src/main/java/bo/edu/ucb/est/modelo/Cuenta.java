/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import bo.edu.ucb.est.interfaz.Bienvenido;
/**
 *
 * @author ecampohermoso
 */
public class Cuenta {
    int Codigo;
    private String moneda;
    private String tipo;
    private double saldo;
    Bienvenido uno=new Bienvenido();
    public Cuenta(int Codigo,String moneda, String tipo, double saldoInicial) {
        this.Codigo=Codigo;
        this.moneda = moneda;
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }
    public void Mostrar(int i){
        System.out.print(i);
        System.out.print(". Cuentas ");
        System.out.print(Codigo);
        System.out.println(" " + tipo + " (" + moneda+ ")");
    }
    public void MostrarTodo(int i){
        System.out.print("Información de la cuenta:\n\n"+ "Cuenta ");
        System.out.println(Codigo);
        System.out.print(tipo + "\nSaldo: ");
        System.out.print(saldo);
        System.out.println(" " + moneda + "\n");
    }
    public boolean retirar(double monto) {
        boolean resultado = false;
        if (monto > 0 && monto <= saldo) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo - monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
    
    public boolean depositar(double monto) {
        boolean resultado = false;
        if (monto > 0 ) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo + monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }        
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
