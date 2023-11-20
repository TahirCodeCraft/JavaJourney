package lab_assignment_2;
import java.util.Scanner;
// convert first word capital of enter word
public class question_3 {
    public static void main(String[] args) {
        System.out.println("Enter the word you want to capitalize first word: ");
        Scanner input= new Scanner(System.in);
        String word=input.nextLine();
        System.out.println(capitalize(word));
    }
    static String capitalize(String word){
        char capital= Character.toUpperCase(word.charAt(0));
        String capitalize="";
        capitalize+=capital;
        for (int i=1; i<word.length(); i++){
            capitalize+=word.charAt(i);
        }
        return capitalize;
    }
}