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
public class MetodoNewtonRaphson {
    public MetodoNewtonRaphson() {
    }
 
 
    public double f(double val){
        double resultado;
        //aqui debes escribir la funcion.
        resultado=Math.sin(Math.toRadians(val)); //en este caso (sen x)
     
        return resultado;
    }
    
    public double g(double val){
        double resultado;
        //la derivada de la funcion
        resultado=Math.cos(Math.toRadians(val)); //en este caso (cos x)
     
        return resultado;
    }
 
    public double ejecutarMetodo(double ingreso){
        
        double x0;
        double x1 = 0.0;
        
        x0 = ingreso;
        
        boolean bool=true;
        int iteracion=0;
     
        while(bool){
            iteracion++;
            System.out.println("ITERACION Nº" + iteracion );
            
            x1 = x0 - (f(x0) / g(x0));
            
            System.out.println("x0: " + x0);
            System.out.println("f(x0): " + f(x0));
            System.out.println("g(x0): " + g(x0));
            System.out.println("x1: " + x1);
            
            if(Math.abs(f(x0)) < Math.pow(10,-8)){
                System.out.println("El resultado ya es muy pequeño.");
                return x1;
            }
            
            x0 = x1;
        }
        return x1;
    }
}
