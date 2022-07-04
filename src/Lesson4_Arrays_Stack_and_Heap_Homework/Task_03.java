import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert the first number of the array: ");
        int number = scanner.nextInt();

        int[] array = new int[10];
        array[0] = number;
        array[1] = number;

        int counter = 2;
        do {
            array[counter] = array[counter - 1] + array[counter - 2];
            counter++;
        } while (counter != 10);

        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }
}
