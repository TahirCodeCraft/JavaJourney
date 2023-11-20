package com.company;
import java.io.*;
import java.util.Scanner;

// making menu for the some
// operation
public class Question_1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many String you want to enter");
        int arrLength = input.nextInt();
        String[] names = new String[arrLength];
        for (int i=0; i<arrLength; i++){
            names[i] = stdin.readLine();
        }
        System.out.println("""
                Enter a number to choose menu :
                1 : for calculate length of string.
                2 : for count number of words in string.
                3 : for check a string is palindrome or not.
                4 : for find a word within the array. If found display its starting position.
                5 : for convert a string in lowercase.
                6 : for convert a string in uppercase.""");
        switch (input.nextInt()){
            case 1:{
                for (int i=0; i<arrLength; i++){
                    System.out.println(names[i]+" string length is "+length(names,i));
                }
                break;
            }
            case 2:{
                for (int i=0; i<arrLength; i++){
                    System.out.println("There are "+count(names,i)+" words in string : "+names[i]);
                }
                break;
            }
            case 3:{
                for (int i=0; i<arrLength; i++){
                    if (palindrome(names,i) == true) {
                        System.out.println(names[i] + " string is palindrome ");
                    }
                    else {
                        System.out.println(names[i] + " string is not palindrome ");
                    }
                }
                break;
            }
            case 4: {
                System.out.println("Enter word you want to search");
                String word = stdin.readLine();
                wordFinder(names,word);
                break;
            }
            case 5:{
                for (int i=0; i<arrLength; i++){
                    System.out.println(names[i]+" string in Lowercase is : "+lowerCase(names,i));
                }
                break;
            }
            case 6:{
                for (int i=0; i<arrLength; i++){
                    System.out.println(names[i]+" string in Uppercase is : "+upperCase(names,i));
                }
                break;
            }
        }
    }
    static int length(String[] names,int a){

        return names[a].length();
    }
    static int count(String[] names,int a){
        char[] arr = names[a].toCharArray();
        int count=1;
        for (int i=0;i< arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        return count;
    }
    static boolean palindrome(String[] names,int a ){
        boolean b= true;
        char[] arr = names[a].toCharArray();
        for (int j=0,k=arr.length-1; j<k; j++,k--){
            if (arr[j] != arr[k]){
                b = false;
            }
        }
        return b;
    }
    static void wordFinder(String[] names, String word){
        boolean a=false;
        for (int i=0; i<names.length;i++) {
            if (names[i].equals(word)) {
                System.out.println(word + " word found and its position is " + (i+1));
                a=true;
                break;
            }
        }
        if (a==false){
            System.out.println(word+ " not found ");
        }
    }
    static String lowerCase(String[] names,int a){

        return names[a].toLowerCase();
    }
    static String upperCase(String[] names,int a){

        return names[a].toUpperCase();
    }
}

