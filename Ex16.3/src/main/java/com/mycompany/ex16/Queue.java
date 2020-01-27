/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16;

import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class Queue implements Container{

    public ArrayList<Task> myArray = new ArrayList<>();

    public void push(Task t) {
        this.myArray.add(0, t);
        
         }

    public void pop() {
        this.myArray.remove(myArray.size() - 1);
        
    }

    public int size() {
        return (myArray.size());
    }

    public boolean isEmpty() {
        return myArray.isEmpty();
    }

    public void transferFrom(Container c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Override
    public String toString() {
        return "Stack{"  + myArray + '}';
    }
}
