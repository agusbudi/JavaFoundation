/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4javamethodslibraryclass;

/**
 *
 * @author agus budi
 */
public class Calculator{
    //Fields
    public static double tax = 0.05;
    public static double tip = 0.20;
    public double originalPrice = 10;
    
        //Methods
    public double findTotal(double tax, double tip, double originalPrice){
        double total = originalPrice*(1 +tax + this.tip);
        
        return total;
    //Calculate total after tax and tiporginalPrice
    //Print this value
    }//end method findTotal
    
    public void printTip(){
        System.out.println("tip : " + tip);
    }//end method printTip

}//end class Calculator
