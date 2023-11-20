
package lab.assignment.pkg1;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number (1 to 8) of row where king is present");
        int present_row = input.nextInt();
        System.out.println("Enter the number (1 to 8)  of column where king is present");
        int present_column = input.nextInt();
        System.out.println("Enter the number (1 to 8)  of new row where king is move");
        int change_row = input.nextInt();
        System.out.println("Enter the number (1 to 8) of new column where king is move");
        int change_column = input.nextInt();
        if(present_row<=8 && change_row<=8 && present_column<=8 && change_column<=8){
            if ((change_row == present_row || change_row - 1 == present_row || change_row + 1 ==  present_row ) && (change_column == present_column || change_column - 1 == present_column || change_column + 1 == present_column))
                System.out.println("YES");
            else
                System.out.println("NO");   
        }
        else
            System.out.printf("Your input is invalid.%nPlease enter the number (1 to 8)%n");
    }   
}
