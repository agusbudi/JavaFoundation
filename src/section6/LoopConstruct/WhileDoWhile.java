/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6.LoopConstruct;

import java.util.Scanner;

/**
 *
 * @author agus budi
 */
public class WhileDoWhile {
    
    public void burungBeo(){
        Scanner in = new Scanner(System.in);
//        String text = in.nextLine();
//        while(!text.equals("-1")){
//            System.out.println(text);
//            text = in.nextLine();            
//        }
        
        String text =  in.nextLine();
        do{
            System.out.println(text);
            text = in.nextLine();            
        }while(!text.equals("-1"));
    }
    
    public void validasiInput(){     
        Scanner in = new Scanner(System.in);
        int usia;
        do{
            System.out.println("Masukkan usia yg benar: ");
            usia = in.nextInt();
        }while(usia <0 || usia>150);
    }   
    
    
    public void averageExam(){        
        Scanner in = new Scanner(System.in);
        System.out.print("This program calculate the average scores. Enter a score or -1 for stop: ");
        double total = 0.0;
        double score = in.nextDouble();
        int counter=0;
        while(score != -1){
            counter++;
            total += score;
            System.out.print("Enter a score or -1 for stop: ");
            score = in.nextDouble();
        }
        System.out.println("Average Score: " + total/counter);
    }
}
