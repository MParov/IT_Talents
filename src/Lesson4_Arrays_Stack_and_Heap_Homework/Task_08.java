import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Please insert length of the array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert element " + (i + 1) + " of the array: ");
            array[i] = scanner.nextInt();
        }

        int currentCounter = 1;
        int currentMember = array[0];
        int counter = 0;
        int member = 0;

        for (int i = 1; i < array.length; i++) {
            if (currentMember == array[i]) {
                currentCounter++;
            } else if (currentCounter > counter) {
                counter = currentCounter;
                member = currentMember;
                currentCounter = 1;
                currentMember = array[i];
            }
        }
        if (currentCounter > counter) {
            counter = currentCounter;
            member = currentMember;
        }

        System.out.print("The longest series in the array is: ");
        for (int i = 0; i < counter; i++) {
            if (i != counter - 1) {
                System.out.print(member + ", ");
            } else {
                System.out.print(member + ".");
            }
        }
    }
}
