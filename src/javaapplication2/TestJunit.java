/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author tuf88526
 */
public class TestJunit {
  
@Test
public void test(){
    System.out.println("This is the first test:");
    Date d1= new Date(2016,9,20);
    Date d2= new Date(2015,9,20);
    assertEquals(365, d1.daysto(d2));
    System.out.println(d1.daysto(d2));
}


@Test
public void test2(){
    System.out.println("This is the second test:");
    Date d1= new Date(2017,8,18);
    Date d2= new Date(2014,8,21);
    assertEquals(1, d1.daysto(d2));
    System.out.println(d1.daysto(d2));
}

@Test 
public void test3(){
    System.out.println("This is the third test:");
    Date d1= new Date(2016,8,20);
    Date d2= new Date(2016,8,20);
    assertEquals(0, d1.daysto(d2));
    System.out.println(d1.daysto(d2));
}

}
