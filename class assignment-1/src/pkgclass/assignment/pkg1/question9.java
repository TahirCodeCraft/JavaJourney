package pkgclass.assignment.pkg1;
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();
        int d5 = sc.nextInt();
        int d6 = sc.nextInt();
        int d7 = sc.nextInt();
        int d8 = sc.nextInt();
        int d9 = sc.nextInt();
        int d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
        if (d10<10)
            System.out.printf("The ISBN-10 number is %s%s%s%s%s%s%s%s%s%s",d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
        else
             System.out.printf("The ISBN-10 number is %s%s%s%s%s%s%s%s%sX",d1,d2,d3,d4,d5,d6,d7,d8,d9);
        
    }
}
