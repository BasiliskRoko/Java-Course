/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.addon;
import static java.util.Arrays.*;

/**
 *
 * @author seredov-a
 */
public class Addon2 {
    
    public static int AverageSpeed(SpaceShip... args){
        if(args.length ==0){
            return 0;
        }  
        else if(args.length ==0){
            return args[0].GetSpeed();
        }
        
        Double average = new Double(0);

        for(SpaceShip x: args){
            average += ((double)x.GetSpeed())/(double)args.length;
            
        }
        return average.intValue();
    }
    
    public static int MaxSpeed(SpaceShip... args){
        sort(args, 0, args.length, new SortBySpeed());
        return args[args.length-1].GetSpeed();
    }
    
    
    public static void main(String[] args) {
        SpaceShip ship1 = new SpaceShip(123);
        SpaceShip ship2 = new SpaceShip(-456);
        SpaceShip ship3 = new SpaceShip(789);
        
        
        System.out.println("Average speed " + AverageSpeed(ship1, ship2, ship3));
        System.out.println("Maximum speed " + MaxSpeed(ship1, ship2, ship3));
    }
    
}
