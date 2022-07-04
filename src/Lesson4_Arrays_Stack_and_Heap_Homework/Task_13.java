import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Please insert positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int[] array = new int[1];
        int counter = 0;
        while (number != 0) {
            int num = number % 2;
            array[counter] = num;
            counter++;
            if (counter == array.length && number != 1) {
                int[] transfer = new int[array.length + 1];
                for (int i = 0; i < array.length; i++) {
                    transfer[i] = array[i];
                }
                array = transfer;
            }
            number /= 2;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
