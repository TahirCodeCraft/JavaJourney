
package lab.assignment.pkg1;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check");
        int n = input.nextInt();
        System.out.println("Is "+ n +" divisible by 5 and 6?");
        System.out.println(n%5==0 && n%6==0);
        System.out.println("Is "+n+" divisible by 5 or 6?");
        System.out.println(n%5==0 || n%6==0);
        System.out.println("Is "+n+" divisible by 5 or 6, but not both?");
        System.out.println((n%5!=0 || n%6!=0)&&(n%5==0 || n%6==0));
    }
}
