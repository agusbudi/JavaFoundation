/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6.LoopConstruct;

/**
 *
 * @author agus budi
 */
public class BreakContinue {
    public void usingBreak(){
        int i = 0;
        while (i < 10) {
            System.out.println(i + "\t");
            i++;
            if (i == 7) {
                break;
            }//endif
        }//end while
    }
    
    public void usingContinue(){
        int i = 0;
        while (i < 10) {
            i++;            
            if (i == 4) {
                continue;                
            }//endif
            System.out.println(i + "\t"); 
        }//end while        
    }
    
}
