
package pkgclass.assignment.pkg1;
import java.util.Random;

public class question6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(12)+1;
        if (num == 1)
            System.out.println("The number is "+num+" and month is January");
        else if (num == 2)
            System.out.println("The number is "+num+" and month is February");
        else if (num == 3)
            System.out.println("The number is "+num+" and month is March");
        else if (num == 4)
            System.out.println("The number is "+num+" and month is April");
        else if (num == 5)
            System.out.println("The number is "+num+" and month is May");
        else if (num == 6)
            System.out.println("The number is "+num+" and month is June");
        else if (num == 7)
            System.out.println("The number is "+num+" and month is July");
        else if (num == 8)
            System.out.println("The number is "+num+" and month is August");
        else if (num == 9)
            System.out.println("The number is "+num+" and month is September");
        else if (num == 10)
            System.out.println("The number is "+num+" and month is October");
        else if (num == 11)
            System.out.println("The number is "+num+" and month is November");
        else
            System.out.println("The number is "+num+" and month is December");
    }
}
