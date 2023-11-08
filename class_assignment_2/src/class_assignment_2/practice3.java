/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_assignment_2;
import java.util.Scanner;
/**
 *
 * @author AZAN Laptop Store
 */
public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int k = 4;
        long num = input.nextLong();
        String str = String.valueOf(num);
        int len = str.length();
        char a;
        a = (str.charAt(4));
//        if (len>4)
//            a = Character.getNumericValue(str.substring(0,k));
        
//        int a = (num/10) + (num%10);
        System.out.println(a+"  " +str.length());
    }
}
