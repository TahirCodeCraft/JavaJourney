/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_assignment_2;
import java.util.Scanner;
/**
 *
 * @author AZAN Laptop Store
 */
public class practice2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long num= input.nextLong();
        if (isValid(num)){
            System.out.println(num + " is valid");
        }else{
            System.out.println(num + " is invalid");
        }
    }
    public static boolean isValid(long num){
        boolean valid=false;
        boolean conditionOne;
        boolean conditionTwo;
        boolean conditionThree;
        if (getSize(num)<=16 && getSize(num)>=13){
            conditionOne=true;
        }else{
            conditionOne=false;
        }
        if ((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num))%10==0){
            conditionTwo=true;
        }else{
            conditionTwo=false;
        }
        if(prefixMatched(num, 4) || prefixMatched(num, 5) || prefixMatched(num, 6) || prefixMatched(num, 37)){
            conditionThree=true;
        }else{
            conditionThree=false;
        }
        if(conditionOne && conditionTwo && conditionThree){
            valid=true;
        }
        return valid;
    }
    public static int sumOfDoubleEvenPlace(long num){
        String number= String.valueOf(num);
        int length= number.length();
        int sumEven=0;
        int currDigit;
        for(int i=length-2; i>=0; i-=2){
            currDigit= Character.getNumericValue(number.charAt(i))*2;
            if(currDigit>=10){
                sumEven+=getDigit(currDigit);
            }else{
                sumEven+=currDigit;
            }
        }
        return sumEven;
    }
    public static int getDigit(int num){
        int sumOfCurrDigit= num%10 + num/10;
        return sumOfCurrDigit;
    }
    public static int sumOfOddPlace(long num){
        String number= String.valueOf(num);
        int length= number.length();
        int sumOdd=0;
        int currDigit;
        for(int i=length-1; i>=0; i-=2){
            currDigit= Character.getNumericValue(number.charAt(i));
            sumOdd+=getDigit(currDigit);
        }
        return sumOdd;
    }
    public static boolean prefixMatched(long num, int n){
        boolean isMatch=false;
        if(n!=37){
            if(n==getPrefix(num, 0)){
                isMatch=true;
            }
        }else if(n==37){
            if(n/10 ==getPrefix(num, 0) && n%10 ==getPrefix(num, 1)){
                isMatch=true;
            }
        }
        return isMatch;
    }
    public static long getPrefix(long num, int k){
        String number= String.valueOf(num);
        return Character.getNumericValue(number.charAt(k));
    }
    public static int getSize(long num){
        String number= String.valueOf(num);
        int length=number.length();
        return length;
    }
}
