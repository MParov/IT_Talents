import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert temperature: ");
        int t = scanner.nextInt();

        if (t < -100 || t > 100) {
            System.out.println("Invalid temperature!");
        } else {
            if (t < -20) {
                System.out.println("Icy cold!");
            } else if (t < 0) {
                System.out.println("Cold!");
            } else if (t < 15) {
                System.out.println("Coldly!");
            } else if (t < 25) {
                System.out.println("Warm!");
            } else {
                System.out.println("Hot!");
            }
        }
    }
}
