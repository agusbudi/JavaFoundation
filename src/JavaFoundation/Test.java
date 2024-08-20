/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaFoundation;

import java.time.Year;
import java.util.Scanner;
import section5.DecisionStatement.ConditionalExecution;
import section5.DecisionStatement.ExpressionVariables;
import section5.DecisionStatement.SwitchStatement;
import section6.LoopConstruct.BreakContinue;
import section6.LoopConstruct.CountDown;
import section6.LoopConstruct.WhileDoWhile;
import section6.CreatingClass.*;

/**
 *
 * @author agus budi
 */
public class Test {
    public static void main(String[] args){
//        boolean passed, largeVenue, grade;
//        passed = true;
//        largeVenue = false;
//        grade = passed;
//        //boolean data type
////        System.out.println(passed);
////        System.out.println(largeVenue);
////        System.out.println(grade);
//        
//        ExpressionVariables ev = new ExpressionVariables();
//        //expression();
////        relationalOperator();
////        ageValidity();
////        blockCode();
////        ev.comparison();
//        ConditionalExecution ce = new ConditionalExecution();
////        ce.multipleCondition(89, 0);
////        ce.watchMovie(17, 5);
//        SwitchStatement ss = new SwitchStatement();
//        ss.numberDays();

//        CountDown cd = new CountDown();
//        
////        cd.countDownRocket(15);
////        cd.countDownWhile(15);
////        cd.addInteger(6);
////        cd.countDigit();
//        WhileDoWhile wdw = new WhileDoWhile();
////        wdw.averageExam();
////        wdw.burungBeo();
////          wdw.validasiInput();
//          
//          BreakContinue bc =new BreakContinue();
////          bc.usingBreak();
//            bc.usingContinue();

//        SavingsAccount sa0001 = new SavingsAccount();
//        sa0001.name = "Damien";
//        sa0001.deposit(1000);
//        sa0001.balance = 1000;
//        sa0001.balance += sa0001.calcInterest();
//        sa0001.withdraw(500);
//        sa0001.withdraw(-200);
//        
        SavingsBond sb0001= new SavingsBond();
        sb0001.balance = 1000;
        sb0001.setTermAndRate(1);
        sb0001.earnInterest();
    }
    
}
