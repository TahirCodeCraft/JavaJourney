package class_assignment_2;
import java.util.Scanner;

// finding largest string by ascii code of alphabet

public class practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s[] = new String[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Enter a string");
            s[i] = input.next();
        }
        String largest = s[0];
        for (int x = 0; x < 9; x++) {
            int n = (largest.compareTo(s[x]));
            if (n < 0) {
                largest = s[x];
            }
        }
        System.out.println("largest string is : " + largest);
    }
}
