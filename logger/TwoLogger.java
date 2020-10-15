/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bercut.course.logger;

import com.bercut.course.addon.Addon1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seredov-a
 */
public class TwoLogger {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logger log1 = Logger.getLogger(Addon1.class.getName()+"#1");
        Logger log2 = Logger.getLogger(Addon1.class.getName()+"#2");
        
        log1.setLevel(Level.SEVERE);
        log2.setLevel(Level.INFO);
        
        log1.finest("Finest#1");
        log1.fine("Fine#1");
        log1.config("Config#1");
        log1.info("Info#1");
        log1.warning("Warning#1");
        log1.severe("Severe#1");
        
        
        log2.finest("Finest#2");
        log2.fine("Fine#2");
        log2.config("Config#2");
        log2.info("Info#2");
        log2.warning("Warning#2");
        log2.severe("Severe#2");
       
    }
    
}
