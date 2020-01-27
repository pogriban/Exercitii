/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16;

/**
 *
 * @author ThinkPad
 */
public class Task {

    private String message;
    Task(String msg) {
        this.message = msg;
}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Task{"  + message + '}';
    }
    
}
