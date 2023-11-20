
package lab.assignment.pkg1;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of room in feet");
        double length_room = input.nextDouble();
        System.out.println("Enter the width of room in feet");
        double width_room = input.nextDouble();
        System.out.println("Enter the height of room in feet");
        double height_room = input.nextDouble();
        System.out.println("Enter the width of door in feet");
        double width_door = input.nextDouble();
        System.out.println("Enter the height of door in feet");
        double height_door = input.nextDouble();
        System.out.println("Enter the width of 1st window in feet  ");
        double width_window1 = input.nextDouble();
        System.out.println("Enter the height of 1st window in feet ");
        double height_window1 = input.nextDouble();
        System.out.println("Enter the width of 2nd window in feet  ");
        double width_window2 = input.nextDouble();
        System.out.println("Enter the height of 2nd window in feet ");
        double height_window2 = input.nextDouble();
        System.out.println("Enter the width of bookshelf in feet");
        double width_bookshelf = input.nextDouble();
        System.out.println("Enter the height of bookshelf in feet");
        double height_bookshelf = input.nextDouble();
        System.out.println("Enter the cost, per square foot, of painting the walls");
        double p_c = input.nextDouble();
        System.out.println("Enter the cost, per square foot, of installing carpet");
        double c_c = input.nextDouble();
        double substract_area = (width_window1 * height_window1) + (width_window2 * height_window2) + (width_door * height_door) + (width_bookshelf * height_bookshelf);
        double wall_area = (2 * (width_room * height_room) + 2 * (length_room * height_room));
        double painting_cost = (wall_area - substract_area ) * p_c;
        double carpet_cost = (width_room * length_room) * c_c;
        System.out.println("The cost of painting the wall is : "+painting_cost+" PKR ");
        System.out.println("The cost of installing the carpet is : "+carpet_cost + " PKR ");        
    }
}
