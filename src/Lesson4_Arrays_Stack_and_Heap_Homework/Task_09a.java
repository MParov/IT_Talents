import java.util.Scanner;

public class Task_09a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do {
            System.out.print("Please insert arrays length: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert element " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
        }

        int transfer;
        for (int i = 0; i < array.length / 2; i++) {
            transfer = array[array.length - 1 - i];
            array[array.length - i - 1] = array[i];
            array[i] = transfer;
        }

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }
}
