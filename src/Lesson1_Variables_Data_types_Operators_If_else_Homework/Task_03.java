import Lesson1_Variables_Data_types_Operators_If_else_Homework;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int secondNumber = scanner.nextInt();

        int transferNumber = firstNumber;

        firstNumber = secondNumber;
        secondNumber = transferNumber;

        System.out.println("The new first number is: " + firstNumber);
        System.out.println("The new second number is: " + secondNumber);
    }
}
