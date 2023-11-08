
package class_assignment_2;
import java.util.Random;

// making plate number of car
public class question_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstCharacter = rand.nextInt(25)+65;
        int secondCharacter = rand.nextInt(25)+65;
        int thirdCharacter = rand.nextInt(25)+65;
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10);
        int n3 = rand.nextInt(10);
        int n4 = rand.nextInt(10);       
        System.out.println((char)(firstCharacter) +""+ (char)(secondCharacter) +""+ (char)(thirdCharacter) +" "+ n1 +""+ n2 +""+ n3 +""+ n4);
        int num = rand.nextInt(3)+23;
        System.out.println(num);
    }
    
}
