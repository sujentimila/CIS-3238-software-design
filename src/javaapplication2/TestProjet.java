/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tuf88526
 */
public class TestProjet {
 
    public static void main(String[] args){
        System.out.println("Hellow worlld");
        Result result = JUnitCore.runClasses(TestJunit.class);
        
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
    
    
}
