package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of students :");
        int numStu=input.nextInt();
        System.out.println("Enter number of Subjects");
        int numSub= input.nextInt();
        int sheet[][]= new int[numStu][numSub];
        for(int i=0; i<sheet.length;i++){
            for (int j = 0; j < sheet[0].length; j++) {
                System.out.println("Enter marks of student "+ (i+1) + " in subject "+ (j+1));
                sheet[i][j]=input.nextInt();
            }
        }
        for(int i=0; i<sheet.length;i++){
            for (int j = 0; j < sheet[0].length; j++) {
                System.out.print(sheet[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("WHICH OPERTAION YOU WANT TO APPLY :");
        System.out.println("1) CALCULATE TOTAL MARKS OF STUDENT ");
        System.out.println("2) CALCULATE AVERAGE MARKS OF STUDENT IN PARTICULAR SUBJECT");
        System.out.println("3) SUBJECT IN WHICH STUDENT GOT HIGHEST MARKS ");
        System.out.println("4) SUBJECT IN WHICH STUDENT MINIMUM MARKS");
        int option= input.nextInt();
        if (option==1){
            System.out.println("Enter the student number whose total marks you want to know :");
            int stuNum=input.nextInt();
            System.out.println("Total marks of student "+stuNum+ " are "+ totalMarks(sheet, stuNum));
        }else if(option==2){
            System.out.println("Enter the subect number whose average marks you want to know :");
            int subNum=input.nextInt();
            System.out.println("Average marks of students in subject "+subNum+ " are "+ avgMarks(sheet, subNum));
        }else if(option==3){
            System.out.println("Enter the student number whose highest subject marks you want to know :");
            int stuNum=input.nextInt();
            System.out.println("Student  "+stuNum+ " hightes marks in subject "+ highestMarks(sheet, stuNum));
        }else if(option==4){
            System.out.println("Enter the student number whose highest subject marks you want to know :");
            int stuNum=input.nextInt();
            System.out.println("Student  "+stuNum+ " lowest marks in subject "+ lowestMarks(sheet, stuNum));
        }else{
            System.out.println("WRONG INPUT");
        }
    }
    public static int totalMarks(int [][]arr, int stuNum) {
        int total=0;
        for (int i : arr[stuNum-1]) {
            total+=i;
        }
        return total;
    }
    public static double avgMarks(int [][]arr, int subNum) {
        int total=0;
        for (int i=0;i<arr.length;i++) {
            total+=arr[i][subNum-1];
        }
        System.out.println(total);
        double avg=total/(arr[0].length);
        return avg;
    }
    public static int highestMarks(int [][]arr, int stuNum) {
        int highSub=0;
        int highIndex=0;
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[stuNum-1][i]>highSub){
                highSub=arr[stuNum-1][i];
                highIndex=i;
            }
        }
        highIndex+=1;
        return highIndex;
    }
    public static int lowestMarks(int [][]arr, int stuNum) {
        int lowSub=arr[stuNum-1][0];
        int lowIndex=0;
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[stuNum-1][i] < lowSub){
                lowSub=arr[stuNum-1][i];
                lowIndex=i;
            }
        }
        lowIndex+=1;
        return lowIndex;
    }



}