/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg1;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight(in pond) to be shippied: ");
        double weight = input.nextDouble();        
        if(weight>0 && weight<=1) 
            System.out.println("Shipping price: 3.5$");
        else if(weight>1 && weight<=3) 
            System.out.println("Shipping price: 5.5$");
        else if(weight>3 && weight<=10) 
            System.out.println("Shipping price: 8.5$");
        else if(weight>10 && weight<=20) 
            System.out.println("Shipping price: 10.5$");     
        else if(weight>50) 
            System.out.println("The package cannot be shipped");
    }
}

