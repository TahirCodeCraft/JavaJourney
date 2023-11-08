
package class_assignment_2;
// converting decimal to binary number
import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number to convert in java: ");
        int decimal= input.nextInt();
        String binary="";
        while (decimal!=0){
            if(decimal%2==0){
                binary=0+binary;
            }
            else{
                binary=1+binary;
            }
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
}
