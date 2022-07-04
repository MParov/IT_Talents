import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Please insert second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Please insert third number: ");
        double thirdNumber = scanner.nextDouble();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else if (thirdNumber > secondNumber && secondNumber > firstNumber) {
            System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
        } else if (secondNumber > firstNumber && firstNumber > thirdNumber) {
            System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
        } else if (secondNumber > thirdNumber && thirdNumber > firstNumber) {
            System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
        } else if (firstNumber > thirdNumber && thirdNumber > secondNumber) {
            System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
        } else {
            System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
        }
    }
}
