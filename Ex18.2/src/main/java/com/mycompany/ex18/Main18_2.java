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
public class Main18_2 {
    public static void main(String[] args) {
        
       SirValidate text = textInitial -> textInitial.contains("knowledge");
       SirValidate text1 = textInitial -> textInitial.length()>6;
       SirValidate text2 = textInitial -> textInitial==null;
       SirValidate text3 = textInitial -> !textInitial.contains(" ");
        //boolean result = (textPredicat).test("The knowledge is the best weapon");
System.out.println(text.valid("The knowledge is the best weapon")); // True
//boolean result1 = text1("The knowledge is the best weapon");
System.out.println(text1.valid("The knowledge is the best weapon"));
//boolean result2 = text2Predicat.test("The knowledge is the best weapon");
System.out.println(text2.valid("The knowledge is the best weapon"));
//boolean result3 = (text3Predicat).test("The knowledge is the best weapon");
System.out.println(text3.valid("The knowledge is the best weapon"));
        
        System.out.println("");
PredicatString<String> textPredicat = textInitial -> !textInitial.contains("x");
PredicatString<String> text1Predicat = textInitial -> textInitial.length()>6;
PredicatString<String> text2Predicat = textInitial -> textInitial==null;
PredicatString<String> text3Predicat = textInitial -> !textInitial.contains(" ");
String model=null;
boolean result = (textPredicat).test("The knowledge is the best weapon");
System.out.println(result); // True
boolean result1 = text1Predicat.test("The knowledge is the best weapon");
System.out.println(result1);
boolean result2 = text2Predicat.test("The knowledge is the best weapon");
System.out.println(result2);
boolean result3 = (text3Predicat).test("The knowledge is the best weapon");
System.out.println(result3);

   
    }
     
}
