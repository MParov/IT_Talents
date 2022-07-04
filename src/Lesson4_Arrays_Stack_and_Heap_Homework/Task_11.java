import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do {
            System.out.print("Please insert the length of array, not less 7 numbers: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength < 7);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert number " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
        }

        int[] newArray = new int[2];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] >= 5) {
                counter++;
                if (newArray.length - 1 < counter) {
                    int[] transfer = new int[newArray.length * 2];
                    for (int j = 0; j < newArray.length; j++) {
                        transfer[j] = newArray[j];
                    }
                    newArray = transfer;
                }
                newArray[counter - 1] = array[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                System.out.print(newArray[i] + ", ");
            }
        }
        System.out.print("- " + counter + " numbers.");
    }
}
