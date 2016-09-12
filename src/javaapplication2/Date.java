/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author tuf88526
 */
public class Date {
    private int day;
    private int year;
    private int month;
    
    public Date(){
        this.year=0;
        this.month=0;
        this.day=0;
    }
    
    
    public Date( int year, int month, int date){
        this.day=day;
        this.year=year;
        this.month=month; 
    }
    
    
    public int daysto(Date date){
        int yearDiff=Math.abs(date.year-this. year);
        int monthDiff=Math.abs(date.month-this.month);
        int dayDiff=Math.abs(date.day-this.day);
        return (yearDiff*360+monthDiff*30+dayDiff);
    }
    
}
