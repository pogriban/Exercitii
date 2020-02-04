/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex19;

/**
 *
 * @author ThinkPad
 */
public class Numbers {
    int a;
    public Numbers(int a){
        this.a=a;
    }
    public int devideBy(int d){
       try{ 
           return a/d;
       }
       catch(ArithmeticException e){
                   System.out.println(" eroare" +e.getMessage());
       }
                   return 0;
           
       }
        
    }
    

