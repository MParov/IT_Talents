import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        } else {
            System.out.println(secondNumber + " " + firstNumber);
        }
    }
}
