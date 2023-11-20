
package lab_assignment_2;
import java.util.Scanner;

// printing entered order matrix

public class question_4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num= input.nextInt();
        printMatrix(num);
    }
    public static void printMatrix(int n){
        for(int i =1; i<=n; i++){
            for(int j=1;j<=n;j++){
                int rand=(int) Math.round( Math.random());
                System.out.printf("%3d",rand);
            }
            System.out.println();
        }
    }
    
}