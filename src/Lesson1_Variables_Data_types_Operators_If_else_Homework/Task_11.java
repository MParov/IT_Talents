import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert 3 digits number: ");
        int number = scanner.nextInt();
        int basisNumber = number;
        if (number < 100 || number >= 1000) {
            System.out.println("Invalid number!");
        } else {
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number;

            if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
                System.out.println("Invalid number! There must be no zero in the number!");
            } else {
                if (basisNumber % firstDigit == 0 && basisNumber % secondDigit == 0 && basisNumber % thirdDigit == 0) {
                    System.out.println("The given number is divided by each digit!");
                }else{
                    System.out.println("The given number is not divisible by each digit!");
                }
            }
        }
    }
}
