/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16;

/**
 *
 * @author ThinkPad
 */
public abstract interface Container {
    
    void pop();
    void push(Task t);
    default int size(){
        return 3;
    }
    default boolean isEmpty(){
        
        return false;   
    }
    void transferFrom(Container c);
}
