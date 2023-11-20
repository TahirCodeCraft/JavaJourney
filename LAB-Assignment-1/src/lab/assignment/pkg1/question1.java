package lab.assignment.pkg1;
import java.util.Scanner;

// stock operations

public class question1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Input the number of shares sold");
         int share_sold = input.nextInt();
         int n = share_sold;
         double y = 0;
         double z= 0;
         for (int a;share_sold>=1;share_sold--){
             System.out.println("Input the purchase price of each share (Press enter after each)");
             double purchase_price = input.nextDouble();
             y = y + purchase_price;
         }
         for (int b;n>=1;n--){
             System.out.println("Input the selling price of each share(Press enter after each)");
             double selling_price = input.nextDouble();
             z = z + selling_price;
         }
         double service_charges = (y+z)*0.015;
         System.out.println("The total amount invested is : "+ y);
         System.out.println("The total service charges is : "+service_charges);
         double lost_amount = y-z;
         double amount_gained = z-y;
         if (y>z)
             System.out.println("The lost amount is : " +lost_amount);
         else
             System.out.println("The amount gained is : " + amount_gained);
         System.out.println("The amount received after selling the stock is : "+z);
             
    }
}
