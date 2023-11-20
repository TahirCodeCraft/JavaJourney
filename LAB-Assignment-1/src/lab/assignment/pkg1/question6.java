/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg1;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter withdrawal amount:"); 
        double amount = input.nextInt(); 
        System.out.println("Enter account balance:"); 
        double balance = input.nextInt(); 
        if (amount % 5 == 0){ 
            if ( amount > 0 && amount <= 2000 && balance > 0 && balance <= 2000 ){ 
                if ( amount <= balance + 0.50){ 
                    System.out.println("Balance = " + (balance - (amount + 0.50))); 
                } 
                else{ 
                    System.out.printf("Insufficient Funds %nBalance = %.2f%n",balance); 
                } 
            } 
            else { 
                System.out.println("withdrawal or account balance exceeds limit of 2000"); 
            } 
        } 
        else{ 
            System.out.printf("Incorrect withdrawal amount (not multiple of 5)%nBalance = %.2f%n",balance); 
        } 
    }
}
