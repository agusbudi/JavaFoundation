/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section4javamethodslibraryclass;

import java.util.Scanner;
import javax.swing.*;
import java.util.Date;

/**
 *
 * @author agus budi
 */
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public CalculatorTest() {
        
        StringMath.cobaString("Evi Lestari Dwi Cahya Ramadani Dhimas Ilmi Auvi");
        
       // mauScan();
        //Create Calculator object instance
        Calculator calc = new Calculator();
        calc.printTip(); 
        double total = calc.findTotal(0.05, 0.10,10.0);
        total = total + calc.findTotal(0.05, 0.10,12.0);
        total = total + calc.findTotal(0.05, 0.10,15.0);
        total = total + calc.findTotal(0.05, 0.10,8.0);
        total = total + calc.findTotal(0.05, 0.10,25.0);
        
        System.out.println("Total: " + total/5.0);
        
       // cetakPesan();
                
    }
    public static void cetakPesan(){
        JFrame frame = new JFrame();
        Date tgl = new Date();
        JOptionPane.showMessageDialog(frame, "Hello!" + tgl.toString());
    }
    
    public static void mauScan(){
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number");
        num = keyboard.nextInt();
        System.out.println("The number you entered is" + num);
    }
}
