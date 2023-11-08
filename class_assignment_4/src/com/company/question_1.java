package com.company;
import java.util.*;

public class question_1 {
//    Write a Java program to keep accepting 10 integer values from user until valid values are entered. If the user enters invalid integer values then ask the user to enter it again
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter an integer");
        for (int i = 0; i < 10; i++) {
            boolean flag = true;
            while (flag){
                try {
                    arr[i] = input.nextInt();
                    flag = false;
                }
                catch (Exception e){
                    System.out.println("enter the " + (i+1) + " value again as it is invalid");
                    input.next();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int e:arr
            ) {
            System.out.print(e + ",");
        }
    }
}