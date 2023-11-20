
package lab.assignment.pkg1;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int first=0;
        int second=1;
        for (int i=1;i<=num/2;i++){
            System.out.printf("%5s %5s",first,second);
            first=second+first;
            second=first+second;
            if(i*2 % 20 == 0){
                System.out.println();
            }
        
        }
    }
}