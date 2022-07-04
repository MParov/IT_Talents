import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        //int stars = 1;
        //int spaces = number - 1;
        for (int row = 1; row <= number; row++) {
            for (int space = 0; space < number-row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2*row-1; star++) {
                System.out.print("*");
            }
            System.out.println();
            //stars += 2;
            //spaces--;
        }
    }
}
