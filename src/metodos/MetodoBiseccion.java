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
  
    public double f(double x){
        
        //double resultado = Math.sin(Math.toRadians(x)); //en este caso (sen x)
        
        double resultado = Math.atan(x) + x - 1; //arctan⁡(x)+ x -1 
     
        return resultado;
    }
 
    public double ejecutarMetodo(double a0, double b0, int maxIteraciones){
        
        double a=a0;
        
        double b=b0;
        
        double c=Double.NaN;
        
        boolean procesar=true;
        
        int iteracion=0;
     
        while(procesar){
            
            iteracion++;
            System.out.println("ITERACION Nº" + iteracion );
            System.out.println("");

            
            System.out.println("El valor de 'a' es: " + a);
            System.out.println("El valor de 'b' es: " + b);
            System.out.println("");
            
            double fa = this.f(a);
            double fb = this.f(b);
            System.out.println("El valor de 'f(a)' es: " + fa);
            System.out.println("El valor de 'f(b)' es: " + fb);
            System.out.println("");
            
            if(fa * fb > 0){
                System.out.println("La función no es continua. en los puntos dados.");
                return c;
            }
            
            
            c = (a + b) / 2;
            double fc = this.f(c);
            System.out.println("El valor de 'c' es: " + c);
            System.out.println("El valor de 'f(c)' es: " + fc);
            System.out.println("");

            if(Math.abs(fc) < Math.pow(10,-8)){
                System.out.println("El resultado ya es muy pequeño.");
                return c;
            }
            
            if(fc == 0){
                System.out.println("Se ha llegado a un resultado exacto.");
                return c;
            }else{
                if(fc * fa < 0){
                    b = c;
                    System.out.println("f(c) * f(a) < 0, la función es continua en este tramo.");
                    System.out.println("Se reemplazará b con c: " + b + " en la siguiente iteración.");
                }else if (fc * fb < 0){
                    a = c;
                    System.out.println("f(c) * f(b) < 0, la función es continua en este tramo.");
                    System.out.println("Se reemplazará a con c: " + a + " en la siguiente iteración.");
                }else{
                    System.out.println("Error: La función no es continua.");
                    return c;
                }
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
        return c;
    }
}
