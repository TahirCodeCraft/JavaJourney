package pkgclass.assignment.pkg1;
import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer");
        int b = sc.nextInt();
        System.out.println("Enter 3rd integer");
        int c = sc.nextInt();
        if (a<b & b<c)
            System.out.println(a+" "+b+" "+c);
        else if (b<c & c<a)
            System.out.println(b+" "+c+" "+a);
        else if (c<a & a<b)
            System.out.println(c+" "+a+" "+b);
        else if (a<c & c<b)
            System.out.println(a+" "+c+" "+b);
        else if (b<a & a<c)
            System.out.println(b+" "+a+" "+c);
        else if (c<b & b<a)
            System.out.println(c+" "+b+" "+a);
        else if (a == b){
            if (a<c)
                System.out.println(a+" "+b+" "+c);
            else if (c<a)
                System.out.println(c+" "+a+" "+b);                    
        }
        else{
            if(c<b)
                System.out.println(c+" "+a+" "+b);
            else if(b<c)
                System.out.println(b+" "+c+" "+a);
        }
        
        
    }
}
