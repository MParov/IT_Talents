import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        int print = number - 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(print);
            }
            print += 2;
            System.out.println();
        }
    }
}
