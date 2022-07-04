import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert hour: ");
        int hour = scanner.nextInt();
        System.out.print("Please insert money: ");
        double money = scanner.nextDouble();
        System.out.print("Please insert Am I Healthy or not: ");
        boolean amIHealthy = scanner.nextBoolean();

        if (!amIHealthy) {
            System.out.println("I will stay at home!");
            if (money > 0) {
                System.out.println("I will buy medicine!");
            } else if (money <= 0) {
                System.out.println("I will stay at home and drink tea!");
            }
        } else if (amIHealthy) {
            if (money >= 10) {
                System.out.println("I will go to the cinema with friends!");
            } else if (money > 0 && money < 10) {
                System.out.println("I will go for coffee!");
            }
        }
    }
}
