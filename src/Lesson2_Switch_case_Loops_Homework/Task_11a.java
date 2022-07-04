import java.util.Scanner;

public class Task_11a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        //int stars = 1;
        //int spaces = number - 1;
        //int innerSpace = 1;
        for (int row = 1; row <= number; row++) {
            for (int space = 0; space < number - row; space++) {
                System.out.print(" ");
            }
            if (row == 1 || row == number) {
                for (int star = 0; star < 2 * row - 1; star++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int i = 0; i < 2 * row - 3; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                //innerSpace+=2;
            }
            System.out.println();
            //stars += 2;
            //spaces--;
        }
    }
}
