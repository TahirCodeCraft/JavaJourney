package lab_assignment_2;

// printing of paramit (triangle)
public class question_1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            int num = 1;
            for (int j= 7; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(num + " ");
                num *= 2;
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(num + " ");
                num /= 2;
            }

            System.out.println("");
        }
    }
}
