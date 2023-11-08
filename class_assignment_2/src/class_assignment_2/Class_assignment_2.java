package class_assignment_2;
import java.util.Scanner;
// printing first 50 prime numbers


public class Class_assignment_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("FIRST 50 PRIME NUMBERS ARE");
    int count=0;
    int a = 2;
    while(true){
        if (isPrime(a)==true){
            System.out.printf(a+" ");
            count++;
            if(count%10==0){
                System.out.println();
            }
        }
        a++;
        if(count==50){
            break;
        }
    }
}
    
static boolean isPrime(int num){
    boolean prime=true;
    if (num>2) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
    }
    return prime;
}
}