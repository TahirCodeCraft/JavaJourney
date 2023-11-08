
package class_assignment_2;
// printing leap year between 101 to 2100
public class question_4 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 101; i <= 2100; i++ ){
//            for leap year checking
            if ( i % 400 == 0 || ( i % 4 == 0 && i % 100 != 0)){
                System.out.print(i + " ");
                num++;
                if ( num % 10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("\nNumber of leap years is " + num);
    }    
}
