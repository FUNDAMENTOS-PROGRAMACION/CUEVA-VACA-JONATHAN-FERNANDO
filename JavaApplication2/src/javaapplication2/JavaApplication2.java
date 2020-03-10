/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Jhons
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
      int numero=0;
    boolean Valorboolean=true;
    char letra='u' ;
    double numeroc= 0.1;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    implimirNombre ();
    sumar2Numeros(1,2);
    System.out.println(sumar2Numeros(1,4));
     }
 
  public static void implimirNombre () {
  System.out.println("Jonathan Fernando Cueva Vaca");
  }
  public static int sumar2Numeros (int num1, int num2){
    int suma = num1 + num2;
      return suma;
  
  }
  
}
