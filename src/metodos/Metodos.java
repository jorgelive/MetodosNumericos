/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author jgomez
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MetodoBiseccion metodo = new MetodoBiseccion();
        //double res = metodo.ejecutarMetodo(70,235);
        MetodoNewtonRaphson metodo = new MetodoNewtonRaphson();
        double res = metodo.ejecutarMetodo(45);
        System.out.println("El resultado final: " + res);
    }
    
}
