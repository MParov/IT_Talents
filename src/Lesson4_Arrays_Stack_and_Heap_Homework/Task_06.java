import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength1;
        do {
            System.out.print("Please insert the length of first array: ");
            arrayLength1 = scanner.nextInt();
        } while (arrayLength1 <= 0);

        int arrayLength2;
        do {
            System.out.print("Please insert the length of second array: ");
            arrayLength2 = scanner.nextInt();
        } while (arrayLength2 <= 0);

        int[] array1 = new int[arrayLength1];
        int[] array2 = new int[arrayLength2];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Please insert element " + (i + 1) + " for the first array: ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Please insert element " + (i + 1) + " for the second array: ");
            array2[i] = scanner.nextInt();
        }

        if (array1.length == array2.length) {
            boolean isEqual = true;
            for (int i = 0; i < array1.length; i++) {
                if(array1[i]!=array2[i]){
                    isEqual=false;
                    break;
                }
            }
            if(isEqual){
                System.out.println("The arrays are equals and with a same size!");
            }else{
                System.out.println("The arrays are NOT equals but with a same size!");
            }
        } else {
            System.out.println("The size of the two arrays is different!");
        }
    }
}
