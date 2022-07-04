import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Please insert length of the array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] primaryArray = new int[arrayLength];

        for (int i = 0; i < primaryArray.length; i++) {
            System.out.print("Please insert number of position " + (i + 1) + " of the array: ");
            primaryArray[i] = scanner.nextInt();
        }

        int[] secondaryArray = new int[primaryArray.length];

        secondaryArray[0] = primaryArray[0];
        secondaryArray[secondaryArray.length - 1] = primaryArray[primaryArray.length - 1];

        for (int first = 0, second = 1; first < primaryArray.length - 1 && second < secondaryArray.length - 1; first++, second++) {
            secondaryArray[second] = primaryArray[first] + primaryArray[first + 1];
        }
        for (int i = 0; i < secondaryArray.length; i++) {
            if (i != secondaryArray.length - 1) {
                System.out.print(secondaryArray[i] + ", ");
            } else {
                System.out.print(secondaryArray[i] + ".");
            }
        }
    }
}
