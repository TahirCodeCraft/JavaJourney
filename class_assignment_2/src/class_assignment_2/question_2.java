
package class_assignment_2;
import java.util.Scanner;
// finding one string is a substring of other string
public class question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String string_1 = input.nextLine();
        System.out.println("Enter string s2:");
        String string_2 = input.nextLine();
        if (string_1.contains(string_2)){
            System.out.println(string_2 + " is a substring of " + string_1);
        }
        else {
            System.out.println(string_2 + " is not a substring of " + string_1);
        }
    }    
}
