import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert number A: ");
        int a = scanner.nextInt();
        System.out.print("Please insert number B: ");
        int b = scanner.nextInt();

        if (a < 10 || a > 99) {
            System.out.println("Invalid number A!");
        } else if (b < 10 || b > 99) {
            System.out.println("Invalid number B!");
        } else {
            int number = a * b;
            int lastDigit = number % 10;
            System.out.println("Tte last digit is: " + lastDigit);
            if (number % 2 == 0) {
                System.out.println("Even!");
            } else {
                System.out.println("Odd!");
            }
        }
    }
}
