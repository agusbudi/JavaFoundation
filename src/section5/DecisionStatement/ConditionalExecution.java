package section5.DecisionStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author agus budi
 */
public class ConditionalExecution {
    public void multipleCondition(int grade, int numberDaysAbsent){
        if (grade >= 88) {
            if (numberDaysAbsent == 0) {
                System.out.println("You qualify for the scholarship.");
            }//endif
        }//endif
        
        //logical operators
        int i = 2;
        int j = 8;
        System.out.println((i < 1) && (j > 6));
        System.out.println((i < 1) || (j > 10));
        System.out.println(!(i < 3));

        if (grade >= 88 && numberDaysAbsent == 0) {
                System.out.println("You qualify for the scholarship.");
        }//endif
        
        if (grade >= 70 || numberDaysAbsent < 5)
            System.out.println("You qualify for a sports team");
        else
            System.out.println("You do not qualify for a sports team");
        
        boolean madeFreeTutor = grade >= 88;
        if (!madeFreeTutor && numberDaysAbsent < 3)
            System.out.println("You qualify for free tutoring help");
    }
    
    public void watchMovie(int price, double rating){
//        if(price >= 12 && rating ==5)
//            System.out.println("I\'m interested in watching the movie");
//        else
//            System.out.println("I\'am not interested in watching the movie");
        
        boolean watch = (price >= 12 && rating ==5) ? true : false;
        
        if(watch)
            System.out.println("I\'m interested in watching the movie");
        else
            System.out.println("I\'am not interested in watching the movie");
    }
    
    public void taxCount(int income){
        double tax;
        if (income <= 15000) {
            tax = 0;
        } 
        else if (income <= 25000) {
            tax = 0.05 * (income - 15000);
        } 
        else {
            tax = 0.05 * (income - (25000 - 15000));
            tax += 0.10 * (income - 25000);
        }//endif
    }
    
    public void statusTV(String tvType, int size){
        int discPercent;
        if (tvType == "color") {
            if (size == 14) {
                discPercent = 8;
            } 
            else {
                discPercent = 10;
            }//endif
        }//endif
    }
}
