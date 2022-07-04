import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid number!");
        } else {
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number;

            if (firstDigit == secondDigit && secondDigit == thirdDigit) {
                System.out.println("The digits are equals!");
            } else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
                System.out.println("The digits are in ascending order!");
            } else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
                System.out.println("The digits are in descending order!");
            } else {
                System.out.println("The digits are unordered!");
            }
        }
    }
}
