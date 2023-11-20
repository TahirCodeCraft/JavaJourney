package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String [] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter number of employees : ");
        int num= input.nextInt();
        int [][] employee= new int[num][7];
        System.out.println();
        //filling array
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee[0].length; j++) {
                System.out.println("Enter working hours of employee "+ (i+1) + " of "+ days[j]);
                employee[i][j]=input.nextInt();
            }
        }
        System.out.printf("               Su  M   T   W   Th  F   Sa");
        System.out.println();
        for (int i = 0; i < employee.length; i++) {
            System.out.print("Employee " + i + ": ");
            for (int j = 0; j < employee[0].length; j++) {
                System.out.printf("%4d",employee[i][j]);

            }
            System.out.println();
        }
        // printing total working hours of each employee
        System.out.println("TOTAL WORKING HOURS OF EACH EMPLOYEE : ");
        for (int i = 0; i < employee.length; i++) {
            int totalHours=0;
            for (int j = 0; j < employee[0].length; j++) {
                totalHours+=employee[i][j];
            }
            System.out.println("Total working hours of employee " +i+ " are "+ totalHours );
        }
    }

}
