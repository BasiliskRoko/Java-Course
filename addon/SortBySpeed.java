/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.addon;


import java.util.Comparator;

public class SortBySpeed implements Comparator<SpaceShip> {
    public int compare(SpaceShip a, SpaceShip b) {
        if ( a.GetSpeed() < b.GetSpeed() ) return -1;
        else if ( a.GetSpeed() == b.GetSpeed() ) return 0;
        else return 1;
    }
}

