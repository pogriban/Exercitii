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
public  class Lecturer extends PersonViewer implements Person{
    private String subject;
    private String name;
    private String email;
    public Lecturer(String name, String email, String subject){
        this.name=name;
        this.subject=subject;
        this.email=email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public String getDescription() {
        return name+" Lecturer{" +  ", Teaches " + subject+'}';
    }

     public String getEmail() {
        return email;
    }
    
}
