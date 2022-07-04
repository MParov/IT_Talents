import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("The sum is: " + sum);
        }else {
            int sum = 0;

            for (int i = 1; i >= number; i--) {
                sum += i;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}
