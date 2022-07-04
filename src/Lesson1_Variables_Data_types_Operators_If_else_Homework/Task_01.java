package Lesson1_Variables_Data_types_Operators_If_else_Homework;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the number A: ");
        double a = scanner.nextDouble();
        System.out.print("Please insert the number B: ");
        double b = scanner.nextDouble();
        System.out.print("Please insert the number C: ");
        double c = scanner.nextDouble();

        if (c > a && c < b) {
            System.out.println("The number " + c + " is between " + a + " and " + b);
        } else if (c == a) {
            System.out.println("The number " + c + " is equals of number " + a);
        } else if (c == b) {
            System.out.println("The number " + c + " is equals of number " + b);
        } else if (c > a && c > b) {
            System.out.println("The number " + c + " is bigger of numbers " + a + " and " + b);
        } else {
            System.out.println("The number " + c + " is smaller of numbers " + a + " and " + b);
        }

    }
}
