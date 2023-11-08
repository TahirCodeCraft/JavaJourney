package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter which number you want to factorial");
        System.out.println("The factorial is "+ factorial(n));
        int w = input.nextInt();
        System.out.println(sum(w));
        System.out.println(sum(w,w));
        System.out.println(sum(w,w,w));
        System.out.println(sum(w,w,w,w));
    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int sum (int a){
        return a;
    }
    static int sum (int a,int b){
        return a+b;
    }
    static int sum (int a,int b,int c){
        return a+b+c;
    }
    static int sum (int a,int b,int c,int d){
        return a+b+c+d;
    }
}
