import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first number: ");
        int a1 = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int a2 = scanner.nextInt();
        System.out.print("Please insert third number: ");
        int a3 = scanner.nextInt();

        int transfer = a1;

        a1 = a2;
        a2 = a3;
        a3 = transfer;

        System.out.println(a1 + " " + a2 + " " + a3);
    }
}
