import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0) {

            int sum = 0;

            do {
                sum += number;

                number--;
            } while (number != 0);

            System.out.println(sum);

        } else {
            System.out.println("Invalid number!");
        }
    }
}
