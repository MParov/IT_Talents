import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number < 1000 || number >= 10000) {
            System.out.println("Invalid coordinates!");
        } else {
            int forthDigit = number % 10;
            number /= 10;
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number;

            if (firstDigit < 1 || firstDigit > 8 || secondDigit < 1 || secondDigit > 8 || thirdDigit < 1 || thirdDigit > 8 || forthDigit < 1 || forthDigit > 8) {
                System.out.println("Invalid coordinates!");
            } else {
                int sumFirstSecondDigit = firstDigit + secondDigit;
                int sumThirdForthDigit = thirdDigit + forthDigit;
                boolean equals = false;


                if (sumFirstSecondDigit % 2 == 0 && sumThirdForthDigit % 2 == 0 || sumFirstSecondDigit % 2 != 0 && sumThirdForthDigit % 2 != 0) {
                    equals = true;
                }
                if (equals) {
                    System.out.println("The positions are with the same color.");
                } else {
                    System.out.println("The positions are with different color.");
                }
            }
        }
    }
}
