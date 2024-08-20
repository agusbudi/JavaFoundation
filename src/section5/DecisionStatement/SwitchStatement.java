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
public class SwitchStatement {
    public void grade(){
        Scanner in = new Scanner(System.in);
        System.out.println("What grade are you in?");
        int grade = in.nextInt();
        switch (grade) {
            case 9:
                System.out.println("You are a freshman");
                break;
            case 10:
                System.out.println("You are a sophomore");
                break;
            case 11:
                System.out.println("You are a junior");
                break;
            case 12:
                System.out.println("You are a senior");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
    
    public void numberDays(){
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7:
            case 8: case 10: case 12: 
                System.out.print("31 days");
                break;
            default:
                System.out.print("30 days");
        }
    }
}
