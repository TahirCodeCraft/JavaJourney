package com.company;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and column of matrix 1");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        System.out.println("Enter rows and column of matrix 2");
        int r2 = input.nextInt();
        int c2 = input.nextInt();
        if (c1 == r2){
            System.out.println("Enter integers in matrix 1 in row sequence");
            int[][] m1= new int[r1][c1];
            for (int i=0; i<r1; i++){
                for (int j=0; j<c1; j++){
                    m1[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter integers in matrix 2 in row sequence");
            int[][] m2= new int[r2][c2];
            for (int i=0; i<r2; i++){
                for (int j=0; j<c2; j++){
                    m2[i][j] = input.nextInt();
                }
            }
            int[][] result = new int[r1][c2];
            for (int i=0; i<r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k=0; k<c1; k++) {
                        result[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices is ");
            for (int[] e:result) {
                for (int f: e
                     ) {
                    System.out.print(f+" ");
                }
                System.out.println("");
        }
        }
        else{
            System.out.println("Sorry multiplication is not possible because columns of matrix 1 and rows of matrix 2 is not equal.");
        }
    }
}
