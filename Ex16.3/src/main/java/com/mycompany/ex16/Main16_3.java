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
public class Main16_3 {
    public static void main(String[] args) {
        //ArrayList <Task> cont =new ArrayList<>();
        Container cons=new Stack();
        Container cons1=new Queue();
        Task t1=new Task("adunarea");
        Task t2=new Task("scaderea");
        Task t3=new Task("inmultirea");
        Task t4=new Task("impartirea");
        Task t5=new Task("modul");
        Task t11=new Task("2adunarea");
        Task t12=new Task("2scaderea");
        Task t13=new Task("2inmultirea");
        Task t14=new Task("2impartirea");
        Task t15=new Task("2modul");
        cons.push(t2);
        cons.push(t3);
        cons.push(t4);
        cons.push(t5);
        cons1.push(t12);
        cons1.push(t11);
        cons1.push(t14);
        cons1.push(t15);
        System.out.println(" Stack ");
       cons.pop();
       System.out.println(cons.toString());
       System.out.println(cons.isEmpty());
        System.out.println(cons.size());
        System.out.println(" Queue ");
        cons1.pop();
        cons1.pop();
        System.out.println(cons1.toString());
        System.out.println(cons1.isEmpty());
        System.out.println(cons1.size());
}
}

