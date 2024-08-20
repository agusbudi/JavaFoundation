/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section5.DecisionStatement;

import java.util.Scanner;

/**
 *
 * @author agus budi
 */
public class ExpressionVariables {
    
    static void expression(){
        //Expressions and Variables
        System.out.println(1 + 2);
        int x = 2 + 3;
        
        System.out.println(x == 5);
        boolean isFive = x == 5;
        
        boolean res1 = 24 == 15;
        System.out.println("res1: " + res1);
        int value1 = 15;
        int value2 = 24;
        boolean res2 = value1 == value2;
        System.out.println("res2: " + res2);
        int opr= x +2;
        System.out.println( opr + " cm");
    }
    
    public static void relationalOperator(){
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(b >= a);
        System.out.println(b <= a);
    }
    
    static void ageValidity(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("age: ");
        int age = keyboard.nextInt();
        if(age<=18)
            System.out.println("belum boleh. naik sepeda ajah");
        else
            System.out.println("boleh naik matic ajah, <250 cc");
        
        boolean drivingUnderAge = (age<=18)? true :false;
        
        if(drivingUnderAge)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
    public static void goTotheGym(){
        String left = "museum";
        String straight = "gym";
        String right = "restaurant";
        if (left == "gym") {
            System.out.println("Turn Left");
        }//endif
        if (straight== "gym") {
            System.out.println("Drive Straight");
        }//endif
        if (right == "gym") {
             System.out.println("Turn Right");
        }//endif
    }
    
    public static void blockCode(){
        int daysInFeb = 28;
        boolean isLeapYear =false;
        int year = 2023;
        if(isLeapYear) 
            daysInFeb = 29;
            System.out.println(year + " is a leap year");

    }
    
    public static void comparison(){
        int x1 = 3;
        int y1 = 2;
        int z1 = x1 + y1;
        boolean test1 = (z1 == x1 + y1);
        System.out.println(test1); //true
        
        String x = "Ora";
        String y = "cle";
        String z = x + y;
        boolean test = (z == x + y);
        System.out.println(test); 
        test =  z.equals(x + y);
        System.out.println(test); 
    }
}
