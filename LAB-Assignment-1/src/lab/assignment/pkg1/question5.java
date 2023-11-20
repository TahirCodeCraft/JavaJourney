
package lab.assignment.pkg1;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your name:"); 
        String name = input.nextLine(); 
        System.out.println("Enter your gross pay:"); 
        double gross_amount = input.nextDouble(); 
        double federal_tax = 0.15 * gross_amount; 
        double state_tax = 0.035 * gross_amount; 
        double social_security = 0.0575 * gross_amount; 
        double medicare_tax = 0.0275 * gross_amount; 
        double pension_plan = 0.05 * gross_amount; 
        double health_insurance = 75; 
        double net_pay = gross_amount - (federal_tax + state_tax + social_security + medicare_tax + pension_plan + health_insurance);
        System.out.printf("%s %nGross Pay:              $ %9.2f%n",name,gross_amount ); 
        System.out.printf("Federal Tax:            $ %9.2f%n",federal_tax ); 
        System.out.printf("State Tax:              $ %9.2f%n",state_tax ); 
        System.out.printf("Social Security Tax:    $ %9.2f%n",social_security ); 
        System.out.printf("Medicare/Medicaid Tax:  $ %9.2f%n",medicare_tax ); 
        System.out.printf("Pension Plan:           $ %9.2f%n",pension_plan); 
        System.out.printf("Health Insurance:       $ %9.2f%n",health_insurance ); 
        System.out.printf("Net Pay:                $ %9.2f%n",net_pay ); 
    } 
}
