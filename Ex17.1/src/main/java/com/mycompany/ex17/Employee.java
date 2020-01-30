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
public  class Employee  implements Person{
    private String name;
    private String dep;
    private String email;
    public Employee(String name, String email, String dep){
        this.dep=dep;
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public String getDescription() {
        return " Employee{ " +  name +", work in " + dep+'}';
    }

     public String getEmail() {
        return email;
    }
}
