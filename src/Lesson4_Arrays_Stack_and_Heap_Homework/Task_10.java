import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do {
            System.out.print("Please insert the length of array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert number " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
        }

        int middle = array.length / 2;

        if (array.length % 2 == 0) {
            System.out.println("Average value: " + (middle + 1) + ". Closest value: " + array[middle]);
        } else {
            System.out.println("Average value: " + (middle + 1) + ". Closest value: " + array[middle]);
        }
    }
}
