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
  
    public double f(double x){
        // la funcion
        
        double resultado=Math.sin(Math.toRadians(x)); //en este caso (sen x)
     
        return resultado;
    }
    
    public double g(double val){
        //la derivada de la funcion
        
        double resultado=Math.cos(Math.toRadians(val)); //en este caso (cos x)
     
        return resultado;
    }
 
    public double ejecutarMetodo(double ingreso, int maxIteraciones){
        
        double x0;
        double x1 = 0.0;
        
        x0 = ingreso;
        
        boolean procesar=true;
        
        int iteracion=0;
     
        while(procesar){
            
            iteracion++;
            
            System.out.println("ITERACION Nº" + iteracion );
            System.out.println("");
            
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
            
            if(maxIteraciones == iteracion){
                procesar = false;
            }
            System.out.println("");
            System.out.println("FIN DE ITERACION Nº" + iteracion);
            System.out.println("===============================");
            System.out.println("");
            System.out.println("");
        }
        return x1;
    }
}
