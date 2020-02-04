/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex18;

/**
 *
 * @author ThinkPad
 * @param <Integer>
 */
@FunctionalInterface
public interface Predicate <Integer> {
   
boolean test(int t);
    
}
