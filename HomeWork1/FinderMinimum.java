/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bercut.course;

/**
 *
 * @author seredov-a
 */
public class FinderMinimum {
    public static void main(String[] args){
        int var1 = 408454;
        int var2 = 911591;
        int var3 = 251105;
        int result = var3;
        
        assert min(var1, var2, var3) == result;
        assert min(var2, var3, var1) == result;
        assert min(var3, var1, var2) == result;
        assert min(var3, var2, var1) == result;
	assert min(var2, var1, var3) == result;
	assert min(var1, var3, var2) == result;
        
        if(args.length == 3){
            System.out.println("Result min(" + args[0] + ", " + args[1] + ", " + args[2] + ") = " + 
                min(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }     
        
    }
    
    static int min(int a, int b, int c){
        int result = a;
        if(result > b){
            result = b;
        }
        if(result > c){
            result = c;
        }
        return result;
    }
}
