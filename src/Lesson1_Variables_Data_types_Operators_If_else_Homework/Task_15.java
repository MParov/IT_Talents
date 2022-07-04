import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert hour: ");
        int hour = scanner.nextInt();

        if (hour < 0 || hour > 24) {
            System.out.println("Invalid hour!");
        } else {
            if (hour >= 4 && hour < 9) {
                System.out.println("Good morning!");
            } else if (hour >= 9 && hour < 18) {
                System.out.println("Good day!");
            } else {
                System.out.println("Good evening!");
            }
        }
    }
}
