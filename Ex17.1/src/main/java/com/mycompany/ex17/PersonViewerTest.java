/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex17;

/**
 *0
 * @author ThinkPad
 */
public class PersonViewerTest {
    public static void main(String []args){
        
        Student s=new Student("Ion","@Ion",9);
        Lecturer l1=new Lecturer("Jon", "@j", "bio");
        Employee emp=new Employee("Marc", "@marc", "Sec. dep.");
        PersonViewer p=new PersonViewer();
        p.view(s);
        p.view(l1);
        p.view(emp);
        
        
        
        
       // PersonViewer l=new Lecturer("Jon", " @ ","Bio");
        
        Person s1=new Student("Art", "@qwe", 10);
        
        //PersonViewer emp1=new Employee("Marc", "@marc", "Alert");
        System.out.println(" s1.get Discr "+s1.getDescription());
        EnhancedPersonViewer emp4=new EnhancedPersonViewer();
        System.out.println("s.di "+s.getDescription());
        
        
        //emp1.view(emp);
        System.out.println(" 1");
        //emp.view(emp);
        System.out.println("emp.get.Des "+emp.getDescription());
        //(PersonViewer)EnhancedPersonViewer en=new EnhancedPersonViewer();
        Person s3=new Employee("Marc", "@marc", "Alert");
        s3.getDescription();
    System.out.println(emp4);
        System.out.println("l.view ");
    //l.view(l1);
    Person [] ps=new Student[4];
    ps[0]=new Student("Ion3","@Ion3",93);
    ps[3]=new Student("I3","@I3",193);
    ps[1]=new Lecturer("Jon3", "@j3", "bio3");
    ps[2]=new Employee("Marc3", "@marc3", "Alert3");
//    for (Person pers:ps){
//        if (pers instanceof Student)   
//            
////        System.out.println(" for if "+(Lecturer)ps[i].getDescription());    
//        
//    }
//    
    if (s3 instanceof Employee){
            System.out.println(" este");
        
    }   
    }
    
}
