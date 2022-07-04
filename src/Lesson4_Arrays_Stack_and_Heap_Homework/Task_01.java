import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraysLength;

        do {
            System.out.print("Please insert positive length of array: ");
            arraysLength = scanner.nextInt();
        } while (arraysLength <= 0);

        int[] array = new int[arraysLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert element of the array: ");
            array[i] = scanner.nextInt();
        }

        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
        }
        System.out.print("The least number multiple of 3 is: " + minNumber);
    }
}
