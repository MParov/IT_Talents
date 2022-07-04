import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        while (number > 1) {

            if (number % 2 == 0) {
                number *= 0.5;
                if (number != 1) {
                    System.out.print(number + " ");
                } else {
                    System.out.print(number + ".");
                }
            } else {
                number = 3 * number + 1;
                if (number != 1) {
                    System.out.print(number + " ");
                } else {
                    System.out.print(number + ".");
                }
            }
        }
    }
}
