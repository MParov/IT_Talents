import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do {
            System.out.print("Please insert length of the array. At least 3 numbers: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength < 3);

        double[] array = new double[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert number " + (i + 1) + " of the array: ");
            array[i] = scanner.nextDouble();
        }

        double[] copy = new double[array.length];

        for (int i = 0; i < copy.length; i++) {
            if (array[i] < 0) {
                copy[i] = array[i] * -1;
            } else {
                copy[i] = array[i];
            }
        }
        double firstMax = -1;
        int indexFirstMax = 0;
        double secondMax = -1;
        int indexSecondMax = 0;
        double thirdMax = -1;
        int indexThirdMax = 0;

        for (int i = 0; i < copy.length; i++) {
            if (firstMax < copy[i]) {
                firstMax = copy[i];
                indexFirstMax = i;
            }
        }
        for (int i = 0; i < copy.length; i++) {
            if (secondMax < copy[i] && copy[i] < firstMax) {
                secondMax = copy[i];
                indexSecondMax = i;
            }
        }
        for (int i = 0; i < copy.length; i++) {
            if (thirdMax < copy[i] && copy[i] < secondMax) {
                thirdMax = copy[i];
                indexThirdMax = i;
            }
        }
        System.out.print("The numbers are: " + array[indexThirdMax] + "; " + array[indexSecondMax] + "; " + array[indexFirstMax]);
    }
}
