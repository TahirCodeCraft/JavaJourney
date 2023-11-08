package com.company;
import java.util.Scanner;

public class question_2 {
//    Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
//public static double sumColumn(double[][] m, int columnIndex)
//Write a test program that reads a 3-by-4 matrix and displays the sum of each column
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (double[] x:matrix) {
            for (double y:x
                 ) {
                System.out.printf("%6s",y);
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of the element at column "+(j+1)+" is "+sumColumn(matrix,j));
        }
    }
    static double sumColumn(double[][] m , int columnIndex){
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += m[i][columnIndex];
        }
        return sum;

    }
}
