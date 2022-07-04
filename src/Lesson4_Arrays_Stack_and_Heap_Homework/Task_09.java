import java.util.Scanner;

public class Task_09 {
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

        int[] newArray = new int[array.length];

        for (int i = 0, old = array.length - 1; i < newArray.length && old >= 0; i++, old--) {
            newArray[i] = array[old];
        }
        for (int i = 0; i < newArray.length; i++) {
            if (i != newArray.length - 1) {
                System.out.print(newArray[i] + ", ");
            } else {
                System.out.print(newArray[i] + ".");
            }
        }
    }
}
