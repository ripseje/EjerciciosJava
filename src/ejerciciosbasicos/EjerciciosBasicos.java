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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicos ejercicios = new EjerciciosBasicos();
        //test ejercicio 1
        System.out.println(ejercicios.fiestaArdilla(30, false));
        System.out.println(ejercicios.fiestaArdilla(50, false));
        System.out.println(ejercicios.fiestaArdilla(70, true));
        //test ejercicio 2
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
        System.out.println(ejercicios.multa(80, false));
        System.out.println(ejercicios.multa(80, true));
        System.out.println(ejercicios.multa(85, true));
        System.out.println(ejercicios.multa(85, false));
    }
    
}
