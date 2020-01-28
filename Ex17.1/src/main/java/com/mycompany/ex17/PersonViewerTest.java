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
public class PersonViewerTest {
    public static void main(String []args){
        Student s=new Student("Ion","@Ion","math",9);
        PersonViewer s2=new Student("asd", "@asd", "chi", 8);
        PersonViewer l=new Lecturer("Jon", " @ ","Bio");
        Lecturer l1=new Lecturer("Jon", "@j", "bio");
        l.view(l1);
        System.out.println(s.getDescription());
        PersonViewer s1=new Student("Art", "@qwe", "geo", 10);
        s1.view(s);
        Employee emp=new Employee("Marc", "@marc", "Sec. dep.");
        PersonViewer emp1=new Employee("Marc", "@marc", "Alert");
        emp1.view(emp);
        System.out.println(" 1");
        emp.view(emp);
        System.out.println(emp.getDescription());
        
        
    }
    
}
