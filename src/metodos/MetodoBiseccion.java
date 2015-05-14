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
public class MetodoBiseccion {
    public MetodoBiseccion() {
    }
  
    public double f(double val){
        double resultado;
        //aqui debes escribir la funcion en forma matematica
        resultado=Math.sin(Math.toRadians(val)); //en este caso (sen x)
     
        return resultado;
    }
    
    
 
    public double ejecutarMetodo(double a0, double b0){
        double a=a0;
        double b=b0;
        
        double p=Double.NaN;
        
        boolean bool=true;
        
        int iteracion=0;
     
        while(bool){
            iteracion++;
            System.out.println("ITERACION Nº" + iteracion );

            double fa = this.f(a);
            System.out.println("El valor de 'a' es: " + a);
            System.out.println("El valor de 'f(a)' es: " + fa);
            double fb = this.f(b);
            System.out.println("El valor de 'b' es: " + b);
            System.out.println("El valor de 'f(b)' es: " + fb);
            
            if(fa * fb > 0){
                System.out.println("La función no es continua. en los puntos dados.");
                return 0.0;
            }
            
            p = (a + b) / 2;
            double fp = this.f(p);
            System.out.println("El valor de 'p' es: " + p);
            System.out.println("El valor de 'f(p)' es: " + fp);

            if(Math.abs(fp) < Math.pow(10,-8)){
                System.out.println("El resultado ya es muy pequeño.");
                return p;
            }
            
            if(fp == 0){
                System.out.println("Se ha llegado a un resultado exacto.");
                return p;
            }else{
                if(fp * fa < 0){
                    b = p;
                    System.out.println("f(p) * f(a) < 0, la función es continua en este tramo.");
                    System.out.println("Se utilizará b: " + b + " en la siguiente iteración.");
                }else if (fp * fb < 0){
                    a = p;
                    System.out.println("f(p) * f(b) < 0, la función es continua en este tramo.");
                    System.out.println("Se utilizará a: " + a + " en la siguiente iteración.");
                }else{
                    System.out.println("Error: La función no es continua en ningún tramo.");
                    return 0.0;
 
                }
            }
        }
        return p;
    }
}
