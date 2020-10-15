/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.tolstoy;

/**
 *
 * @author seredov-a
 */
class CountWord implements Comparable{
    String word;
    int count = 1;
    CountWord(String word){
        this.word = word;        
    }
    
    void increment(){
        this.count++;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public String getWord(){
        return this.word;
    }    
    
    @Override
    public boolean equals(Object that){
        if(that == this){
            return true;
        }
        
        if(!(that instanceof CountWord)){
            return false;
        }
                
        
        return this.word.compareTo(((CountWord)that).word) == 0;
    }

    @Override
    public int compareTo(Object o) {
        CountWord that = (CountWord)o;
        if ( this.count > that.getCount()) return -1;
        else if ( this.count == that.getCount() ) return 0;
        else return 1;
    }
}
