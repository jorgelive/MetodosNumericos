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
//  double r = x - x*x*x - 4d*x*x + 10;
//  double r = Math.sqrt(10/(4+x));
//	double r = Math.sqrt(10-x*x*x)/2;
        double r = x - (x*x*x + 4d*x*x - 10)/(3d*x*x+8d*x);
        return r;
    }
    
    public double calcularRaiz(double ingreso){
        
        double p0;
        
        int iteracion=0;
        double p = ingreso; 
        
        boolean procesar = true;

        while(procesar){
            iteracion++;
            System.out.println("ITERACION Nº" + iteracion );
            p = f(p0);
            if(Math.abs(f(x0)) < Math.pow(10,-8)){
                System.out.println("El resultado ya es muy pequeño.");
                return x1;
            }
            p0 = p;
        }
        return p;
    }
    
}


