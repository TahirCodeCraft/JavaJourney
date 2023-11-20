package com.company;

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] workHour= new int[8][7];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Enter "+(i+1)+" employee "+(j+1)+ " day work hours");
                workHour[i][j] = input.nextInt();
            }
        }
        for (int[] e:workHour) {
            for (int f:e) {
                System.out.printf("%4s",f);
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += workHour[i][j];
            }
            System.out.println(i+" employee total work hours is " + sum);
        }
    }
}
