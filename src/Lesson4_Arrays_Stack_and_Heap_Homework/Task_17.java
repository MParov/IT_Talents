import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do {
            System.out.print("Please insert length of the array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert number " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
        }

        boolean isZigZag = true;

        for (int i = 1; i < array.length - 1; i++) {
            boolean biggerThenNeighbours = array[i] > array[i - 1] && array[i] > array[i + 1];
            boolean smallerThenNeighbours = array[i] < array[i - 1] && array[i] < array[i + 1];
            if (!(biggerThenNeighbours || smallerThenNeighbours)) {
                isZigZag = false;
                break;
            }
        }

        if (isZigZag && array[0] < array[1]) {
            System.out.println("Fulfills the requirements for a zigzag up array!");
        } else if (isZigZag && array[0] > array[1]) {
            System.out.println("Fulfills the requirements for a zigzag down array!");
        } else {
            System.out.println("Does NOT meet the requirements for a zigzag array!");
        }
    }
}
