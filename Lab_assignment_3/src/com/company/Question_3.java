package com.company;
import java.util.Scanner;

//finding lowest and highest value in the array

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integer you want to enter");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        for (int i=0; i<arrLength; i++){
            arr[i] = input.nextInt();
        }
        for (int i=0; i<arrLength; i++){
            for (int j=i+1; j<arrLength; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int minDifference = arr[1] - arr[0];
        int minpair = 0;
        for (int i=1; i<arrLength; i++){
            if (i<arrLength-1) {
                if (arr[i + 1] - arr[i] < minDifference) {
                    minDifference = arr[i + 1] - arr[i];
                    minpair = i;
                }
            }
        }
        int min = arr[0];
        int max = arr[arrLength-1];
        int maxDifference= max - min;
        System.out.println("Pair of "+arr[0]+","+arr[arrLength-1]+" have max difference which is : " +maxDifference);
        System.out.println("Pair of "+arr[minpair]+","+arr[minpair+1]+" have min difference which is : " +minDifference);
    }
}
