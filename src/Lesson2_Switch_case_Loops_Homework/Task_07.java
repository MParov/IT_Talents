import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i != number) {
                    System.out.print(i * 3 + ",");
                } else {
                    System.out.println(i * 3);
                }
            }
        }else {
            System.out.println("Invalid number!");
        }
    }
}
