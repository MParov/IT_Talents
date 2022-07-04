import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 200) {
            for (int i = number; i > 10; i--) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
