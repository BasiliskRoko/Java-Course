/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.addon;

/**
 *
 * @author seredov-a
 */
public class Addon1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double a = 1234567890;
        double b = 0.0000001;
        double sum = 0;
        for( int i =0; i< 1000000; i++){
            sum +=b;
        }
        sum+=a;
        System.out.println(sum>a);
    }
    
}
