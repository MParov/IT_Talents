import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 30000) {

            int round = 0;
            boolean isPalindrome = true;
            int numberLength = 0;
            do {

                if (number < 100) {
                    numberLength = 2;
                } else if (number < 1000) {
                    numberLength = 3;
                } else if (number < 10000) {
                    numberLength = 4;
                } else {
                    numberLength = 5;
                }

                int power = (int) Math.pow(10, numberLength - 1);

//                int power = 1;
//                for (int i = 0; i < numberLength - 1; i++) {
//                    power *= 10;
//                }

                int firstDigit = number / power;
                int secondDigit = number % 10;

                number %= power;
                number /= 10;

                if (firstDigit != secondDigit) {
                    isPalindrome = false;
                    break;
                }
                round++;
            } while (round <= (numberLength / 2) - 1);

            if (isPalindrome) {
                System.out.println("The number is palindrome!");
            } else {
                System.out.println("The number is NOT palindrome!");
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
