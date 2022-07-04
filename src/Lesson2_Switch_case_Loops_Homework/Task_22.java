import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 1000) {
            int stopCounter = 1;
            while (stopCounter <= 10) {
                if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                    if (stopCounter == 1) {
                        System.out.print(stopCounter + ":" + number + "; "); // Identical print: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
                    } else if (stopCounter < 10) {
                        System.out.print(stopCounter + ":" + number + ", ");
                    } else {
                        System.out.print(stopCounter + ":" + number);
                        break;
                    }
                    stopCounter++;
                }
                number++;
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
