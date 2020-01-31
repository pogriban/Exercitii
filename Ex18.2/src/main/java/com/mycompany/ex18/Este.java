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
public class Este implements SirValidate{
    String c;
    public Este(String c){
        this.c=c;
            
        }
    public boolean valid (String c){
        
        return c.contains("knowledge");        
    }
    
}
