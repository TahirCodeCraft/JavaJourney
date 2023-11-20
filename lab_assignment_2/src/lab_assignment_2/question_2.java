package lab_assignment_2;
import java.util.Scanner;

// finding enter year every month first day

public class question_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=input.nextInt();
        System.out.println("Enter first day of the year in integer: (e.g: 1 for monday, 2 for tuesday, 3 for wednesday, 4 for thursday, 5 for friday, 6 for saturday, 7 for sunday ");
        int day=input.nextInt();
        String month="";
        String firstDay="";
        input.close();
        for (int i=1; i<=12; i++){
            switch(i){
                case 1:
                    month="january";
                    break;
                case 2:
                    month="feburary";
                    if((year%4==0 && year%100!=0) || year%400==0 ){
                        day+=29;
                    }
                    else{
                        day+=28;
                    }
                    break;
                case 3:
                    month="march";
                    day+=31;
                    break;
                case 4:
                    month="april";
                    day+=30;
                    break;
                case 5:
                    month="may";
                    day+=31;
                    break;
                case 6:
                    month="june";
                    day+=30;
                    break;
                case 7:
                    month="july";
                    day+=31;
                    break;
                case 8:
                    month="august";
                    day+=31;
                    break;
                case 9:
                    month="september";
                    day+=30;
                    break;
                case 10:
                    month="octber";
                    day+=31;
                    break;
                case 11:
                    month="novemeber";
                    day+=30;
                    break;
                case 12:
                    month="december";
                    day+=31;
                    break;
            }
            while(day>7)
                day%=7;
            if(day==1)
                firstDay="Monday";
            else if(day==2)
                firstDay="Tuesday";
            else if(day==3)
                firstDay="Wedenesday";
            else if(day==4)
                firstDay="Thursday";
            else if(day==5)
                firstDay="Friday";
            else if(day==6)
                firstDay="Saturday";
            else if(day==7)
                firstDay="Sunday";
            System.out.printf("%s 1, %d %s%n",month,year,firstDay);
        }
        
    }
}
