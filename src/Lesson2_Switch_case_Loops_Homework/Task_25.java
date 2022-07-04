import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            long result = 1L;
            int counter = 1;
            do {
                result *= counter;
                counter++;
            }
            while (counter <= number);

            System.out.println(result);
        } else {
            System.out.println("Please insert positive number!");
        }
    }
}
