package com.company;
import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of total students ");
        int row = input.nextInt();
        System.out.println("Enter number of all subjects ");
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
                    System.out.println("Enter marks of subject " + (j + 1) + " of student: " + (i + 1));
                    matrix[i][j] = input.nextDouble();
            }
        }
        for (double[] e : matrix) {
            for (double f:e) {
                System.out.printf("%5s",f);
            }
            System.out.println();
        }
        System.out.println("""
                Enter a number to choose menu:
                1 for calculates total/sum of the values in the specified row.
                2 for calculates Average of the values in the specified column.
                3 for find highest value in the specified row of the array.
                4 for find lowest value in the specified row of the array""");
        switch (input.nextInt()) {
            case 1: {
                System.out.println("Enter row number to get its sum");
                int spRow = input.nextInt()-1;
                System.out.println("Total/sum of the values in the specified row: " + totalMarks(matrix,spRow));
                break;
            }
            case 2: {
                System.out.println("Enter column number to get its average");
                int spColumn = input.nextInt()-1;
                System.out.println("Calculates average of the values in the specified column: " + avgMarks(matrix,spColumn));
                break;
            }
            case 3: {
                System.out.println("Enter row number to get highest marks");
                int spRow = input.nextInt()-1;
                double[] value = highestMarks(matrix,spRow);
                System.out.println("The subject name of highest value is: " + value[1]);
                break;
            }
            case 4: {
                System.out.println("Enter row number to get lowest marks");
                int spRow = input.nextInt()-1;
                double[] value = lowestMarks(matrix,spRow);
                System.out.println("The subject name of lowest value is: " + value[1]);
                break;
            }
            default: {
                System.out.println("Enter wrong number");
                break;
            }
        }
    }
    public static double totalMarks(double[][] matrix,int a){
        double sum = 0;
        for (int i = 0; i<matrix[a].length; i++) {
            sum += matrix[a][i];
        }
        return sum;
    }
    public static double avgMarks(double[][] matrix,int a){
        double average = 0;
        for (int i = 0; i<matrix.length; i++) {
            average += matrix[i][a];
        }
        return average/matrix.length;
    }
    public static double[] highestMarks(double[][] matrix,int a){
        double[] arr = new double[2];
        arr[0] = matrix[a][0];
        arr[1] = 1;
        for (int i = 0; i<matrix[a].length; i++) {
            if (matrix[a][i]>arr[0]) {
                arr[0] = matrix[a][i];
                arr[1] = i+1;
            }
        }
        return arr;
    }
    public static double[] lowestMarks(double[][] matrix,int a){
        double[] arr = new double[2];
        arr[0] = matrix[a][0];
        arr[1] = 1;
        for (int i = 0; i<matrix[a].length; i++) {
            if (matrix[a][i]<arr[0]) {
                arr[0] = matrix[a][i];
                arr[1] = i+1;
            }
        }
        return arr;
    }
}
