package Lesson1_Variables_Data_types_Operators_If_else_Homework;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first of tow numbers: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert second of tow numbers: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int percentDivide = firstNumber % secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference of the numbers is: " + difference);
        System.out.println("The multiply of the numbers is: " + multiply);
        System.out.println("The percent divide ot the numbers is: " + percentDivide);
        System.out.println("The divide of the numbers is: " + divide);
    }
}
