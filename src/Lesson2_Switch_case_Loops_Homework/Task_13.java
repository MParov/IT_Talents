import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();
        for (int i = 100; i < 1000; i++) {
            int middleSum = i;
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                int digit = middleSum % 10;
                middleSum /= 10;
                sum += digit;
            }
            if (number == sum){
                System.out.println(i);
            }
        }
    }
}
