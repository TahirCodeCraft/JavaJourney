/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.assignment.pkg1;
import java.util.Scanner;

public class question5 {
//    applying quadratic formula
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double r1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        double r2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        if((Math.pow(b, 2)-4*a*c)>0){
            System.out.println("The equation has two roots "+r1+" and " +r2);    
        }
        else if((Math.pow(b,2)-4*a*c)==0){
            double r=r1=r2;
            System.out.println("The equation has one root "+r);
        }
        else
            System.out.println("The equation has no real roots ");
    }
}
