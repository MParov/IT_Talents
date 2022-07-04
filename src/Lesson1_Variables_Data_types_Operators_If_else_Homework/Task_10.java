import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert volume: ");
        int volume = scanner.nextInt();

        if (volume < 10 || volume > 9999) {
            System.out.println("Invalid volume!");
        } else {
            int percentageDivided = volume % 5;
            int integerDivided = volume / 5;
            int threeLitersBox = integerDivided;
            int twoLitersBox = integerDivided;
            boolean additionalTwoLitersBox = false;
            boolean additionalThreeLitersBox = false;

            if (percentageDivided == 1) {
                twoLitersBox++;
            } else if (percentageDivided == 4) {
                threeLitersBox++;
            } else if (percentageDivided == 2) {
                additionalTwoLitersBox = true;
            } else if (percentageDivided == 3) {
                additionalThreeLitersBox = true;
            }

            System.out.println(twoLitersBox + " 2 liter boxes, " + threeLitersBox + " 3 liter boxes.");
            if (additionalThreeLitersBox) {
                System.out.println("Additional 3 liter box.");
            } else if (additionalTwoLitersBox) {
                System.out.println("Additional 2 liter box.");
            }
        }
    }
}
