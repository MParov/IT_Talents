import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number N: ");
        int min = scanner.nextInt();
        System.out.print("Please insert number M: ");
        int max = scanner.nextInt();
        int transit;
        if (max < min) {
            transit = min;
            min = max;
            max = transit;
        }
        if (min >= 10 && max <= 5555) {
            for (int i = max; i >= min; i--) {
                if (i % 50 == 0) {
                    if (i != 50) {
                        System.out.print(i + ",");
                    }else {
                        System.out.print(" "+i + "."); //I print literally as in the example: Изход: 200,150,100, 50.
                    }
                }
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}
