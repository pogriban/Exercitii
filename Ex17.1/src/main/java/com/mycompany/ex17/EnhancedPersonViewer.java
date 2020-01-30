/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex17;

/**
 *
 * @author ThinkPad
 */
public class EnhancedPersonViewer extends PersonViewer {
    @Override
    public void view(Person person){
     if (person instanceof Student)
        super.view(person);
        
    }
    
    
    
    public void view(Person person){
        if (person instanceof Student)
        System.out.println( "Person new..." );
            System.out.println( "Namele : " + person.getName());
            System.out.println( "Email-: " + person.getEmail());
            System.out.println( "Description: " +person.getDescription());
            System.out.println( "\n");
        
        
    }
    
    
}
