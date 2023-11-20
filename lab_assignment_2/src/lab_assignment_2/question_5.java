/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_assignment_2;
import java.util.Scanner;

// calculating area of the pentagon

public class question_5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the side:");
        double side= input.nextDouble();
        System.out.printf("The area of pentagon is: %f",area(side));
    }
    public static double area(double side){
        double area= (5 * Math.pow(side, 2))/(4*(Math.tan((Math.PI)/5)));
        return area;
    }
}