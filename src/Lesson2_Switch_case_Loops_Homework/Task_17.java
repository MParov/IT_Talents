import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        System.out.print("Please insert divider: ");
        char divider = scanner.next().charAt(0);

        if (number >= 3 && number <= 20) {
            for (int row = 1; row <= number; row++) {
                if (row == 1 || row == number) {
                    for (int star = 0; star < number; star++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int i = 0; i < number - 2; i++) {
                        System.out.print(divider);
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
