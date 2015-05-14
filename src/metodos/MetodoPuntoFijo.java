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
public class MetodoPuntoFijo {
    
    public MetodoPuntoFijo(){

    }
    
    private double f(double x){
    
        //La funcion convergente se halla:
        
        // x = g(x)
        // F(x) = x(x-5) - e^x
        // x^2 - 5x - e^x = 0
        // X = (5x + e^x)/ x
        System.out.println(Math.exp(1));

        double r = ((5 * x) + Math.exp(x)) / x;

        return r;
    }
    
    public double ejecutarMetodo(double ingreso, int maxIteraciones){
        
        int iteracion=0;
        
        double p = ingreso; 
        
        boolean procesar = true;

        while(procesar){
            
            iteracion++;
            System.out.println("ITERACION Nº" + iteracion);
            System.out.println("");
            
            p = f(p);
            System.out.println("El valor de x: " + p);
            
            if(Math.abs(f(p)) < Math.pow(10,-8)){
                System.out.println("El resultado ya es muy pequeño.");
                procesar = true;
            }
            
            if(maxIteraciones == iteracion){
                procesar = false;
            }
            System.out.println("");
            System.out.println("FIN DE ITERACION Nº" + iteracion);
            System.out.println("===============================");
            System.out.println("");
            System.out.println("");
        }
        return p;
    }
    
}


