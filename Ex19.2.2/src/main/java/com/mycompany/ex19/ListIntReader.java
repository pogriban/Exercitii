/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class ListIntReader {
   public int num;
   public int sum=0;
    public void eroare ()  {
        
    
       Scanner sc =new Scanner(System.in);
       ArrayList<Integer> array=new ArrayList<>();
       try{
       for (int i=0;i<5;i++){
         
       array.add(num=sc.nextInt());
       }
       //if (num!=sc.nextInt()) System.out.println(" cefaci ");
            
     
    }
       catch (InputMismatchException e){
           System.out.println("Introdu dor numere");
             
             }
    for(Integer in:array){
            System.out.print(""+in+", ");
    sum +=in;
    }
        System.out.println("suma "+sum);
    } 
}