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
       return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicos ejercicios = new EjerciciosBasicos();
        System.out.println(ejercicios.fiestaArdilla(30, false));
        System.out.println(ejercicios.fiestaArdilla(50, false));
        System.out.println(ejercicios.fiestaArdilla(70, true));
    }
    
}
