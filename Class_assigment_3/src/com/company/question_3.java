package com.company;
import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many integers you want to enter");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Enter integers in array.");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("""
                Enter a number to choose menu :
                1 : for count the occurrences of x in arr[].
                2 : for all smaller elements are before your enter number and put all greater elements after your enter number.
                3 : for calculate frequencies of all the elements and display them.
                4 : for replace every element of the array by the sum of next two consecutive elements.
                5 : for shifts an array circularly left by two positions.""");
        switch (input.nextInt()) {
            case 1: {
                System.out.print("Enter number you want to count their occurrences : ");
                int num = input.nextInt();
                System.out.println(num + " occurs : " + count(num, arr) + " times ");
                break;
            }
            case 2: {
                System.out.println("Enter number you want to place in such way that all smaller number place before it and greater number place after it.");
                for (int e : partition(arr)
                ) {
                    System.out.print(e + ",");
                }
                break;
            }
            case 3: {
                frequencies(arr);
                break;
            }
            case 4: {
                System.out.println("circular Arry is : ");
                for (int e : circular(arr)) {
                    System.out.print(e + ",");
                }
                break;
            }
            case 5: {
                System.out.println("Shiftcircular Arry is : ");
                for (int e : shiftCircular(arr)
                ) {
                    System.out.print(e + ",");
                }
                break;
            }
        }
    }
    static int count(int searchNum,int[]arr){
        int count = 0;
        for (int e:arr) {
            if (searchNum == e)
                count++;
        }
        return count;
    }
    static int[] partition(int[]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static void frequencies(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int occur = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    occur++;
                    i++;
                }
            }
            System.out.println(arr[i] + " occurs " + occur + " times");
        }
    }
    static int[] circular(int[] arr){
        int[] circularArr = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if (i< arr.length-2) {
                circularArr[i] = arr[i + 1] + arr[i + 2];
            }
            else if (i< arr.length-1){
                circularArr[i]= arr[i+1]+arr[(arr.length-2)-i];
            }
            else{
                circularArr[i]= arr[(arr.length-1)-i]+arr[(arr.length)-i];
            }
        }
        return circularArr;
    }
    static int[] shiftCircular(int[] arr){
        int[] shiftCircularArr = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if (i< arr.length-2) {
                shiftCircularArr[i] = arr[i + 2];
            }
            else if (i< arr.length-1){
                shiftCircularArr[i]= arr[(arr.length-2)-i];
            }
            else{
                shiftCircularArr[i]=arr[(arr.length)-i];
            }
        }
        return shiftCircularArr;
    }
}
