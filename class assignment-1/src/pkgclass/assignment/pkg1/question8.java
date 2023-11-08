package pkgclass.assignment.pkg1;
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for today’s day of the week");
        int first = input.nextInt();
        System.out.print("Enter the number of days after today for a future day");
        int after = input.nextInt();

        int getDay = (first + after) % 7;
        String today = "";

        switch(first){
            case 0: today = "Sunday";
                    break;
            case 1: today = "Monday";
                    break; 
            case 2: today = "Tuesday";
                    break;
            case 3: today = "Wednesday";
                    break;
            case 4: today = "Thursday";
                   break;
            case 5: today = "Friday";
                    break;
            case 6: today = "Saturday";
                    break;
        }

        if (getDay == 0){
            System.out.println("Todays is "+ today + " and the future day is Sunday");
        }else if(getDay == 1){
            System.out.println("Todays is "+ today +" and the future day is Monday" );
        }else if(getDay == 2){
            System.out.println("Todays is "+ today +" and the future day is Tuesday" );
        }else if(getDay == 3){
            System.out.println("Todays is "+ today +" and the future day is Wednesday" );
        }else if(getDay == 4){
            System.out.println("Todays is "+ today +" and the future day is Thursday" );
        }else if(getDay == 5){
            System.out.println("Todays is "+ today +" and the future day is Friday" );
        }else if(getDay == 6){
            System.out.println("Todays is "+ today +" and the future day is Saturday" );
        }
    }
}