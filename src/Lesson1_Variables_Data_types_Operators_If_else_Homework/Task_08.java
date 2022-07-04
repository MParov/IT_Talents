import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert 4 digits number: ");
        int number = scanner.nextInt();
        if (number >= 1000 && number < 10000) {

            int forthNumber = number % 10;
            number /= 10;
            int thirdNumber = number % 10;
            number /= 10;
            int secondNumber = number % 10;
            number /= 10;
            int firstNumber = number;

            int first = (firstNumber * 10) + forthNumber;
            int second = (secondNumber * 10) + thirdNumber;


            if (first > second) {
                System.out.println("Bigger (" + firstNumber + forthNumber + ">" + second + ")");
            } else if (first < second) {
                System.out.println("Less (" + first + "<" + second + ")");
            } else {
                System.out.println("Equal (" + first + "=" + second + ")");
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
