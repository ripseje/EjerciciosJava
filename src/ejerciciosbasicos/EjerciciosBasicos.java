/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

/**
 *
 * @author Sergio
 */
public class EjerciciosBasicos {
    
    public boolean fiestaArdilla (int numBellotas, boolean finDeSemana){
        if(finDeSemana){
            return true;
        }
        else{
            if(numBellotas >= 40 && numBellotas <= 60){
            return true;
            }
        }
        return false;
    }
    
    public int multa (int velocidad, boolean birthday){
       if(birthday){ //si es mi cumple el guardia me quita 5 km/h de velocidad
           velocidad -= 5;
       }
       if(velocidad <= 60){
           return 0;
       }
       if(velocidad > 60 &&  velocidad <= 80){
           return 1;
       }
       
       return 2; //el resto de casos que son más de 80
    }
    
    public boolean muyVanidoso (int numero, boolean multiplo){
        if(numero % 11 == 0 || numero % 11 == 1){
            return true;
        }
        return false;
    }
    
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        if(dormido){
            return false;
        }
        if(matinal && madre){
            return true;
        }
        if(matinal && !(madre)){
            return false;
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicos ejercicios = new EjerciciosBasicos();
        //test ejercicio 1
        System.out.println("Ejercicio 1: ");
        System.out.print(" " + ejercicios.fiestaArdilla(30, false));
        System.out.print(" " + ejercicios.fiestaArdilla(50, false));
        System.out.print(" " + ejercicios.fiestaArdilla(70, true));
        //test ejercicio 2
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 2: ");
        System.out.print(" " + ejercicios.multa(60, false));
        System.out.print(" " + ejercicios.multa(65, false));
        System.out.print(" " + ejercicios.multa(65, true));
        System.out.print(" " + ejercicios.multa(80, false));
        System.out.print(" " + ejercicios.multa(80, true));
        System.out.print(" " + ejercicios.multa(85, true));
        System.out.print(" " + ejercicios.multa(85, false));
        //test ejercicio 3
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 3: ");
        System.out.print(" " + ejercicios.muyVanidoso(10, true));
        System.out.print(" " + ejercicios.muyVanidoso(11, true));
        System.out.print(" " + ejercicios.muyVanidoso(12, true));
        System.out.print(" " + ejercicios.muyVanidoso(20, true));
        System.out.print(" " + ejercicios.muyVanidoso(21, true));
        System.out.print(" " + ejercicios.muyVanidoso(22, true));
        System.out.print(" " + ejercicios.muyVanidoso(33, true));
        //test ejercicio 4
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 4: ");
        System.out.print(" " + ejercicios.contesta(false, false, false));
        System.out.print(" " + ejercicios.contesta(true, false, false));
        System.out.print(" " + ejercicios.contesta(false, true, false));
        System.out.print(" " + ejercicios.contesta(false, false, true));
        System.out.print(" " + ejercicios.contesta(true, true, false));
        System.out.print(" " + ejercicios.contesta(true, false, true));
        System.out.print(" " + ejercicios.contesta(true, true, true));
    }
    
}
