package class_assignment_2;
import java.util.Scanner;

// checking social security number is valid or not

public class question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Social Security Number in format DDD-DD-DDDD e.g. 232-23-5435");
        String securityNumber = input.nextLine();
        int numLength= securityNumber.length();
        if (numLength == 11 && securityNumber.indexOf("-") == 3 && securityNumber.lastIndexOf("-") == 6){
            if (Character.isDigit(securityNumber.charAt(0))&& Character.isDigit(securityNumber.charAt(1)) && Character.isDigit(securityNumber.charAt(2)) && Character.isDigit(securityNumber.charAt(4))&& Character.isDigit(securityNumber.charAt(5)) && Character.isDigit(securityNumber.charAt(7)) && Character.isDigit(securityNumber.charAt(8))&& Character.isDigit(securityNumber.charAt(9)) && Character.isDigit(securityNumber.charAt(10))) {
            System.out.println(securityNumber + " is a valid social security number.");
            }
            else{
                System.out.println(securityNumber + " is an invalid social security number.");
            }
        }
        else {
            System.out.println(securityNumber + " is an invalid social security number.");
        }
    }
}
