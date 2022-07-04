import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number A: ");
        int a = scanner.nextInt();
        System.out.print("Please insert number B: ");
        int b = scanner.nextInt();
        int transit;
        if (b < a) {
            transit = b;
            b = a;
            a = transit;
        }
        int sum = 0;

        for (int i = a; i <= b; i++) {
            int square = i * i;
            if (sum >= 200) {
                System.out.println("Break");
                break;
            } else if (square % 3 == 0) {
                System.out.print("skip 3, ");
            } else {
                System.out.print(square + ", ");
                sum += square;
            }
        }
    }
}
