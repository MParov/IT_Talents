import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Please insert positive length of array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert element of array " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean isEqual = true;

        for (int forward = 0, back = array.length - 1; forward < array.length && back >= 0; forward++, back--)
            if (array[forward] != array[back]) {
                isEqual = false;
                break;
            }

        if (isEqual) {
            System.out.println("The array is mirrored!");
        } else {
            System.out.println("The array is NOT mirrored!");
        }
    }
}
