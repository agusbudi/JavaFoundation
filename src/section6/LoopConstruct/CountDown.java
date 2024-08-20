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
public class CountDown {
    public void countDownRocket(int start){
        System.out.println("Countdown to Launch: ");
        for(int i = start; i >= 0; i--) {
            if(i%2==0)            
                System.out.print(i + " "); 
        }//end for
        System.out.println("\nBlast Off!");
        
        int a;
        for(a = 1; a <= 5; a++)
            System.out.println(a); 
  
        System.out.println("second line");
    }
    
    public void countDownWhile(int start){
        System.out.println("Countdown to Launch: ");
        while(start>=0){
            System.out.print(start + " ");
            start--;
        }
        System.out.println("\nStart: " + start);
        System.out.println("Blast Off!");
    }
    
    public void addInteger(int n){
        Scanner in = new Scanner(System.in);
        System.out.println("This program adds " + n + " numbers.");
        System.out.println("Type each number, followed by Enter.");
        int total =0;
        for(int i=0;i<n;i++){            
            int n1 = in.nextInt();
            total += n1;
        }
        System.out.println("Total: " + total);
    }
    
    public void countDigit(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        String N = Integer.toString(n);
//        System.out.println(N.length());
        int ans= 1;
        for(; n>10; n/=10){
            ans++;
        }
        System.out.println(ans);
    }
    
}
