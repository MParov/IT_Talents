import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert number: ");
        int secondNumber = scanner.nextInt();

        int transit;

        if (secondNumber < firstNumber) {
            transit = secondNumber;
            secondNumber = firstNumber;
            firstNumber = transit;
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }
}
