/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6.CreatingClass;

/**
 *
 * @author agus budi
 */
public class SavingsAccount {
    public double balance = 0.0;
    public double interestRate;
    public String name;
    
    public void withdraw(double amount){
        if(balance < amount)
            System.out.println("Uang tidak cukup");
        else if(amount <0)
            System.out.println("Angka tidak boleh negative");
        else{
            balance -= amount;
            System.out.println("Sisa saldo : " + balance);
        }
    }
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }//end method displayCustomer
    
    public void deposit(int x){
        balance += x;
    }//end method deposit
    
    public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
    }//end method calcInterest
}
