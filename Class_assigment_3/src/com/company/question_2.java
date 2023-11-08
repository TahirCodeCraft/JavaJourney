package com.company;

public class question_2 {
    public static void main(String[] args) {
        char[] arr = {'a','b','a','c','b','c'};
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (char e:arr
             ) {
            System.out.print(e+",");
        }
    }
}
