/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex18;

/**
 *
 * @author ThinkPad
 */
public class Validate {
    public static void main(String[] args) {
       int x=6;
       int x1 =3;
       int x2=-3;
        NumValidate maiMare = a -> a > 0;
        NumValidate maiMic = a -> a < 0;
        NumValidate par = a -> a %2==0;
        NumValidate imparpar = a -> a %2!=0;
		
		
		
        MaiMareCaZero maiMare1 = new MaiMareCaZero();
        boolean result =maiMare1.valid(6);
        System.out.println("Numarul "+ x+" mai mare ca zero "+result);
        System.out.println("Numarul "+ x+" mai nare ca zero "+maiMare.valid(x));
        System.out.println("Numarul "+ x2+" mai mic zero "+maiMic.valid(x2));
        System.out.println("Numarul "+ x+" par "+par.valid(x));
        System.out.println("Numarul "+ x1+" impar "+imparpar.valid(x1));
        System.out.println("");
        Predicate maiMarecaZeroPredicar = i -> i > 0;
        Predicate maiMicZeroPredicar = i -> i < 0;
        Predicate parPredicar = i -> i %2== 0;
        Predicate imparPredicar = i -> i %2!= 0;
        
// Calling Predicate method
System.out.println("Numarul "+x+" este mai mare ca zero "+maiMarecaZeroPredicar.test(x));
System.out.println("Numarul "+x2+" este mai mic ca zero "+maiMicZeroPredicar.test(x2));
System.out.println("Numarul "+x+" este par "+parPredicar.test(x));
System.out.println("Numarul "+x1+" este impar "+imparPredicar.test(x1));

        
        
    }
    
    
}
