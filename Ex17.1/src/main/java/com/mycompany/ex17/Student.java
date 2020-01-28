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
public class Student extends PersonViewer implements Person{
    private String email;
    private String name;
    private String curs;
    private int grade;
    public Student( String name, String email, String curs, int grade){
        this.curs=curs;
        this.email=email;
        this.name=name;
        this.grade=grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int nogradeta) {
        this.grade = grade;
    }

    @Override
    public String getDescription() {
        return name+" Student{" + "email=" + email +  ", curs=" + curs+ ", grade=" + grade + '}';
    }

    

    
    
}
