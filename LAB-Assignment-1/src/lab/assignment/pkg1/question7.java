/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg1;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int n = sc.nextInt();
        if (n > 99 && n < 1000){
            int d3 = n % 10;
            n = n / 10;
            int d2 = n % 10;
            n = n / 10;
            int d1 = n % 10;
            if (d1 == d3){
                System.out.println("Win");
            }
            else{
                System.out.println("Lose");
            }
        }
        else{
            System.out.println("Your input is invalid");
            System.out.println("Please enter three digit integers");
        }
    }
}
