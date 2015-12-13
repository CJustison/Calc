/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cjustison.calc;

/**
 *
 * @author Claire
 */
public class CalcOne {
    

private int a;
private int b;
    
    public CalcOne(int a, int b) {
       this.a = a;
       this.b = b;
    }

    public int getResultAdd(){
       return a + b;
      
    }
    public int getResultSub(){
       return a - b;
      
    }
    public int getResultMult(){
       return a * b;
      
    }
    public int getResultDiv(){
       return a / b;
      
    }
}
