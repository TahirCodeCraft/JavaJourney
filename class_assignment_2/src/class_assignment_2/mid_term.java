
package class_assignment_2;
import java.util.Scanner;
// create a credit card number by some restriction

public class mid_term {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a credit card number as a long integer :");
        long num = input.nextLong();
        if (isValid(num)==true) {           
            System.out.println(num +" is valid" );
        }    
        else{
            System.out.println(num+" is invalid");
        }    
    }  
    public static boolean isValid(long num){ 
        return ((getSize(num)>=13 && getSize(num)<=16) && (prefixMatched(num, 4) || prefixMatched(num, 5) || prefixMatched(num, 37) || prefixMatched(num, 6)) && ((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0));        
    }
    public static int getSize(long d){
        String str_num = String.valueOf(d);
        return str_num.length();
    }
    public static int sumOfDoubleEvenPlace(long num){
        String str_num = String.valueOf(num);
        int sum_even = 0;
        for (int i =str_num.length() - 2; i >= 0; i -= 2){
            sum_even += getDigit(Character.getNumericValue(str_num.charAt(i))*2);
        }         
        return sum_even;
    }   
    public static int getDigit(int num){  
        if (num >= 10){
            return num / 10 + num % 10;
        }    
        else{
            return num;
        }    
    }
    public static int sumOfOddPlace(long num){
        String str_num = String.valueOf(num);
        int sum_odd = 0;
        for (int i = str_num.length() - 1; i >= 0; i -= 2){
            sum_odd += Character.getNumericValue(str_num.charAt(i));
        }    
        return sum_odd;
    }
    public static boolean prefixMatched(long num, int d){
        boolean is_Match=false;
        if(d!=37){
            if(d==getPrefix(num, 0)){
                is_Match=true;
            }
        }
        else if(d==37){
            if(d/10 ==getPrefix(num, 0) && d%10 ==getPrefix(num, 1)){
                is_Match=true;
            }
        }
        return is_Match;
    }
    public static long getPrefix(long num, int k){
        String str_num = String.valueOf(num);
        return Character.getNumericValue(str_num.charAt(k));        
    }
}
